package kz.balalar.balalarcommentsservice.resources;

import kz.balalar.balalarcommentsservice.models.ArticleInfo;
import kz.balalar.balalarcommentsservice.models.Comment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentResource {

    @RequestMapping("/{commentId}")
    public Comment getCommentInfo(@PathVariable("commentId") String commentId) {
        return new Comment(commentId, "Comment test name", "Georgescu", "https://images.unsplash.com/photo-1562979314-bee7453e911c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80", "12 hours");

    }

    @RequestMapping("articles/{articleId}")
    public ArticleInfo getArticleInfo(@PathVariable("articleId") String articleId) {
        List<Comment> comments = Arrays.asList(
                new Comment("12", "Silk Rhodes", "Joji","https://images.unsplash.com/photo-1465961482777-c1070dfd906b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "13 minutes"),
                new Comment("3", "Tyler", "Igor","https://images.unsplash.com/photo-1524256702281-99517437b68d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "25 minutes"),
                new Comment("4", "Tower", "Trump","https://images.unsplash.com/photo-1518655061710-5ccf392c275a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "45 minutes"),
                new Comment("16", "Benjamin", "Franklin","https://images.unsplash.com/photo-1557846866-1044ce05700b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80", "13 minutes"),
                new Comment("34", "Nursultan", "Nazarbaev Abish","https://images.unsplash.com/photo-1465572089651-8fde36c892dd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60`", "26 minutes"),
                new Comment("57", "Carti", "Student Znaet","http://hdwpro.com/wp-content/uploads/2016/03/Boat-Full-HD-Wallpaper.jpg", "98 minutes")

        );
        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setArticleInfo(comments);
        return articleInfo;
    }
}
