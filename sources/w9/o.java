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
    public final Context f50383a;
    public final r f50384b;
    public final z0 f50385c;
    public n6.k d;
    public n6.k f50386e;
    public m f50387f;
    public final u f50388g;
    public final ba.c h;
    public final s9.a f50389i;
    public final s9.a f50390j;
    public final ExecutorService f50391k;
    public final com.google.firebase.messaging.s f50392l;
    public final j f50393m;
    public final t9.a f50394n;
    public final g0 f50395o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, g0 g0Var) {
        this.f50384b = rVar;
        hVar.a();
        this.f50383a = hVar.f14746a;
        this.f50388g = uVar;
        this.f50394n = aVar;
        this.f50389i = aVar2;
        this.f50390j = aVar3;
        this.f50391k = executorService;
        this.h = cVar;
        this.f50392l = new com.google.firebase.messaging.s(executorService);
        this.f50393m = jVar;
        this.f50395o = g0Var;
        System.currentTimeMillis();
        this.f50385c = new z0();
    }

    public static Task a(o oVar, da.c cVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.f50392l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7972e).get())) {
            oVar.d.D();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f50389i.a(new s0.b(29));
                    oVar.f50387f.g();
                    if (!cVar.d().f8227b.f409a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f50387f.d(cVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f50387f.h(((TaskCompletionSource) ((AtomicReference) cVar.f8237i).get()).getTask());
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
        Future<?> submit = this.f50391k.submit(new s4.v(6, this, cVar));
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
