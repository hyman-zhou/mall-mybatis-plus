import com.csasc.store.Application;
import com.csasc.store.modules.pms.model.PmsProduct;
import com.csasc.store.modules.pms.service.PmsProductService;
import com.csasc.store.modules.ums.model.UmsPermission;
import com.csasc.store.modules.ums.service.UmsAdminService;
import com.csasc.store.modules.ums.service.UmsPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@EnableAutoConfiguration
public class MybatisTest {
    @Autowired
    PmsProductService productService;
    @Autowired
    UmsPermissionService umsPermissionService;
    @Autowired
    UmsAdminService umsAdminService;

    @Test
    public void test01(){
        List<PmsProduct> pmsProducts = productService.listAllProduct();
        for (PmsProduct product:pmsProducts){
            System.out.println(product.toString());
        }
    }
    @Test
    public void test02() {
        List<UmsPermission> permissionList = umsPermissionService.getPermissionList(3L);
        for (UmsPermission permission : permissionList) {
            System.out.println(permission.toString());
        }
    }
    @Test
    public void test03() {
        List<UmsPermission> permissionList = umsAdminService.getPermissionList(3L);
        for (UmsPermission permission : permissionList) {
            System.out.println(permission.toString());
        }
    }



}
