package x1;

import a6.d;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c5.y;
import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s9.i;
public final class a implements Runnable {
    public static Handler f49556f;
    public final d e;
    public volatile int f49558b = 1;
    public final AtomicBoolean f49559c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f49557a = new b(this, new y(this, 7));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        int i10 = 0;
        for (m mVar : dVar.f300j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f299i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f49556f == null) {
                    f49556f = new Handler(Looper.getMainLooper());
                }
                handler = f49556f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new i(6, this, obj));
    }

    @Override
    public final void run() {
        this.e.b();
    }
}
