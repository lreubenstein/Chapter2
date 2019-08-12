
public class Song {
	private String artist;
	private String title;
	private String notes;
	private String album;

	public Song(String singer, String name) {  //constructor
		// TODO Auto-generated constructor stub
		System.out.println("creating a song." + singer + name);
		artist = singer;
		title = name;
	}
	
	public void play(){
		System.out.println("tra la la");
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist(){	
		return artist;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my fight song");
		Song s1 = new Song("Queen", "We are the Champions");
		s1.play();
		System.out.println(s1.getTitle());
		Song s2 = new Song("Journey", "Don't stop believing.");
		System.out.println(s2.getArtist());
		System.out.println(s1.getArtist());

	}

}
