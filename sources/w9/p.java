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
import k2.g0;
import n7.z0;
public final class p {
    public final Context f50498a;
    public final s f50499b;
    public final z0 f50500c;
    public n6.k d;
    public n6.k f50501e;
    public n f50502f;
    public final v f50503g;
    public final ba.c h;
    public final s9.a f50504i;
    public final s9.a f50505j;
    public final ExecutorService f50506k;
    public final com.google.firebase.messaging.s f50507l;
    public final j f50508m;
    public final t9.a f50509n;
    public final g0 f50510o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, g0 g0Var) {
        this.f50499b = sVar;
        hVar.a();
        this.f50498a = hVar.f14744a;
        this.f50503g = vVar;
        this.f50509n = aVar;
        this.f50504i = aVar2;
        this.f50505j = aVar3;
        this.f50506k = executorService;
        this.h = cVar;
        this.f50507l = new com.google.firebase.messaging.s(executorService);
        this.f50508m = jVar;
        this.f50510o = g0Var;
        System.currentTimeMillis();
        this.f50500c = new z0();
    }

    public static Task a(p pVar, da.c cVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.f50507l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7969e).get())) {
            pVar.d.C();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f50504i.a(new s0.b(29));
                    pVar.f50502f.g();
                    if (!cVar.d().f8225b.f411a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f50502f.d(cVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f50502f.h(((TaskCompletionSource) ((AtomicReference) cVar.f8235i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
                    forException = Tasks.forException(e7);
                    oVar = new o(pVar, 0);
                }
                sVar.k(oVar);
                return forException;
            } catch (Throwable th2) {
                sVar.k(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.c cVar) {
        Future<?> submit = this.f50506k.submit(new s4.v(6, this, cVar));
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
