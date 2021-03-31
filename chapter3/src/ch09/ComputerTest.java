package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new DeskTop();
		Computer desktop2 = new MyNoteBook();
		
		desktop.display();
		desktop.typing();
		desktop2.typing();
		desktop2.display();
	}
}
