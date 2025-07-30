import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-transcription',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './transcription.html',
  styleUrl: './transcription.scss',
})
export class TranscriptionComponent {
  inputText = '';
  outputText = '';

  transcribe() {
    this.outputText = this.inputText.toUpperCase(); // à remplacer par appel backend
  }
}

