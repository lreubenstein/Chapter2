public class TVShow {
    private String name;
    private String network;
    private int numepisodes;
    private boolean isStreaming;
    private boolean isCrimeShow;

    public TVShow(String n, String net){
        name = n;
        network = net;
        numepisodes = 0;
        isStreaming = false;
    }
    public int addEpisode(){
        numepisodes++;
        return numepisodes;
    }
    public void moveToStreaming(String n){
        network = n;
        isStreaming = true;
    }
}
