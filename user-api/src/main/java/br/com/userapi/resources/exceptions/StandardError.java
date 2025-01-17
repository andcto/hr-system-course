package br.com.userapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class StandardError {
    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}
