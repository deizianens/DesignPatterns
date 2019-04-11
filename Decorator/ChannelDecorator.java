abstract class ChannelDecorator implements Channel { 
   protected Channel chn;

   public ChannelDecorator(Channel newChannel){
       chn = newChannel;
   }

    public String send(String str){
        return chn.send(str);
    }

    public String recv(String str){
        return chn.recv(str);
    }
}
