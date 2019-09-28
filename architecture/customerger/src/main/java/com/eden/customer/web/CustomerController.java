package com.eden.customer.web;

import com.eden.customer.service.ICustomerService;
import com.eden.customer.vo.CustomerModel;
import com.eden.customer.vo.CustomerQueryModel;
import com.eden.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "toAdd", method = RequestMethod.GET)
    public String toAdd() {
        return "customer/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("cm") CustomerModel cm) {

        customerService.create(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
    public String toUpdate(Model model, @PathVariable("customerUuid") int customerUuid) {

        CustomerModel cm = customerService.getByUuid(customerUuid);
        model.addAttribute("cm", cm);

        return "customer/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String post(@ModelAttribute("cm") CustomerModel cm) {

        customerService.update(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toDelete/{customerUuid}", method = RequestMethod.GET)
    public String toDelete(Model model, @PathVariable("customerUuid") int customerUuid) {

        CustomerModel cm = customerService.getByUuid(customerUuid);
        model.addAttribute("cm", cm);
        return "customer/delete";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String post(@PathVariable("customerUuid") int customerUuid) {

        customerService.delete(customerUuid);
        return "customer/success";
    }


    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(@PathVariable("queryJsonStr") String queryJson, @ModelAttribute("page")Page page) {

        CustomerQueryModel cqm=null;
        if(queryJson==null||queryJson.trim().length()==0){
            cqm=new CustomerQueryModel();
        }else {
            
        }

        return "customer/list";
    }


}
