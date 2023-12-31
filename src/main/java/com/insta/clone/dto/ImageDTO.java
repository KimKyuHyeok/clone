package com.insta.clone.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ImageDTO {
    private int id;
    private String content;
    private String postImageUrl;

    private int userId;
    private List<Integer> tagsId;
    private List<Integer> likesId;
    private List<Integer> commentsId;

    private LocalDateTime createDate;
}
