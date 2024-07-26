package com.example.falc.falctransciption.transcriptioncontroller;

import com.example.falc.models.TextRequest;
import com.example.falc.models.TextResponse;
import com.example.falc.services.TranscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transcription")
public class TranscriptionController {
    @Autowired
    private TranscriptionService transcriptionService;

    @PostMapping
    public ResponseEntity<TextResponse> transcribe(@RequestBody TextRequest request) {
        TextResponse response = transcriptionService.transcribe(request);
        return ResponseEntity.ok(response);
    }
}

