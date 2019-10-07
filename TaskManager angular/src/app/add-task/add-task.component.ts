import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private service: TaskserviceService) {
    
   }

    sendTask(data){
      this.service.addtask(data).subscribe();
    }
  



  ngOnInit() {
  }

}
