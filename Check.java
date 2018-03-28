package com.job.prep;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check ch = new Check();
		/*Boolean b = ch.ArrStrQ1("abcdefgh");
		System.out.println(b);*/
		
		/*Boolean b = ch.ArrStrQ4("ranger", "anergr");
		System.out.println(b);*/
		
		//System.out.println(ch.ArrStrQ5(" Gopal Kolli "));
		
		//For Q7
		/*int[][] numarr = {{1,2,3,4},{0,2,4,6},{5,8,0,2},{6,0,8,9}};
		for(int i=0; i<numarr.length;i++){
			System.out.println("");
		    for(int j=0;j<numarr[0].length;j++){
			System.out.print(Integer.toString(numarr[i][j])+" ");
		    }
		}
		int[][] resnumarr=ch.ArrStrQ7(numarr);
		System.out.println("============RESULT===========");
		
		for(int i=0; i<resnumarr.length;i++){
			System.out.println("");
		    for(int j=0;j<resnumarr[0].length;j++){
			System.out.print(Integer.toString(resnumarr[i][j])+" ");
		    }
		}*/
		
		//For Q6
		int[][] numarr = {{1,2,3,4},{0,2,4,6},{5,8,0,9},{0,4,7,5}};
		for(int i=0; i<numarr.length;i++){
			System.out.println("");
		    for(int j=0;j<numarr[0].length;j++){
			System.out.print(Integer.toString(numarr[i][j])+" ");
		    }
		}
		numarr = ch.ArrStr6(numarr);
		System.out.println("============RESULT===========");
		
		for(int i=0; i<numarr.length;i++){
			System.out.println("");
		    for(int j=0;j<numarr[0].length;j++){
			System.out.print(Integer.toString(numarr[i][j])+" ");
		    }
		}
		
		//ch.findComplement(1);
		
	}
	
	private Boolean ArrStrQ1(String s){
		int len = s.length();
		Boolean b = true;
		for(int i=0;i<len;i++){
			if(!b){
				break;
			}
			for(int j=i+1;j<len;j++){
				if(s.charAt(i)==s.charAt(j)){
					b=false;
					break;
				}
			}
		}
		return b;
	}
	
	private Boolean ArrStrQ4(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		
		Boolean anagrams=true;
		int[] chars1 = new int[256];
		int[] chars2 = new int[256];
		int len = s1.length();
		int i=0;
		
		for( i=0;i<len;i++){
			chars1[s1.charAt(i)]+=1;
		}
		
		for( i=0;i<len;i++){
			chars2[s2.charAt(i)]+=1;
		}
		
		for( i=0;i<len;i++){
			if(chars1[i]!=chars2[i]){
				anagrams=false;
			}
		}
		return anagrams;
		
	}
	
	
	
	private String ArrStrQ5(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				s = s.substring(0,i)+"%20"+s.substring(i+1);
				i=i+2;
			}
		}
		return s;
	}
	
	
	private int[][] ArrStrQ7(int[][] numarr){
		int rows = numarr.length;
		int cols = numarr[0].length;
		int[] rowflags = new int[rows];
		int[] colflags = new int[cols];
		int i = 0;
		
		for(i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(numarr[i][j]==0){
					rowflags[i]=1;
					colflags[j]=1;
				}
			}
		}
		
		for(i=0;i<rows;i++){
			if(rowflags[i]==1){
				for(int j=0;j<cols;j++){
					numarr[i][j]=0;
				}
			}
		}
		
		for(i=0;i<cols;i++){
			if(colflags[i]==1){
				for(int j=0;j<rows;j++){
					numarr[j][i]=0;
				}
			}
		}
		
		
		return numarr;
	}
	
	
	private int[][] ArrStr6(int[][] mat){
		int dim = mat.length;
		int temp1;
		int temp2;
		int temp3;
		int temp4;
		for(int j=0;j<dim/2;j++){
			for(int k=j;k<=dim-1-j;k++){
			temp1= mat[j][k];
			temp2= mat[k][dim-1];
			temp3= mat[dim-1][dim-1-k];
			temp4= mat[dim-1-k][j];
			
			mat[k][dim-1]=temp1;
			mat[dim-1][dim-1-k]=temp2;
			mat[dim-1-k][j]=temp3;
			mat[j][k]=temp4;
			
			}
		}
		return mat;
		
	}
	
	/*public int findComplement(int num) {
        String binstr=new String();
        if(num==1||num==0){
            binstr = Integer.toString(num)+binstr;
        }else{
        while(num!=0 && num!=1){
            binstr = Integer.toString(num%2)+binstr;
            num=num/2;
        }
        if(num==1||num==0){
            binstr = Integer.toString(num)+binstr;
        }
        }
        binstr = "1010";
        System.out.println(binstr);
        
        binstr.replaceAll("1","2");
        System.out.println(binstr);
        binstr.replaceAll("0","1");
        System.out.println(binstr);
        binstr.replaceAll("2","0");
        
        System.out.println(binstr);
        
        int newnum =0;
        for(int j=binstr.length()-1;j>=0;j--){
            if(binstr.charAt(j)=='1'){
                newnum += 2^(binstr.length()-1-j);
            }
        }
        return newnum;
    }*/
	
	

}
