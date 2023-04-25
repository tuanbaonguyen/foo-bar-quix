import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Result } from './model/result';

// @Injectable({
//   providedIn: 'root'
// })
@Injectable()
export class FooBarQuixService {
private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  convertNumber(inputNumber:number): Observable<Result> {
    console.log('FooBarQuixService.convertNumber ' +  inputNumber);
    console.log(`${this.apiServerUrl}/foo-bar-quix/${inputNumber}`);
    return this.http.get<Result>(`${this.apiServerUrl}/foo-bar-quix/${inputNumber}`);
  }
}
