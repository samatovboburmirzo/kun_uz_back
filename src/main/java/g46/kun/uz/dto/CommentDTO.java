package g46.kun.uz.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class CommentDTO {
    private Integer id;

    @NotNull
    private Integer userId;
    @NotNull
    private Integer articleId;
    @NotBlank
    @Size(min = 10, max = 200)
    private String content;

    private LocalDateTime createdDate;


}
