package kz.balalar.balalarcommentsservice.models;

public class Comment {

    private String commentId;
    private String name;

    public Comment(String commentId, String name) {
        this.commentId = commentId;
        this.name = name;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
