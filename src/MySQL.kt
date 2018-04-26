import java.sql.*

fun main(args: Array<String>) {
    try {
        Class.forName("com.mysql.jdbc.Driver")
        val connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kantappc_zeist", "root", "")
        //Statement statement=connection.createStatement();
        if (connection != null) {
            print("Connected")
        } else {
            print("Not Connected")
        }
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
    } catch (e: SQLException) {
        e.printStackTrace()
    }

}

