package orderitem;

public class OrderItem {
		   private int detailsId;
		   private int proId;
		   private int amountInt;
		   private double amount;

		   public OrderItem(int detailsId, int proId, int amountInt, double amount) {
		      this.detailsId = detailsId;
		      this.proId = proId;
		      this.amountInt = amountInt;
		      this.amount = amount;
		   }

		   @Override
		   public String toString() {
		      return "OrderItem [detailsId=" + detailsId + ", proId=" + proId + ", amountInt=" + amountInt + ", amount=" + amount + "]";
		   }

		public int getDetailsId() {
			return detailsId;
		}

		public void setDetailsId(int detailsId) {
			this.detailsId = detailsId;
		}

		public int getProId() {
			return proId;
		}

		public void setProId(int proId) {
			this.proId = proId;
		}

		public int getAmountInt() {
			return amountInt;
		}

		public void setAmountInt(int amountInt) {
			this.amountInt = amountInt;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}
		

}
