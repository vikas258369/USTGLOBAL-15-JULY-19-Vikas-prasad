import { Component, OnInit } from '@angular/core';
import { DataServicesService } from '../data-services.service';

@Component({
  selector: 'app-view-task',
  templateUrl: './view-task.component.html',
  styleUrls: ['./view-task.component.css']
})
export class ViewTaskComponent implements OnInit {

  viewdata:any[]=[];
  constructor(private dataservice : DataServicesService) { 
     this.viewdata = dataservice.taskdata;
     console.log(this.viewdata);
  }

  delete(i){
    console.log(i);
   this.viewdata.splice(i,1,);
  }

  j:any="";
  update(i){
    
    this.j = i;
  }
  
  updatedata(taskdetail){
   this.viewdata[this.j]=taskdetail;
  }
  ngOnInit() {
  }

}
