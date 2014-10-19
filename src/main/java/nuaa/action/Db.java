package nuaa.action;

import java.sql.*;  
/** 
 * Created by IntelliJ IDEA. 
 * UserInfo: Anyx 
 * Date: 12-4-15 
 * Time: 下午4:44 
 * To change this template use File | Settings | File Templates. 
 */  
public class Db {  
    public static Connection createConnection(){  
        Connection conn=null;  
        String url="jdbc:mysql://localhost/test";  
        String username="root";  
        String password="fj";  
  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            conn= DriverManager.getConnection(url, username, password);  
        }catch (Exception e){  
            e.printStackTrace();  
        }  
        return conn;  
    }  
  
    public static PreparedStatement prepare(Connection conn, String sql){  
        PreparedStatement ps=null;  
  
        try{  
            ps=conn.prepareStatement(sql);  
        }catch (Exception e){  
            e.printStackTrace();  
        }  
        return ps;  
    }  
  
    public static void close(Connection conn){  
        if(conn == null){  
            return;  
        }  
        try{  
            conn.close();  
            conn=null;  
        }catch (Exception e){  
            e.printStackTrace();  
        }  
    }  
  
    public static void close(PreparedStatement ps){  
        try{  
            ps.close();  
            ps=null;  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
    }  
  
    public  static void close(ResultSet rs){  
        try{  
            rs.close();  
            rs=null;  
        }catch (Exception e){  
            e.printStackTrace();  
        }  
    }  
  
}  