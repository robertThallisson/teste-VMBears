import { Component } from '@angular/core';
import { AgenteService } from './services/agente.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  loading: boolean = false;
  constructor(
    private agenteService: AgenteService
  ) {

  }

  title = 'VMBears';

  selectedFile: any = null;

  agentes: any;


  onFileSelected(event: any) {
    this.loading = true;
    const form = new FormData();

    for (let i = 0; i < event.target.files.length; i++) {
      form.append('files', event.target.files[0]);
    }


    this.agenteService.sendFile(form).subscribe(
      value => {
        this.agentes = value;
        console.log(this.agentes);
        this.loading = false;
      },
      erro => {
        this.loading = false;
      }
    );
  }



}
