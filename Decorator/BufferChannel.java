public class BufferChannel extends ChannelDecorator{
    public BufferChannel(Channel newChannel){
        super(newChannel);
    }

    public String send(String str){
        return chn.send(str) + " usando Buffer Channel";
    }

    public String recv(String str){
        return chn.recv(str) + " usando Buffer Channel";
    }
}