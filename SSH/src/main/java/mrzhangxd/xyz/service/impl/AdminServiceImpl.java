package mrzhangxd.xyz.service.impl;

import mrzhangxd.xyz.dao.AdminDao;
import mrzhangxd.xyz.pojo.Admin;
import mrzhangxd.xyz.service.AdminService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AdminServiceImpl implements AdminService {

    /**
     * 注入
     */
    private AdminDao adminDao;
    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    /**
     * 登录的方法
     */
    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }
}
