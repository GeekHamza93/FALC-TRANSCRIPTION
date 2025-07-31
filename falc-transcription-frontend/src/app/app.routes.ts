import { Routes } from '@angular/router';
import { provideRouter } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadComponent: () =>
      import('./modules/transcription/transcription').then(
        (m) => m.TranscriptionComponent
      ),
  },
];
