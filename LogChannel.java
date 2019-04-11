public class LogChannel extends ChannelDecorator{
    public LogChannel(Channel newChannel){
        super(newChannel);
    }

    public String send(String str){
        return chn.send(str)+ " usando Log Channel";
    }

    public String recv(String str){
        return chn.recv(str) + " usando Log Channel";
    }
}