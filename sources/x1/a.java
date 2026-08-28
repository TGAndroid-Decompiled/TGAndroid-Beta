package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import d7.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.d;
import org.telegram.ui.fm;
public final class a implements Runnable {
    public static Handler f48844f;
    public final d f48848e;
    public volatile int f48846b = 1;
    public final AtomicBoolean f48847c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f48845a = new b(this, new p(this, 10));

    public a(d dVar) {
        this.f48848e = dVar;
    }

    public final void a() {
        d dVar = this.f48848e;
        int i9 = 0;
        for (m mVar : dVar.f14652j) {
            if (mVar.d(dVar)) {
                i9++;
            }
        }
        try {
            dVar.f14651i.tryAcquire(i9, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f48844f == null) {
                    f48844f = new Handler(Looper.getMainLooper());
                }
                handler = f48844f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new fm(8, this, obj));
    }

    @Override
    public final void run() {
        this.f48848e.b();
    }
}
