package x1;

import a6.d;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c5.x;
import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import u4.e;
public final class a implements Runnable {
    public static Handler f44474f;
    public final d e;
    public volatile int f44476b = 1;
    public final AtomicBoolean f44477c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f44475a = new b(this, new x(this, 8));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        int i10 = 0;
        for (m mVar : dVar.f294j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f293i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f44474f == null) {
                    f44474f = new Handler(Looper.getMainLooper());
                }
                handler = f44474f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new e(6, this, obj));
    }

    @Override
    public final void run() {
        this.e.b();
    }
}
