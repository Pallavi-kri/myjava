
class BookTrainTicket
{
	int totalSeats=10;
	synchronized void bookSeat(int seats)
	{
		if(totalSeats>=seats)
		{
			System.out.println(seats+" seats booked successfully.");
			totalSeats=totalSeats-seats;
			System.out.println("Seats left:"+totalSeats);
		}
		else
		{
			System.out.println("Sorry seats can't be booked.");
			System.out.println("Seats left:"+totalSeats);
		}
	}
}
public class SynchronizationEg extends Thread
{
	static BookTrainTicket b;
	int seats;
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args)
	{
		b=new BookTrainTicket();
		SynchronizationEg p=new SynchronizationEg();
		p.seats=7;
		p.start();

		SynchronizationEg q=new SynchronizationEg();
		q.seats=6;
		q.start();
	}
}