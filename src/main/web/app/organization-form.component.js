"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var organization_1 = require('./organization');
var OrganizationFormComponent = (function () {
    function OrganizationFormComponent() {
        this.model = new organization_1.Organization(1, 'VSO', '123dad2', '2016-08-11', 'Emo', 'Kokiche 14', '3000', 'Training', 'Training description');
        this.submitted = false;
    }
    OrganizationFormComponent.prototype.onSubmit = function () { this.submitted = true; };
    Object.defineProperty(OrganizationFormComponent.prototype, "diagnostic", {
        get: function () { return JSON.stringify(this.model); },
        enumerable: true,
        configurable: true
    });
    OrganizationFormComponent = __decorate([
        core_1.Component({
            selector: 'organization-form',
            templateUrl: 'app/organization-form.component.html'
        }), 
        __metadata('design:paramtypes', [])
    ], OrganizationFormComponent);
    return OrganizationFormComponent;
}());
exports.OrganizationFormComponent = OrganizationFormComponent;
//# sourceMappingURL=organization-form.component.js.map