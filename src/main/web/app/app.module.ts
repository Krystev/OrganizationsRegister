import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent }  from './app.component';
import { OrganizationFormComponent } from './organization-form.component';

@NgModule({
  imports:      [ BrowserModule, FormsModule ],
  declarations: [ AppComponent, OrganizationFormComponent ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }