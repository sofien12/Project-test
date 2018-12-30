import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import {DataTableModule} from "node_modules/angular-6-datatable";

@NgModule({
  declarations: [
    AppComponent,
    CreateCustomerComponent,
    CustomersListComponent,
    
  ],
  imports: [
    DataTableModule,
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
