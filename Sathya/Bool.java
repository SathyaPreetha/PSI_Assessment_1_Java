public class Bool{
	public static void main(String[] args){
		boolean arr[][]={{true,false,true},{false,true,false}};
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				if(arr[i][j]==true){
					System.out.print("t"+" ");}
				else{			
					System.out.print("f"+" ");}
				}
				System.out.println();
			}
		}
	}