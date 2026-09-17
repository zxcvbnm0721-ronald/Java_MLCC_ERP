package COM;

public class Order1 {	
		//fields
		private int orderNo;//訂單編號
		private int unitPrice;//商品單價
		private int quantity;//購買數量
		private boolean member;//是否會員
		private double subtotal;//訂單小計
		private double discountRate;//折扣率
		private double discountAmount;//折扣金額
		private double total;//應付金額
		
		//constructors
		public Order1(int orderNo, int unitPrice, int quantity, boolean member) {
			super();
			this.orderNo = orderNo;
			this.unitPrice = unitPrice;
			this.quantity = quantity;
			this.member = member;
		}
			
		
			//methods
			void calculate() 
			{
			subtotal = unitPrice*quantity;
			if(member&&subtotal >= 3000)
			{				
				this.discountAmount=0.1;								
			}
			else if(member&&subtotal<3000)
			{
				this.discountAmount=0.05;
			}
			else if(!member&&subtotal>5000)
			{
				this.discountAmount=0.03;
			}
			else
			{
				this.discountAmount=0;				
			}
			
			this.discountAmount=subtotal*this.discountRate;
			this.total=this.subtotal-this.discountAmount;
		}
		void show() 
		{
			    System.out.println("===== 商品訂單結帳結果 ====="+
			"\n訂單編號："+orderNo+
			"\n商品單價:"+unitPrice+
			"\n數量:"+quantity+
			"\n會員:"+member+
			"\n訂單小計:"+subtotal+
			"\n折扣率:"+discountRate+
			"\n折扣金額:"+discountAmount+
			"\n應付金額:"+total);
		}
		
		String show2()
		{
			calculate();
			return "===== 商品訂單結帳結果 ====="+
					"\n訂單編號："+orderNo+
					"\n商品單價:"+unitPrice+
					"\n數量:"+quantity+
					"\n會員:"+member+
					"\n訂單小計:"+subtotal+
					"\n折扣率:"+discountRate+
					"\n折扣金額:"+discountAmount+
					"\n應付金額:"+total;
		}
		
		public int getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(int orderNo) {
			this.orderNo = orderNo;
		}

		public int getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(int unitPrice) {
			this.unitPrice = unitPrice;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public boolean isMember() {
			return member;
		}

		public void setMember(boolean member) {
			this.member = member;
		}

		public double getSubtotal() {
			return subtotal;
		}

		public void setSubtotal(double subtotal) {
			this.subtotal = subtotal;
		}

		public double getDiscountRate() {
			return discountRate;
		}

		public void setDiscountRate(double disdiscountRate) {
			this.discountRate = disdiscountRate;
		}

		public double getDiscountAmount() {
			return discountAmount;
		}

		public void setDiscountAmount(double discountAmount) {
			this.discountAmount = discountAmount;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}
		
		

		
		

	
}
