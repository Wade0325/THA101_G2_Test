package article_like;

public class article_like {

	private Integer replyLikeId;
	private Integer userId;
	private Integer articleReplyId;
	private Integer articleLikestatus;

	public article_like() {

	}

	public article_like(Integer replyLikeId, Integer userId, Integer articleReplyId, Integer articleLikestatus) {
		this.replyLikeId = replyLikeId;
		this.userId = userId;
		this.articleReplyId = articleReplyId;
		this.articleLikestatus = articleLikestatus;
	}

	public Integer getReplyLikeId() {
		return replyLikeId;
	}

	public void setReplyLikeId(Integer replyLikeId) {
		this.replyLikeId = replyLikeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getArticleReplyId() {
		return articleReplyId;
	}

	public void setArticleReplyId(Integer articleReplyId) {
		this.articleReplyId = articleReplyId;
	}

	public Integer getArticleLikestatus() {
		return articleLikestatus;
	}

	public void setArticleLikestatus(Integer articleLikestatus) {
		this.articleLikestatus = articleLikestatus;
	}

}
