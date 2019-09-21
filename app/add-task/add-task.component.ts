import { Component, OnInit } from '@angular/core';
import { DataServicesService } from '../data-services.service';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private dataservice : DataServicesService) { }

  sendtask(addtask){
    this.dataservice.taskdata.push(addtask);
  }
  ngOnInit() {
  }

}
