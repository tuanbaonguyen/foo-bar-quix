import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  convertForm = {} as FormGroup;
  public convertedResults : any = [];

  @Output() submitNumberOutput: EventEmitter<number> =   new EventEmitter();

  constructor(
    private formBuilder: FormBuilder
  ) {

  }

  ngOnInit(): void {
    this.createConvertForm();
  }

  createConvertForm() {
		this.convertForm = this.formBuilder.group({
			inputNumber: ['', Validators.required]
		});
	}

	onSubmit() : void {
	  this.submitNumberOutput.emit(this.convertForm.value.inputNumber);
	}
}
