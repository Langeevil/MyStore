package br.com.gabrielsiqueira.MyStore.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomExceptionResponse {

    private Date timeStamp;
    private String message;
    private String details;

}
