package com.example.falc.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TextResponse
{
    private String originalText;
    private String transcribedText;
}
