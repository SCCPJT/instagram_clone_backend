package our.yurivongella.instagramclone.controller.dto.comment;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import our.yurivongella.instagramclone.controller.dto.post.CommentResponseDto;

@Getter
@Setter
@NoArgsConstructor
public class CommentList {
    List<CommentResponseDto> commentResponseDtos = new ArrayList<>();
}
