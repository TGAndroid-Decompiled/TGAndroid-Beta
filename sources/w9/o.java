package w9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import n7.z0;
import u2.o1;
public final class o {
    public final Context f45233a;
    public final r f45234b;
    public final o0.a f45235c;
    public z0 d;
    public z0 e;
    public m f45236f;
    public final u f45237g;
    public final ba.c h;
    public final s9.a f45238i;
    public final s9.a f45239j;
    public final ExecutorService f45240k;
    public final com.google.firebase.messaging.t f45241l;
    public final j f45242m;
    public final t9.a f45243n;
    public final l.d f45244o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l.d dVar) {
        this.f45234b = rVar;
        hVar.a();
        this.f45233a = hVar.f13534a;
        this.f45237g = uVar;
        this.f45243n = aVar;
        this.f45238i = aVar2;
        this.f45239j = aVar3;
        this.f45240k = executorService;
        this.h = cVar;
        this.f45241l = new com.google.firebase.messaging.t(executorService);
        this.f45242m = jVar;
        this.f45244o = dVar;
        System.currentTimeMillis();
        this.f45235c = new o0.a();
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.t tVar = oVar.f45241l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            oVar.d.o();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f45238i.a(new o1(10));
                    oVar.f45236f.g();
                    if (!bVar.d().f7560b.f382a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f45236f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f45236f.h(((TaskCompletionSource) ((AtomicReference) bVar.f7568i).get()).getTask());
                        nVar = new n(oVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    nVar = new n(oVar, 0);
                }
                tVar.k(nVar);
                return forException;
            } catch (Throwable th2) {
                tVar.k(new n(oVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.f45240k.submit(new u4.e(5, this, bVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e7);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}
