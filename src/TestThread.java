import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {
	public static void main(String[] args) { 
		ThreadCount tc = null; 
		ExecutorService es = Executors.newCachedThreadPool();//线程池 
		CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(es);
		for(int i=0;i<4;i++){
			tc = new ThreadCount(i+1); 
			cs.submit(tc); 
		} 
		es.shutdown(); // 添加结束，及时shutdown，不然主线程不会结束
		int total = 0; 
		for(int i=0;i<4;i++){ 
			try { 
				total+=cs.take().get();
			} catch (InterruptedException e) { 
			  e.printStackTrace();
			} catch (ExecutionException e) { 
			  e.printStackTrace(); 
			} 
		} 
			System.out.println(total);
		}
}
