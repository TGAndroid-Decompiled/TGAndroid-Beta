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
    public final Context f48449a;
    public final r f48450b;
    public final z0 f48451c;
    public o0.a d;
    public o0.a f48452e;
    public m f48453f;
    public final u f48454g;
    public final ba.c h;
    public final s9.a f48455i;
    public final s9.a f48456j;
    public final ExecutorService f48457k;
    public final com.google.firebase.messaging.s f48458l;
    public final j f48459m;
    public final t9.a f48460n;
    public final g0 f48461o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, g0 g0Var) {
        this.f48450b = rVar;
        hVar.a();
        this.f48449a = hVar.f14882a;
        this.f48454g = uVar;
        this.f48460n = aVar;
        this.f48455i = aVar2;
        this.f48456j = aVar3;
        this.f48457k = executorService;
        this.h = cVar;
        this.f48458l = new com.google.firebase.messaging.s(executorService);
        this.f48459m = jVar;
        this.f48461o = g0Var;
        System.currentTimeMillis();
        this.f48451c = new z0(24);
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.f48458l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f6420e).get())) {
            oVar.d.p();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f48455i.a(new t0.a(19));
                    oVar.f48453f.g();
                    if (!bVar.d().f6674b.f408a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f48453f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f48453f.h(((TaskCompletionSource) ((AtomicReference) bVar.f6684i).get()).getTask());
                        nVar = new n(oVar, 0);
                    }
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
                    forException = Tasks.forException(e7);
                    nVar = new n(oVar, 0);
                }
                sVar.h(nVar);
                return forException;
            } catch (Throwable th2) {
                sVar.h(new n(oVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.f48457k.submit(new u4.e(5, this, bVar));
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
