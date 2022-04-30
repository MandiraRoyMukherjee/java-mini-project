package Controller;

import Dao.CustomerDAO;
import Models.Customer;

public class Studentcontroller {


    public Customer retrievecustomer(int customerid)
    {
      CustomerDAO cdao=new CustomerDAO();
        return cdao.getcustomer(customerid);
    }
    public String insertcustomer(Customer c) {

        int num=0;
           CustomerDAO cdao = new CustomerDAO();
            num = cdao.insertcustomer(c);
            if (num > 0)
                return "Record inserted succesfully +" +
                        "your customer id is " + " "+
                        c.getCustomerid();
            else
                return "Record insertion failed";

    }
}
