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
    public static Handler f48706f;
    public final d f48710e;
    public volatile int f48708b = 1;
    public final AtomicBoolean f48709c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f48707a = new b(this, new x(this, 8));

    public a(d dVar) {
        this.f48710e = dVar;
    }

    public final void a() {
        d dVar = this.f48710e;
        int i10 = 0;
        for (m mVar : dVar.f317j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f316i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f48706f == null) {
                    f48706f = new Handler(Looper.getMainLooper());
                }
                handler = f48706f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new e(6, this, obj));
    }

    @Override
    public final void run() {
        this.f48710e.b();
    }
}
