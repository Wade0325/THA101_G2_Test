package article_comment;

import java.sql.Timestamp;

public class article_comment {

	private Integer articleReplyId;
	private Integer userId;
	private Integer articleId;
	private String name;
	private String replyContent;
	private Timestamp replyTime;
	private Timestamp replyUpdatetime;
	private Integer replyStatus;

	public article_comment() {

	}

	public article_comment(Integer articleReplyId, Integer userId, Integer articleId, String name, String replyContent,
			Timestamp replyTime, Timestamp replyUpdatetime, Integer replyStatus) {
		this.articleReplyId = articleReplyId;
		this.userId = userId;
		this.articleId = articleId;
		this.name = name;
		this.replyContent = replyContent;
		this.replyTime = replyTime;
		this.replyUpdatetime = replyUpdatetime;
		this.replyStatus = replyStatus;
	}

	public Integer getArticleReplyId() {
		return articleReplyId;
	}

	public void setArticleReplyId(Integer articleReplyId) {
		this.articleReplyId = articleReplyId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Timestamp getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}

	public Timestamp getReplyUpdatetime() {
		return replyUpdatetime;
	}

	public void setReplyUpdatetime(Timestamp replyUpdatetime) {
		this.replyUpdatetime = replyUpdatetime;
	}

	public Integer getReplyStatus() {
		return replyStatus;
	}

	public void setReplyStatus(Integer replyStatus) {
		this.replyStatus = replyStatus;
	}

}
