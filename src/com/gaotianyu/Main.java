package com.gaotianyu;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    static Connection conn;
    static Statement sta;
//    private static String dbUrl="jdbc:mysql://localhost:3306/test" ;
//    private static String dbUserName="root";
//    private static String dbPassword="forever16";
//    private static String jdbcName = "com.mysql.jdbc.Driver";
//    public static Properties getProperties() {
//        Properties props = new Properties();
//        InputStream is = null ;
//        try {
//            is = Main . class .getResourceAsStream("./jdbc_mysql.properties" ); // 按照参数路劲获得属性文件构造文件输入流
//            props.load(is); // 从输入流中读取属性表
//
//        } catch (Exception e1) {
//
//            e1.printStackTrace();
//            return null;
//
//        }
//        finally {
//            if (is != null ) {
//                try {
//                    is.close();
//                } catch (IOException e2) {
//
//                    e2.printStackTrace();
//                }
//            }
//        }
//        return props;
//    }
    public static Connection getConnection(){
        Connection con = null;  //创建用于连接数据库的Connection对象
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "forever16");// 创建数据连接

        } catch (Exception e) {
            System.out.println("数据库连接失败" + e.getMessage());
        }
        return con; //返回所建立的数据库连接
    }

    public static void main(String[] args) throws Exception{


//        try {
//            Class.forName(jdbcName);
//            System.out.println("驱动加载成功");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("驱动加载失败");
//        }
//
//        Connection con = null;
//        try {
//            con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
//            System.out.println("数据库连接成功");
//            System.out.println("下面进行操作");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                con.close();
//                System.out.println("已经释放");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        int port = 1107;
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        InputStream inputStream = socket.getInputStream();
        byte [] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        socket.close();
        server.close();
        // write your code here
    }
}
