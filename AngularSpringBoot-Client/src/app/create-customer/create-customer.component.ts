import { Component, OnInit } from '@angular/core';

import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { CustomersListComponent } from '../customers-list/customers-list.component';
import { CLEAN_PROMISE } from '@angular/core/src/render3/instructions';

@Component({
  selector: 'create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  customer: Customer = new Customer();
  submitted = false;
  

  constructor(private customerService: CustomerService,private CustomersList: CustomersListComponent) { }

  ngOnInit() {
  }

  newCustomer(): void {
    this.submitted = false;
    this.customer = new Customer();
    
  }

  save() {
    this.customerService.createCustomer(this.customer)
      .subscribe(data => console.log(data), error => console.log(error));
     
    this.customer = new Customer();
  }
  onSubmit() {
    this.submitted = true;
    this.save();
    this.CustomersList.ngOnInit();
  }
}
