package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import f7.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.d;
import od.i;
public final class a implements Runnable {
    public static Handler f49979f;
    public final d f49983e;
    public volatile int f49981b = 1;
    public final AtomicBoolean f49982c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f49980a = new b(this, new p(this, 10));

    public a(d dVar) {
        this.f49983e = dVar;
    }

    public final void a() {
        d dVar = this.f49983e;
        int i10 = 0;
        for (m mVar : dVar.f16873j) {
            if (mVar.e(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f16872i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f49979f == null) {
                    f49979f = new Handler(Looper.getMainLooper());
                }
                handler = f49979f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new i(13, this, obj));
    }

    @Override
    public final void run() {
        this.f49983e.b();
    }
}
