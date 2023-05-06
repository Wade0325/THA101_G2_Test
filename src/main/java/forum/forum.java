package forum;

import java.sql.Timestamp;

public class forum {

	private Integer articleId;
	private Integer userId;
	private Integer articleGroupied;
	private String articleTitle;
	private String articleContent;
	private byte[] articleImage;
	private Timestamp articleCreatetime;
	private Timestamp modifierTime;
	private int articleStatus;

	public forum() {

	}

	public forum(Integer articleId, Integer userId, Integer articleGroupied, String articleTitle, String articleContent,
			byte[] articleImage, Timestamp articleCreatetime, Timestamp modifierTime, int articleStatus) {
		this.articleId = articleId;
		this.userId = userId;
		this.articleGroupied = articleGroupied;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.articleImage = articleImage;
		this.articleCreatetime = articleCreatetime;
		this.modifierTime = modifierTime;
		this.articleStatus = articleStatus;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getArticleGroupied() {
		return articleGroupied;
	}

	public void setArticleGroupied(Integer articleGroupied) {
		this.articleGroupied = articleGroupied;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public byte[] getArticleImage() {
		return articleImage;
	}

	public void setArticleImage(byte[] articleImage) {
		this.articleImage = articleImage;
	}

	public Timestamp getArticleCreatetime() {
		return articleCreatetime;
	}

	public void setArticleCreatetime(Timestamp articleCreatetime) {
		this.articleCreatetime = articleCreatetime;
	}

	public Timestamp getModifierTime() {
		return modifierTime;
	}

	public void setModifierTime(Timestamp modifierTime) {
		this.modifierTime = modifierTime;
	}

	public int getArticleStatus() {
		return articleStatus;
	}

	public void setArticleStatus(int articleStatus) {
		this.articleStatus = articleStatus;
	}

}
