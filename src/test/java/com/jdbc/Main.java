package com.jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.*;

import static java.lang.System.out;

/**
 * Created by Work on 03.04.2017.
 */
public class Main {

    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    private static final String URL="jdbc:mysql://localhost:3306/mysql?useSSL=false";

    public static void main(String [] args) throws SQLException {




        DBProcessor db=new DBProcessor();
        Connection connection=db.getConnection(URL ,USERNAME , PASSWORD);
       //-->list
                String query ="select * from business.accounts";
       //-->sum
                // String query ="select sum(Deposit_Amount) as 'total_money' from business.accounts";
       //-->count
                // String query ="select count(*) as 'total_accounts' from business.accounts ";
       //-->info account
                // String query ="select * from business.accounts where id_Account='0000 0000 0000 0002'";
       //-->info depositor
                // String query ="select * from business.accounts where id_Depositor='1'";
       //-->show type
                //String query ="select * from business.accounts where id_Type='1'";
       //-->show bank <name>
                //String query ="select * from business.accounts where name_Bank='Bank of America'";
      //-->add <deposit info>
                //String INSERT ="insert into business.accounts(id_Account, id_Depositor, id_Country, name_Bank, id_Type, Deposit_Amount, Profability, Start_Time_Deposit, Finish_Time_Deposit, id_Currency) values (?,?,?,?,?,?,?,?,?,?)";
            //PreparedStatement prepInsert  = connection.prepareStatement(INSERT);
                //prepInsert.setString(1,"0000 0000 0000 0007");
                //prepInsert.setInt(2,3);
                //prepInsert.setInt(3,3);
                //prepInsert.setString(4,"Bank of Australia");
                //prepInsert.setInt(5,4);
                //prepInsert.setDouble(6,69865413);
                //prepInsert.setString(7,"10");
                //prepInsert.setDate(8, "2016-07-23");
                //prepInsert.setDate(9, "2020-07-23");
                //prepInsert.setInt(10,3);
                //prepInsert.execute();



        PreparedStatement prepStat = connection.prepareStatement(query);
        ResultSet resSet = prepStat.executeQuery();



        while (resSet.next()){

         //-->list
                out.println(resSet.getString("id_Account")+"\t"+resSet.getInt("id_Depositor")+"\t"+resSet.getInt("id_Country")+"\t"+resSet.getString("name_Bank")+"\t"+resSet.getInt("id_Type")+"\t"+resSet.getDouble("Deposit_Amount")+"\t"+resSet.getString("Profability")+"\t"+resSet.getDate("Start_Time_Deposit")+"\t"+resSet.getDate("Finish_Time_Deposit")+"\t"+resSet.getInt("id_Currency") );
         //-->sum
                 // out.println(resSet.getString("total_money"));
         //-->count
                 // out.println(resSet.getString("total_accounts"));
         //-->info account
                 // out.println(resSet.getString("id_Account")+"\t"+resSet.getInt("id_Depositor")+"\t"+resSet.getInt("id_Country")+"\t"+resSet.getString("name_Bank")+"\t"+resSet.getInt("id_Type")+"\t"+resSet.getDouble("Deposit_Amount")+"\t"+resSet.getString("Profability")+"\t"+resSet.getDate("Start_Time_Deposit")+"\t"+resSet.getDate("Finish_Time_Deposit")+"\t"+resSet.getInt("id_Currency") );
         //-->info depositor
                // out.println(resSet.getString("id_Account")+"\t"+resSet.getInt("id_Depositor")+"\t"+resSet.getInt("id_Country")+"\t"+resSet.getString("name_Bank")+"\t"+resSet.getInt("id_Type")+"\t"+resSet.getDouble("Deposit_Amount")+"\t"+resSet.getString("Profability")+"\t"+resSet.getDate("Start_Time_Deposit")+"\t"+resSet.getDate("Finish_Time_Deposit")+"\t"+resSet.getInt("id_Currency") );
         //-->show type
               //out.println(resSet.getString("id_Account")+"\t"+resSet.getInt("id_Type"));
         //-->show bank <name>
               // out.println(resSet.getString("id_Account")+"\t"+resSet.getString("name_Bank"));
        }

        prepStat.close();
        connection.close();
    }
}
