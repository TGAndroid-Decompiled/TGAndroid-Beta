package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import h2.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.d;
import org.telegram.ui.zy;
public final class a implements Runnable {
    public static Handler f50266f;
    public final d f50270e;
    public volatile int f50268b = 1;
    public final AtomicBoolean f50269c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f50267a = new b(this, new f(this, 10));

    public a(d dVar) {
        this.f50270e = dVar;
    }

    public final void a() {
        d dVar = this.f50270e;
        int i10 = 0;
        for (m mVar : dVar.f16610j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f16609i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e6);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f50266f == null) {
                    f50266f = new Handler(Looper.getMainLooper());
                }
                handler = f50266f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new zy(10, this, obj));
    }

    @Override
    public final void run() {
        this.f50270e.b();
    }
}
