class UDPChannel implements Channel {
    @Override
    public String send(String str){
        return "enviando " + str + " via UDP";
    }

    @Override
    public String recv(String str){
        return "recebendo " + str + " via UDP";
    }
}
