package credit_card;

import java.sql.Date;

public class creditCard {
	/**
	 * 右鍵->Source->Generate Getters and Setters可自動建立方法。 右鍵->Source->Generate
	 * Constructor using fields可自動建立建構子。 記得要手動新增一個空的建構子。
	 */
	private Integer cardId;
	private Integer userId;
	private String cardNumber;
	private String cardExpYear;
	private String cardExpMonth;
	private String cardholderName;
	private String cardAddr;
	private Date cardCreateTime;
	private Date cardModifyTime;

	public creditCard() {

	}

	public creditCard(Integer cardId, Integer userId, String cardNumber, String cardExpYear, String cardExpMonth,
			String cardholderName, String cardAddr, Date cardCreateTime, Date cardModifyTime) {
		this.cardId = cardId;
		this.userId = userId;
		this.cardNumber = cardNumber;
		this.cardExpYear = cardExpYear;
		this.cardExpMonth = cardExpMonth;
		this.cardholderName = cardholderName;
		this.cardAddr = cardAddr;
		this.cardCreateTime = cardCreateTime;
		this.cardModifyTime = cardModifyTime;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExpYear() {
		return cardExpYear;
	}

	public void setCardExpYear(String cardExpYear) {
		this.cardExpYear = cardExpYear;
	}

	public String getCardExpMonth() {
		return cardExpMonth;
	}

	public void setCardExpMonth(String cardExpMonth) {
		this.cardExpMonth = cardExpMonth;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public String getCardAddr() {
		return cardAddr;
	}

	public void setCardAddr(String cardAddr) {
		this.cardAddr = cardAddr;
	}

	public Date getCardCreateTime() {
		return cardCreateTime;
	}

	public void setCardCreateTime(Date cardCreateTime) {
		this.cardCreateTime = cardCreateTime;
	}

	public Date getCardModifyTime() {
		return cardModifyTime;
	}

	public void setCardModifyTime(Date cardModifyTime) {
		this.cardModifyTime = cardModifyTime;
	}

}
