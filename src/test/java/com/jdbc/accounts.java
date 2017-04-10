package com.jdbc;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Work on 06.04.2017.
 */
public class accounts  {
    private String id_Account;
    private int id_Depositor;
    private int id_Country;
    private String name_Bank;
    private int id_Type;
    private double Deposit_Amount;
    private String Profability;
    private java.util.Date Start_Time_Deposit;
    private java.util.Date Finish_Time_Deposit;
    private int id_Currency;

    public accounts(){}
    public accounts(String id_Account , int id_Depositor , int id_Country , String name_Bank , int id_Type , double Deposit_Amount, String Profability , java.util.Date Start_Time_Deposit , java.util.Date Finish_Time_Deposit , int id_Currency){
        this.id_Account=id_Account;
        this.id_Depositor=id_Depositor;
        this.id_Country=id_Country;
        this.name_Bank=name_Bank;
        this.id_Type=id_Type;
        this.Deposit_Amount=Deposit_Amount;
        this.Profability=Profability;
        this.Start_Time_Deposit=Start_Time_Deposit;
        this.Finish_Time_Deposit=Finish_Time_Deposit;
        this.id_Currency=id_Currency;
    }
    @Override
    public String toString(){
        return "accounts:["+id_Account+"\t"+id_Depositor+"\t"+id_Country+"\t"+name_Bank+"\t"+id_Type+"\t"+Deposit_Amount+"\t"+Profability+"\t"+Start_Time_Deposit+"\t"+Finish_Time_Deposit+"\t"+id_Currency+"\t'] ";
    }
}
