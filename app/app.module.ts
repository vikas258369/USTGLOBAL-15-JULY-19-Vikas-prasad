import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { ViewTaskComponent } from './view-task/view-task.component';
import { HeaderComponent } from './header/header.component';
import { from } from 'rxjs';
import { DataServicesService } from './data-services.service';

@NgModule({
  declarations: [
    AppComponent,
    AddTaskComponent,
    ViewTaskComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'AddTask',component:AddTaskComponent},
      {path:'ViewTask',component:ViewTaskComponent}
    ])
  ],
  providers: [DataServicesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
