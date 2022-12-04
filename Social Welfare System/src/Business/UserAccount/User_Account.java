/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import Business.Human.Person;
import Business.Role.Role;
import Business.WorkQueue.Work_Queue;

/**
 *
 * @author Makarand
 */
public class User_Account {
    
    private String username;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getHuman() {
        return Human;
    }

    public void setHuman(Person Human) {
        this.Human = Human;
    }
    private Person Human;
    private Role role;
    private Work_Queue workQueue;

    public User_Account() {
        workQueue = new Work_Queue();
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

    public Role getRole() {
        return role;
    }

    public void setEmployee(Person employee) {
        this.Human = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getEmployee() {
        return Human;
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}