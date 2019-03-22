package cn.tedu.object;

public class LianXiDemo1 {
	public static void main(String[] args) {
		
		Controller mp1 = new Controller(new DVDPlayer());
		Controller mp2 = new Controller(new CDPlayer());
		Controller mp3 = new Controller(new TapePlayer());
		mp1.play(0);
		mp1.stop(0);
		mp1.open(0);
		mp2.play(1);
		mp2.stop(1);
		mp2.open(1);
		mp3.play(2);
		mp3.stop(2);
		mp3.open(2);
	}

}
//����ӿ� MediaPlayer
interface MediaPlayer{
	//����
	public void play();
	//ֹͣ
	public void stop();
	//����
	public void open();
}
//DVDPlayer�����ʵ��MediaPlayer����ӿ�
class DVDPlayer implements MediaPlayer{
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD�������Ѳ���");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD��������ֹͣ");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("DVD�������ѿ���");
	}
	
}
class CDPlayer implements MediaPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD�������Ѳ���");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD��������ֹͣ");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("CD�������ѿ���");
	}
	
}
class TapePlayer implements MediaPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("¼�����Ѳ���");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("¼������ֹͣ");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("¼�����ѿ���");
	}
	
}
class Controller{
	private MediaPlayer[] players ;
	
	public MediaPlayer[] getPlayers() {
		return players;
	}
	public void setPlayers(MediaPlayer[] players) {
		this.players = players;
	}
	
	static int i = 0;
		
	
	//���췽���г�ʼ��players����
	public Controller(MediaPlayer mediaplayer){
		this.setPlayers(new MediaPlayer[3]);
		
		this.players[i++] = mediaplayer; 
	}
	//����Ӧ���豸����play����
	public void play(int i){
		players[i].play();
		
	}
	//stop
	public void stop(int i){
		players[i].stop();
	}
	//open
	public void open(int i){
		players[i].open();
	}
	
	
}