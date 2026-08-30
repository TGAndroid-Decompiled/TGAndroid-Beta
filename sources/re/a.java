package re;

import com.google.android.gms.internal.cast.i4;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.FileLog;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c f43442a;

    public a(re.c r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: re.a.<init>(re.c, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.f43442a.f43446b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void close() {
        i4.h(this);
    }
}
