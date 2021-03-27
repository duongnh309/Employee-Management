/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author PC
 */
public class util {
    final static String DATE_FORMAT = "dd/MM/yyyy";

    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public static boolean isPhoneValid(String phone) {
        String regex = "^[0-9]{10}$";
        if (!phone.matches(regex)) {
            return false;
        }
        if (phone.isEmpty()) {
            return false;
        }
        return true;
    }
    public static boolean isEmailValid(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
    public static boolean isIDValid(String id) {
        String regex = "^[a-zA-Z0-9]*{10}$";
        if (!id.matches(regex)) {
            return false;
        }
        return true;
    }
}
