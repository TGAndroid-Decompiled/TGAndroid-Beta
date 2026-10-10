package x1;

import a6.d;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c5.x;
import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.v;
public final class a implements Runnable {
    public static Handler f50496f;
    public final d f50500e;
    public volatile int f50498b = 1;
    public final AtomicBoolean f50499c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f50497a = new b(this, new x(this, 8));

    public a(d dVar) {
        this.f50500e = dVar;
    }

    public final void a() {
        d dVar = this.f50500e;
        int i10 = 0;
        for (m mVar : dVar.f319j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f318i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f50496f == null) {
                    f50496f = new Handler(Looper.getMainLooper());
                }
                handler = f50496f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new v(7, this, obj));
    }

    @Override
    public final void run() {
        this.f50500e.b();
    }
}
