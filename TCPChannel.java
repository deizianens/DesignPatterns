class TCPChannel implements Channel { 
    public String send(String str){
        return "enviando " + str + " via TCP";
    }
    public String recv(String str){
        return "recebendo " + str + " via TCP";
    }
}
