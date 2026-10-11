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
public final class o {
    public final Context f50349a;
    public final r f50350b;
    public final z0 f50351c;
    public n6.k d;
    public n6.k f50352e;
    public m f50353f;
    public final u f50354g;
    public final ba.c h;
    public final s9.a f50355i;
    public final s9.a f50356j;
    public final ExecutorService f50357k;
    public final com.google.firebase.messaging.s f50358l;
    public final j f50359m;
    public final t9.a f50360n;
    public final g0 f50361o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, g0 g0Var) {
        this.f50350b = rVar;
        hVar.a();
        this.f50349a = hVar.f14746a;
        this.f50354g = uVar;
        this.f50360n = aVar;
        this.f50355i = aVar2;
        this.f50356j = aVar3;
        this.f50357k = executorService;
        this.h = cVar;
        this.f50358l = new com.google.firebase.messaging.s(executorService);
        this.f50359m = jVar;
        this.f50361o = g0Var;
        System.currentTimeMillis();
        this.f50351c = new z0();
    }

    public static Task a(o oVar, da.c cVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.f50358l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7972e).get())) {
            oVar.d.D();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f50355i.a(new s0.b(29));
                    oVar.f50353f.g();
                    if (!cVar.d().f8227b.f409a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f50353f.d(cVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f50353f.h(((TaskCompletionSource) ((AtomicReference) cVar.f8237i).get()).getTask());
                        nVar = new n(oVar, 0);
                    }
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
                    forException = Tasks.forException(e7);
                    nVar = new n(oVar, 0);
                }
                sVar.k(nVar);
                return forException;
            } catch (Throwable th2) {
                sVar.k(new n(oVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.c cVar) {
        Future<?> submit = this.f50357k.submit(new s4.v(6, this, cVar));
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
