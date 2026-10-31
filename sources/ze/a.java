package ze;

import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.f8;
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final c0 f55433a;

    public a(com.google.android.gms.internal.cast.c0 r8, java.util.concurrent.PriorityBlockingQueue r9) {
        throw new UnsupportedOperationException("Method not decompiled: ze.a.<init>(com.google.android.gms.internal.cast.c0, java.util.concurrent.PriorityBlockingQueue):void");
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f55433a.f4586c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final void close() {
        cf.b.j(this);
    }
}
