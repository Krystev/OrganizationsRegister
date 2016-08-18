import { Component } from '@angular/core';
import { Organization } from './organization'

@Component({
  selector: 'organization-form',
  templateUrl: 'app/organization-form.component.html'
})
export class OrganizationFormComponent { 

model = new Organization(1, 'VSO', '123dad2', '2016-08-11', 'Emo', 'Kokiche 14', '3000', 'Training', 'Training description');

submitted = false;

onSubmit() {this.submitted = true;}

get diagnostic() {return JSON.stringify(this.model);}
}