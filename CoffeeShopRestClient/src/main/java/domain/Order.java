package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private int id;
	private Date orderDate;
	private List<Orderline> orderLines = new ArrayList<Orderline>();
	private Person person;

	public int getId() {
		return id;
	}

	public List<Orderline> getOrderLines() {
		return orderLines;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void addOrderLine(Orderline orderLine) {
		orderLine.setOrder(this);
		this.orderLines.add(orderLine);
	}

	public void removeOrderLine(Orderline orderLine) {
		this.orderLines.remove(orderLine);
		orderLine.setOrder(null);
	}

	public void clearOrderLines() {
		for (Orderline orderline : orderLines) {
			orderline.setOrder(null);
		}
		orderLines.clear();
	}

}
