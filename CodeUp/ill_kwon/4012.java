import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main4012 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Integer totalNum=scan.nextInt();
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<totalNum;i++){
			int score=scan.nextInt();
			v.add(score);
		}
		Vector<Integer> v2=new Vector<Integer>();
		for(int i=0;i<totalNum;i++){
			v2.add(v.get(i));
		}
		Collections.sort(v2);
		Collections.reverse(v2);

		for(int i=0;i<totalNum;i++) {
			for(int j=0;i<totalNum;j++){
				if(v.get(i)==v2.get(j)) {
					System.out.println(v.get(i)+" "+(j+1));
					break;
				}
			}
		}
		
		scan.close();


	}

}
