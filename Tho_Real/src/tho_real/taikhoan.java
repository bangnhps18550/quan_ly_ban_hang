/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tho_real;

/**
 *
 * @author Dell
 */
public enum taikhoan {
    User1("TruongThanhBinh","24112001","Trương Thị Thanh Bình"),
    User2("Admin01","2411","Trương Anh Thọ"),
    User3("Admin02","2411","Trương Thanh Bình");
     private String username;
     private String password;
     private String fullname;
     
     private taikhoan (String username,String password, String fullname ){
         this.username = username;
         this.password = password;
         this.fullname = fullname;
     }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    
}

