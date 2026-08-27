package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import e7.p;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.d;

public final class a implements Runnable {

    public static Handler f49324f;

    public final d f49328e;

    public volatile int f49326b = 1;

    public final AtomicBoolean f49327c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();

    public final b f49325a = new b(this, new p(this, 10));

    public a(d dVar) {
        this.f49328e = dVar;
    }

    public final void a() {
        d dVar = this.f49328e;
        Iterator it = dVar.f14473j.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((m) it.next()).d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f14472i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e9);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f49324f == null) {
                    f49324f = new Handler(Looper.getMainLooper());
                }
                handler = f49324f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new o0.m(9, this, obj));
    }

    @Override
    public final void run() {
        this.f49328e.b();
    }
}
