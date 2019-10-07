import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';

@Component({
  selector: 'app-edit-task',
  templateUrl: './edit-task.component.html',
  styleUrls: ['./edit-task.component.css']
})
export class EditTaskComponent implements OnInit {

  TaskDetail:any[]=[];
  constructor(private service:  TaskserviceService) { 
    this.service.getTask().subscribe(resdata=>{
    this.TaskDetail = resdata.taskList;
    console.log(this.TaskDetail);
    })
  }

  delete(detail){
    console.log(detail);
    this.service.deletetask(detail).subscribe();
    alert("deleted");
  }

  

  updateTask(detail){
    this.service.updatetask(detail).subscribe();
  }
  ngOnInit() {
  }

}
