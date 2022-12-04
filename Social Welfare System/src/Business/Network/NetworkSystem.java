/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprises.EnterpriseMaindirectory;

/**
 *
 * @author Makarand
 */
public class NetworkSystem {
     private String name;
    private EnterpriseMaindirectory enterpriseDirectory;
    
    public NetworkSystem(){
        enterpriseDirectory=new EnterpriseMaindirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseMaindirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
