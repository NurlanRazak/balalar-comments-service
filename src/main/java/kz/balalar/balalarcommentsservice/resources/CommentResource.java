package kz.balalar.balalarcommentsservice.resources;

import kz.balalar.balalarcommentsservice.models.Comment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentResource {

    @RequestMapping("/{commentId}")
    public Comment getCommentInfo(@PathVariable("commentId") String commentId) {
        return new Comment(commentId, "Comment test name");

    }
}
