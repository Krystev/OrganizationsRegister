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
var platform_browser_dynamic_1 = require('@angular/platform-browser-dynamic');
var app_module_1 = require('./app.module');
platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(app_module_1.AppModule);
var angular2_1 = require('angular2/angular2');
var router_1 = require('angular2/router');
var http_1 = require('angular2/http');
var Application = (function () {
    function Application() {
        this.name = null;
    }
    Application.prototype.handleClick = function () {
        this.name = "Tito";
    };
    Application = __decorate([
        angular2_1.Component({
            selector: 'app',
            templateUrl: 'app/main.html',
            directives: [angular2_1.NgIf]
        }), 
        __metadata('design:paramtypes', [])
    ], Application);
    return Application;
}());
exports.Application = Application;
angular2_1.bootstrap(Application, [
    http_1.HTTP_PROVIDERS,
    router_1.ROUTER_PROVIDERS, angular2_1.provide(router_1.APP_BASE_HREF, { useValue: '/app/root' })
]);
//# sourceMappingURL=main.js.map