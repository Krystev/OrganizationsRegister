import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app.module';
platformBrowserDynamic().bootstrapModule(AppModule);
import {
    bootstrap, provide,
    Component,NgIf
} from 'angular2/angular2';
import {APP_BASE_HREF,ROUTER_PROVIDERS} from 'angular2/router';
import {HTTP_PROVIDERS} from 'angular2/http';

@Component({
    selector: 'app',
    templateUrl: 'app/main.html',
    directives: [NgIf]
})

export class Application {

    public name : String = null;

    public handleClick() : void {
        this.name = "Tito";
    }

}

bootstrap(Application,[
    HTTP_PROVIDERS,
    ROUTER_PROVIDERS,provide(APP_BASE_HREF,{useValue:'/app/root'})
]);