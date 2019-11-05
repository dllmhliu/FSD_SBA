import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Tranings } from '../Tranings';
import { CustomerService } from '../customer.service';


@Component({
  selector: 'app-completed-trainings',
  templateUrl: './completed-trainings.component.html',
  styleUrls: ['./completed-trainings.component.css']
})
export class CompletedTrainingsComponent implements OnInit {

  trainings: Observable<Tranings[]>;

  constructor(private customerService: CustomerService) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.trainings = this.customerService.getCompletedTrainings();
  }

}
