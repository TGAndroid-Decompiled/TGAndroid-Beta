package x1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import h2.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.d;
import org.telegram.ui.zy;
public final class a implements Runnable {
    public static Handler f50230f;
    public final d f50234e;
    public volatile int f50232b = 1;
    public final AtomicBoolean f50233c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final b f50231a = new b(this, new f(this, 10));

    public a(d dVar) {
        this.f50234e = dVar;
    }

    public final void a() {
        d dVar = this.f50234e;
        int i10 = 0;
        for (m mVar : dVar.f16608j) {
            if (mVar.d(dVar)) {
                i10++;
            }
        }
        try {
            dVar.f16607i.tryAcquire(i10, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e6);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f50230f == null) {
                    f50230f = new Handler(Looper.getMainLooper());
                }
                handler = f50230f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new zy(10, this, obj));
    }

    @Override
    public final void run() {
        this.f50234e.b();
    }
}
