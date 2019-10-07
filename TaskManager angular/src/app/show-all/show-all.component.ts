import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';

@Component({
  selector: 'app-show-all',
  templateUrl: './show-all.component.html',
  styleUrls: ['./show-all.component.css']
})
export class ShowAllComponent implements OnInit {

  TaskDetail:any[]=[];
  constructor(private service:  TaskserviceService) { 
    this.service.getTask().subscribe(resdata=>{
    this.TaskDetail = resdata.taskList;
    console.log(this.TaskDetail);
    })
  }

  endtask(data){
    this.service.updatetask(data).subscribe();
    alert("task ended");
  }
  

 


  ngOnInit() {
  }

}
