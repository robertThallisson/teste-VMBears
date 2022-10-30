import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AgenteService {

  private baseUrl: string = 'http://localhost:8080'
  constructor(private http: HttpClient) { }


  sendFile(value: FormData) {
    return this.http.post(this.baseUrl + '/agente', value);
  }


}
