package kyukyuhyou;

class   kyukyuhyo {
    public  static  void  main(String[] args) {
    	int  a, b ;
		System.out.println( " \t  九 九 の表を作る。" +
				" \n" );
		for (b=1 ; b<= 9 ; b++)  {
			for (a=1 ; a<= 9 ; a++) {

				System.out.print("  "+ a+ "*"+ b+"= "+ a*b +"\t");

			}
			System.out.println() ;
		}
    }
}