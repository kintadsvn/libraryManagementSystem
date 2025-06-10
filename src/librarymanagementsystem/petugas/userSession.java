/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem.petugas;

/**
 *
 * @author cdhex
 */
public class userSession {
    private static String username;
    private static String email;
    private static String role;

    public static void setSession(String user, String mail, String rl) {
        username = user;
        email = mail;
        role = rl;
    }

    public static String getUsername() {
        return username;
    }

    public static String getEmail() {
        return email;
    }

    public static String getRole() {
        return role;
    }

    public static void clearSession() {
        username = null;
        email = null;
        role = null;
    }
}

