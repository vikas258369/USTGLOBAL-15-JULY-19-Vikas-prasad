import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {

  constructor(private http:HttpClient) { }

  getTask(){
    return this.http.get<any>(`http://localhost:8081/taskdetail/get-all`);
  }

addtask(data){
  return this.http.post(`http://localhost:8081/taskdetail/add`,data);
}



deletetask(id){
  console.log("service",id);
  return this.http.delete(`http://localhost:8081/taskdetail/remove/${id}`);
}

updatetask(data){
  return this.http.put(`http://localhost:8081/taskdetail/modify`,data);
}

}
