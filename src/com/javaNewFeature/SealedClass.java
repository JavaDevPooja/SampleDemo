package com.javaNewFeature;

sealed class F permits P, Q{
	
}

non-sealed class P extends F{
	
}

final class Q extends F{
	
}

class J extends P{
	
}

sealed interface K permits T{
	
}

non-sealed interface T extends K{
	
}


public class SealedClass {
	public static void main(String[] args) {
		
	}
}
