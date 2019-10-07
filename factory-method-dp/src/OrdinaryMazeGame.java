
public class OrdinaryMazeGame extends MazeGame {

	@Override
	protected Room makeroom() {
		return new OrdinaryRoom();
	}

}
