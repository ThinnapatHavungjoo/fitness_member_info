package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class Start {
    public static void main(String[] data){
        var context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup {
       @Bean
       DriverManagerDataSource connect() {
           return new DriverManagerDataSource(source);
       }
       String source = "jdbc:mysql://127.0.0.1/fitnessdb?user=adminfitness1&password=admin123";
}

@Table("member_info")
class Member_info {
    @Id public int id;
    public String name;
    public char gender;
    public String style;
    public String email;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
        public char gender() {
        return this.gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
        public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
/*
@Table("member_info")
class Member_info {
    @Id public int id;
    public String first_name;
    public String last_name;
    public String nickname;
    public char gender;
    public double height;
    public double weight;
    public String style;
    public String email;
    
    public String getFirst_name() {
        return this.first_name;
    }
    
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    
    public String getlast_name() {
        return this.last_name;
    }
    
    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }
    
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public char gender() {
        return this.gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getStyle() {
        return this.style;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
*/
