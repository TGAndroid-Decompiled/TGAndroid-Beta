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
import u2.l0;
public final class p {
    public final Context f48981a;
    public final s f48982b;
    public final o0.a f48983c;
    public z0 d;
    public z0 f48984e;
    public n f48985f;
    public final v f48986g;
    public final ba.c h;
    public final s9.a f48987i;
    public final s9.a f48988j;
    public final ExecutorService f48989k;
    public final com.google.firebase.messaging.s f48990l;
    public final j f48991m;
    public final t9.a f48992n;
    public final l2.g f48993o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l2.g gVar) {
        this.f48982b = sVar;
        hVar.a();
        this.f48981a = hVar.f14715a;
        this.f48986g = vVar;
        this.f48992n = aVar;
        this.f48987i = aVar2;
        this.f48988j = aVar3;
        this.f48989k = executorService;
        this.h = cVar;
        this.f48990l = new com.google.firebase.messaging.s(executorService);
        this.f48991m = jVar;
        this.f48993o = gVar;
        System.currentTimeMillis();
        this.f48983c = new o0.a();
    }

    public static Task a(p pVar, da.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.f48990l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7924e).get())) {
            pVar.d.o();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f48987i.a(new l0(12));
                    pVar.f48985f.g();
                    if (!bVar.d().f8176b.f411a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f48985f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f48985f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8186i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
                    forException = Tasks.forException(e7);
                    oVar = new o(pVar, 0);
                }
                sVar.l(oVar);
                return forException;
            } catch (Throwable th2) {
                sVar.l(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.f48989k.submit(new u4.e(5, this, bVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e7);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
