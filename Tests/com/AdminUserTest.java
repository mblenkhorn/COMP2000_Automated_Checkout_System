package com;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class AdminUserTest {
    @Test
    public void TestLoginCredentials()
    {
        AdminUser user = new AdminUser();
        user.userName = "Admin";
        user.password = "COMP2000";
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        String password = scanner.next();

        Assert.assertEquals(username, user.userName);
        Assert.assertEquals(password, user.password);
        System.out.print("Welcome " + username);
    }

    @Test
    public void CreateUser()
    {
        AdminUser user = new AdminUser();
        Scanner scanner = new Scanner(System.in);
        boolean isCreated;
        user.userName = "ADMIN";
        user.password = "COMP2000";
        String username = scanner.next();
        String password = scanner.next();

        if(username.equals(user.userName)  && password.equals(user.password)){
            isCreated = false;
        }else{
            isCreated = true;
        }

        Assert.assertTrue(username, isCreated);
    }




}