package com.assignment4.dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class Md5Hashing {

    public String getMd5(String input)
    {
        try {
 
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
        	System.out.println(e.getMessage());
        	System.out.println(e.getCause());
        	
            throw new RuntimeException(e);
        }
    }

    public String getMd5Int(int input)
    {
        try {
        	
        	// Convert the integer input to a string
            String inputStr = Integer.toString(input);
        	
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(inputStr.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            
            return hashtext;
        }
 
        catch (NoSuchAlgorithmException e) {
        	System.out.println(e.getMessage());
        	System.out.println(e.getCause());
        	
            throw new RuntimeException(e);
        }
    }
    
    
    //
    public void decrypt(String hashedPayroll) {
    	
    	int testPayroll = 1234;
    	
    	String testPayrollEncr = getMd5Int(testPayroll);
    	
    	System.out.println("Original Hashed Payroll: " + hashedPayroll);
    	System.out.println("New Hashed Payroll:      " + testPayrollEncr);
    	
    }
}