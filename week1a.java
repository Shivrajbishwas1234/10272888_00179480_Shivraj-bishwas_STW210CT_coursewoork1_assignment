class GFG{
	static void generate(int ones, int zeroes, String str, int len){
	if(len== str.length()){
	System.out.print(str +"");
	return;
	}
	generate(ones+1, zeroes, str +"1", len);
	if (ones> zeroes){
	generate(ones, zeroes +1, str+"0", len);
	}
}
public static void main (String[]args){
	String str ="";
	generate(5,6, 3, str,0);
	}
}