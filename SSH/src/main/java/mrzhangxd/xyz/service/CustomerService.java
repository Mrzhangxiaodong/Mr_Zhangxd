package mrzhangxd.xyz.service;

import mrzhangxd.xyz.pojo.Customer;
import mrzhangxd.xyz.pojo.PageBean;
import org.hibernate.criterion.DetachedCriteria;


public interface CustomerService {

    void save(Customer customer);

    Customer findById(int cid);

    void delete(Customer customer);

    void update(Customer customer);

    PageBean<Customer> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);

}
