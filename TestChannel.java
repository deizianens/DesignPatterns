public class TestChannel{
    public static void main(String[] args) {
        Channel nc = new ZipChannel(new TCPChannel());
        Channel nc2 = new BufferChannel(new UDPChannel());
        Channel nc3 = new LogChannel(new UDPChannel());
        Channel nc4 = new LogChannel(new TCPChannel());
        Channel nc5 = new ZipChannel(new LogChannel(new UDPChannel()));

        System.out.println("Zip: "+ nc.send("Olá Mundo"));
        System.out.println("Buffer: "+ nc2.send("Olá Mundo"));
        System.out.println("Log: "+ nc3.recv("Olá Mundo"));
        System.out.println("Log: "+ nc4.recv("Olá Mundo"));
        System.out.println("Zip, Log: "+ nc5.recv("Olá Mundo"));
    }
}