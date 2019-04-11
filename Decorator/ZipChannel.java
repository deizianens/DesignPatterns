public class ZipChannel extends ChannelDecorator{
    public ZipChannel(Channel newChannel){
        super(newChannel);
    }

    public String send(String str){
        return chn.send(str) + " usando Zip Channel";
    }

    public String recv(String str){
        return chn.recv(str) + " usando Zip Channel";
    }
}