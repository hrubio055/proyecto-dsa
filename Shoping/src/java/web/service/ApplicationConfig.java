/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author carlos
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(web.service.BrandsFacadeREST.class);
        resources.add(web.service.CategoriesFacadeREST.class);
        resources.add(web.service.CharacteristicsFacadeREST.class);
        resources.add(web.service.InventoryFacadeREST.class);
        resources.add(web.service.LikeProductsFacadeREST.class);
        resources.add(web.service.ModelFacadeREST.class);
        resources.add(web.service.OrderDetailsFacadeREST.class);
        resources.add(web.service.OrdesFacadeREST.class);
        resources.add(web.service.ProductsFacadeREST.class);
        resources.add(web.service.RolesFacadeREST.class);
        resources.add(web.service.UserFacadeREST.class);
    }
    
}
