package z9;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
public abstract class y {
    public static final ExecutorService f60263a;

    static {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new n.b(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new t(unconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f60263a = unconfigurableExecutorService;
    }

    public static void a(Task task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f60263a, new xg.c(countDownLatch, 6));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            task.getResult();
        } else if (!task.isCanceled()) {
            if (task.isComplete()) {
                throw new IllegalStateException(task.getException());
            }
            throw new TimeoutException();
        } else {
            throw new CancellationException("Task is already canceled");
        }
    }
}
