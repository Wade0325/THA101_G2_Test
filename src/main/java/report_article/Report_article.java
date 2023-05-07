package report_article;

import java.sql.Timestamp;

public class Report_article {
	private Integer reportId;
	private Integer userId;
	private Integer articleId;
	private Integer replyId;
	private Integer adminId;
	private Timestamp reportTime;
	private String reportReason;
	private String confirmCode;

	public Report_article() {
	}

	public Report_article(Integer reportId, Integer userId, Integer articleId, Integer replyId, Integer adminId,
			Timestamp reportTime, String reportReason, String confirmCode) {
		super();
		this.reportId = reportId;
		this.userId = userId;
		this.articleId = articleId;
		this.replyId = replyId;
		this.adminId = adminId;
		this.reportTime = reportTime;
		this.reportReason = reportReason;
		this.confirmCode = confirmCode;
	}

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
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

	public Integer getReplyId() {
		return replyId;
	}

	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Timestamp getReportTime() {
		return reportTime;
	}

	public void setReportTime(Timestamp reportTime) {
		this.reportTime = reportTime;
	}

	public String getReportReason() {
		return reportReason;
	}

	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}

	public String getConfirmCode() {
		return confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}
}
