/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Makarand
 */
public class HospitalEnterprises extends Enterprise{
     public HospitalEnterprises(String name){
        super(name,Enterprise.EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
