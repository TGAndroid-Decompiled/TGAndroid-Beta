package z1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b8.dg;
import c6.d;
import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import u9.k;
public final class a implements Runnable {
    public static Handler f59565f;
    public final d f59569e;
    public volatile int f59567b = 1;
    public final AtomicBoolean f59568c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f59566a = new b(this, new dg(this, 8));

    public a(d dVar) {
        this.f59569e = dVar;
    }

    public final void a() {
        d dVar = this.f59569e;
        int i3 = 0;
        for (m mVar : dVar.f4228j) {
            if (mVar.c(dVar)) {
                i3++;
            }
        }
        try {
            dVar.f4227i.tryAcquire(i3, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f59565f == null) {
                    f59565f = new Handler(Looper.getMainLooper());
                }
                handler = f59565f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new k(8, this, obj));
    }

    @Override
    public final void run() {
        this.f59569e.b();
    }
}
