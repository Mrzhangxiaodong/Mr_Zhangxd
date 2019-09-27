package mrzhangxd.xyz.dao;

import mrzhangxd.xyz.pojo.Customer;
import mrzhangxd.xyz.pojo.PageBean;
import org.hibernate.criterion.DetachedCriteria;

public interface CustomerDao {

    Customer findById(int cid);

    void save(Customer customer);

    void delete(Customer customer);

    void update(Customer customer);

    PageBean<Customer> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
}
