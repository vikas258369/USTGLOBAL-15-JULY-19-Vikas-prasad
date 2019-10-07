import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule }  from '@angular/forms'

import { AppComponent } from './app.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { HomeComponent } from './home/home.component';
import { EditTaskComponent } from './edit-task/edit-task.component';
import { ShowAllComponent } from './show-all/show-all.component';
import { HeaderComponent } from './header/header.component';


import { HttpClient, HttpClientModule } from '@angular/common/http';
import { TaskserviceService } from './taskservice.service';

@NgModule({
  declarations: [
    AppComponent,
    AddTaskComponent,
    HomeComponent,
    EditTaskComponent,
    ShowAllComponent,
    HeaderComponent,
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path:"Home",component:HomeComponent},
      { path:"Addtask",component:AddTaskComponent},
       {path:"Edittask",component:EditTaskComponent},
       {path:"Showall",component:ShowAllComponent}
     ] )
  ],
  providers: [HttpClient,TaskserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
