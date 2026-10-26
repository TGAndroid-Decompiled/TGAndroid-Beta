package x1;

import a8.gg;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b6.d;
import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t9.i;
public final class a implements Runnable {
    public static Handler f51286f;
    public final d e;
    public volatile int f51288b = 1;
    public final AtomicBoolean f51289c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f51287a = new b(this, new gg(this, 7));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        int i10 = 0;
        for (m mVar : dVar.f3663j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f3662i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f51286f == null) {
                    f51286f = new Handler(Looper.getMainLooper());
                }
                handler = f51286f;
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
