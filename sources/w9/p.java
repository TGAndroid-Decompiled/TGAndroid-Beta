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
    public final Context f48966a;
    public final s f48967b;
    public final o0.a f48968c;
    public z0 d;
    public z0 f48969e;
    public n f48970f;
    public final v f48971g;
    public final ba.c h;
    public final s9.a f48972i;
    public final s9.a f48973j;
    public final ExecutorService f48974k;
    public final com.google.firebase.messaging.s f48975l;
    public final j f48976m;
    public final t9.a f48977n;
    public final l2.g f48978o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l2.g gVar) {
        this.f48967b = sVar;
        hVar.a();
        this.f48966a = hVar.f14714a;
        this.f48971g = vVar;
        this.f48977n = aVar;
        this.f48972i = aVar2;
        this.f48973j = aVar3;
        this.f48974k = executorService;
        this.h = cVar;
        this.f48975l = new com.google.firebase.messaging.s(executorService);
        this.f48976m = jVar;
        this.f48978o = gVar;
        System.currentTimeMillis();
        this.f48968c = new o0.a();
    }

    public static Task a(p pVar, da.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.f48975l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7923e).get())) {
            pVar.d.o();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f48972i.a(new l0(12));
                    pVar.f48970f.g();
                    if (!bVar.d().f8175b.f411a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f48970f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f48970f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8185i).get()).getTask());
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
        Future<?> submit = this.f48974k.submit(new u4.e(5, this, bVar));
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
