package qb;

import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class h extends t7.m {
    public static final ThreadLocal f41566b = new ThreadLocal();
    public final ThreadPoolExecutor f41567a;

    public h() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                return defaultThreadFactory.newThread(new n(1, runnable));
            }
        });
        this.f41567a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f41566b.get();
        if (deque != null && deque.size() <= 1) {
            deque.add(runnable);
            if (deque.size() <= 1) {
                do {
                    runnable.run();
                    deque.removeFirst();
                    runnable = (Runnable) deque.peekFirst();
                } while (runnable != null);
                return;
            }
            return;
        }
        this.f41567a.execute(new n(0, runnable));
    }
}
