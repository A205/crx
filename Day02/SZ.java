
import java.util.*;
public class SZ {
	public void way(){
		int arr[][]=new int[20][5];
		Random rand=new Random();
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				arr[i][j]=rand.nextInt(100);
			}
		}
		System.out.println("            coreC++  coreHava  Servlet    JSP      EJB");
		for(i=0;i<arr.length;i++){
			System.out.print("��"+(i+1)+"ѧԱ�ĳɼ�");
			for(int d:arr[i])
				System.out.print("   "+d+"     ");
			System.out.println();
		}
		int all[]=new int[20];
		for(i=0;i<arr.length;i++){
			all[i]=arr[i][0]+arr[i][1]+arr[i][2]+arr[i][3]+arr[i][4];
		}
		System.out.print("ÿ��ѧԱ���ܷ֣�");
		for(int num1:all){
			System.out.print(num1+"   ");
		}
		System.out.println();
		int aver[]=new int[5];
		for(j=0;j<arr[i-1].length;j++){
			for(i=0;i<arr.length;i++){
				aver[j]=aver[j]+arr[i][j];
			}
			aver[j]=aver[j]/20;
		}
		System.out.print("ÿ�ſγ̵�ƽ����");
		for(int num2:aver){
			System.out.print(num2+"  ");
		}
	}
	public static void main(String[] args) {
		SZ p=new SZ();
		p.way();
	}

}
