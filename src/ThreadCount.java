import java.util.concurrent.Callable;


public  class ThreadCount implements Callable<Integer>{ 
	private int type;
    ThreadCount(int type){
	   this.type = type;
	}
   public Integer call() throws Exception { 
	   if(type==1){
		   System.out.println("C盘统计大小");
		   return 1; 
	   }else if(type==2){
		   Thread.sleep(20000); 
		   System.out.println("D盘统计大小"); 
		   return 2; 
	   }else if(type==3){
		   System.out.println("E盘统计大小"); 
		   return 3; 
	   }else if(type==4){
		   System.out.println("F盘统计大小"); 
		   return 4; 
	   }
	   return null; 
	}
}
