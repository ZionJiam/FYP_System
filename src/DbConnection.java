import java.sql.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DbConnection {

    public DbConnection() {
    }

    public boolean verifyUser(String username, String password) {
        
        try {
            // Load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Define Connection URL
            String connURL = "jdbc:mysql://localhost/db1?user=root&password=12345";
            // Establish connection to URL
            Connection conn = DriverManager.getConnection(connURL);
            // Create Statement object
            Statement stmt = conn.createStatement();
            // Execute SQL Command
            String sqlStr = "SELECT * FROM userfypsystem where username = ? AND passwordhash = ?";

            PreparedStatement pstmt = conn.prepareStatement(sqlStr);
            pstmt.setString(1, username);
            pstmt.setString(2, getSHA(password));

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                conn.close();
                return true;
            } else {
                conn.close();
                return false;
            }

        } catch (Exception e) {
            System.err.println("Error :" + e);
            return false;
        }

    }

    public static String getSHA(String input) {

        try {
            // Static getInstance method is called with hashing SHA 
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // digest() method called 
            // to calculate message digest of an input 
            // and return array of byte 
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value 
            String hashtext = no.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm does not exist");

            return null;
        }
    }
}
