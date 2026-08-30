package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import h2.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.d;
import org.telegram.ui.yy;
public final class a implements Runnable {
    public static Handler f46640f;
    public final d e;
    public volatile int f46642b = 1;
    public final AtomicBoolean f46643c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f46641a = new b(this, new f(this, 10));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        int i10 = 0;
        for (m mVar : dVar.f16450j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f16449i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f46640f == null) {
                    f46640f = new Handler(Looper.getMainLooper());
                }
                handler = f46640f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new yy(11, this, obj));
    }

    @Override
    public final void run() {
        this.e.b();
    }
}
