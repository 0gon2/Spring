package chap02_04_01;

public interface ErpClient {

	public void connect();

	public void close();

	public void sendPurchaseInfo(ErpOrderData oi);
}
