/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keygen_010editor;
import java.io.Serializable;
/**
 *
 * @author duytu
 */
public class Keygen_010editor implements Serializable
{

    private String user_name;
    private int day_expire;
    
    public Keygen_010editor(){}
    public Keygen_010editor(String user, int exDay)
    {
        this.user_name = user;
        this.day_expire = exDay;
    }

    public String getUser_name() {
        return user_name;
    }


    public int getDay_expire() {
        return day_expire;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setDay_expire(int day_expire) {
        this.day_expire = day_expire;
    }

    
}
