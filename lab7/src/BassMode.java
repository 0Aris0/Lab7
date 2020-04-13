//Name:Zhonghai Zhu
//	 Minghao Zhao

// Used to determine the Bass animation to use
public enum BassMode {

    DEFAULT("default"), CONFUSE("confuse"), ATTAC("attac"), STOP("default");

	private String name = null;
	
	private BassMode(String s){
		name = s;
	}

	public String getName() {
		return name;
	}
};
