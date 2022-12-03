/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organization.OrgDirectory;
import java.util.ArrayList;

/**
 *
 * @author Makarand
 */
public class EnterpriseMaindirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseMaindirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Creating enterprises
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new Hospitalenterprises(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.RehabCenters) {
            enterprise = new RehabEnterprises(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Drugstores) {
            enterprise = new DrugEnterprises(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Suppliers) {
            enterprise = new SuppliersEnterprises(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    //deleting enterprises
    public void deleteEnterprise(Enterprise enterprise) {
        enterpriseList.remove(enterprise);
    }
}
