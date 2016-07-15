package com.fengshan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Snow> list =Arrays.asList(new Crusty(),new Slush(),new Powder());
		List<Snow> list2=Arrays.asList(new Light());
		Collections.addAll(list2, new Light());
	}

}
class Snow{
	
}

class Powder extends Snow{
	
}

class Light extends Powder{
	
}

class Heavy extends Powder{
	
}

class Crusty extends Snow{
	
}
class Slush extends Snow{
	
}