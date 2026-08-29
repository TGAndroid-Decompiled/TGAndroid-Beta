package pe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.FileLog;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c f45718a;

    public a(pe.c r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: pe.a.<init>(pe.c, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.f45718a.f45722b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void close() {
        b9.b.h(this);
    }
}
