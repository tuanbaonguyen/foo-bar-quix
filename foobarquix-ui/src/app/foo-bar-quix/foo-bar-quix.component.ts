import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {
  public numbersConverted: NumberConverted[] = [];

  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    console.log(inputNumber);
    this.fooBarQuixService.convertNumber(inputNumber).subscribe((result: Result) =>
       {
        this.numbersConverted.push({"numberToConvert" : inputNumber, "result":result.result});
        console.log(this.numbersConverted);
       }
       );
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
