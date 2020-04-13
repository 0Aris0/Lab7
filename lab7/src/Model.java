//Name:Zhonghai Zhu
//	 Minghao Zhao

public class Model {
	int x = 0;
	int y = 0;
	int dx = 8;
	int dy = 2;
	Direction dir;
	int tmpx;
	int tmpy;
	static int imgWidth;
	static int imgHeight;
	static int canvasWidth;
	static int canvasHeight;
	BassMode bm;
	boolean ps=false;
	public Model(int Width, int Height, int imageWidth, int imageHeight) {
		canvasWidth = Width;
		canvasHeight = Height;
		imgWidth = imageWidth;
		imgHeight = imageHeight;
	}
	public void updateLocationandDirection() {
		tmpx=x+dx;
		tmpy=y+dy;
		if(bm == BassMode.ATTAC) {
			dx = 16;
			dy = 4;
		}
		else if(bm == BassMode.CONFUSE) {
			dx = 4;
			dy = 1;
			
		}
		else if(bm == BassMode.DEFAULT) {
			dx = 8;
			dy = 2;
		}
		else if (bm==BassMode.STOP) {
			dx=0;
			dy=0;
		}
		//get direction xIncr, yIncr correct
		switch(dir) {
		case NORTH:
			dx = 0;
			dy = -(dy);
			break;
		case SOUTH:
			dx = 0;
			break;
		case EAST:
			dy = 0;
			break;
		case WEST:
			dy = 0;
			dx = -(dx);
		case NORTHEAST:
			dy = -(dy);
			break;
		case NORTHWEST:
			dy = -(dy);
			dx = -(dx);
			break;
		case SOUTHWEST:
			dx = -(dx);
			break;
		}
		x += dx;
		y += dy;
		
		getDirection();
	}
	public Direction getDirection() {
		return dir;
	}
	
	public void updateBassModeAndDirection(BassMode b, Direction d) {
		bm = b;
		dir = d;
		
	}
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}
