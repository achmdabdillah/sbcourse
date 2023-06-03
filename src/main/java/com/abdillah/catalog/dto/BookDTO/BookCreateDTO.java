package com.abdillah.catalog.dto.BookDTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Data
public class BookCreateDTO {

    private String authorName;

    private String booktitle;

    private String description;
}