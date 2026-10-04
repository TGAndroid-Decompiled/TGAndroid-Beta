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
    public final Context f48965a;
    public final s f48966b;
    public final o0.a f48967c;
    public z0 d;
    public z0 f48968e;
    public n f48969f;
    public final v f48970g;
    public final ba.c h;
    public final s9.a f48971i;
    public final s9.a f48972j;
    public final ExecutorService f48973k;
    public final com.google.firebase.messaging.s f48974l;
    public final j f48975m;
    public final t9.a f48976n;
    public final l2.g f48977o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l2.g gVar) {
        this.f48966b = sVar;
        hVar.a();
        this.f48965a = hVar.f14714a;
        this.f48970g = vVar;
        this.f48976n = aVar;
        this.f48971i = aVar2;
        this.f48972j = aVar3;
        this.f48973k = executorService;
        this.h = cVar;
        this.f48974l = new com.google.firebase.messaging.s(executorService);
        this.f48975m = jVar;
        this.f48977o = gVar;
        System.currentTimeMillis();
        this.f48967c = new o0.a();
    }

    public static Task a(p pVar, da.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.f48974l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7923e).get())) {
            pVar.d.o();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f48971i.a(new l0(12));
                    pVar.f48969f.g();
                    if (!bVar.d().f8175b.f411a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f48969f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f48969f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8185i).get()).getTask());
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
        Future<?> submit = this.f48973k.submit(new u4.e(5, this, bVar));
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
