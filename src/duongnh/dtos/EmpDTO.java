/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnh.dtos;

import java.util.Vector;

/**
 *
 * @author PC
 */
public class EmpDTO {
    private String id ;
    private String name ;
    private String phone ;
    private String email ;
    private String address ;
    private String dob ;
    private boolean isDelete;

    public EmpDTO() {
    }

    public EmpDTO(String id, String name, String phone, String email, String address, String dob) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dob = dob;
    }

    public boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }
    public Vector toVector(){
        Vector v = new Vector();
        v.add(id);
        v.add(name);
        v.add(phone);
        v.add(email);
        return v;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
}
