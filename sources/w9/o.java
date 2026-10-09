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
import org.telegram.ui.ActionBar.b5;
public final class o {
    public final Context f50260a;
    public final r f50261b;
    public final b5 f50262c;
    public n6.t d;
    public n6.t f50263e;
    public m f50264f;
    public final u f50265g;
    public final ba.c h;
    public final s9.a f50266i;
    public final s9.a f50267j;
    public final ExecutorService f50268k;
    public final com.google.firebase.messaging.s f50269l;
    public final j f50270m;
    public final t9.a f50271n;
    public final g0 f50272o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, g0 g0Var) {
        this.f50261b = rVar;
        hVar.a();
        this.f50260a = hVar.f14747a;
        this.f50265g = uVar;
        this.f50271n = aVar;
        this.f50266i = aVar2;
        this.f50267j = aVar3;
        this.f50268k = executorService;
        this.h = cVar;
        this.f50269l = new com.google.firebase.messaging.s(executorService);
        this.f50270m = jVar;
        this.f50272o = g0Var;
        System.currentTimeMillis();
        this.f50262c = new b5();
    }

    public static Task a(o oVar, da.c cVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.f50269l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7973e).get())) {
            oVar.d.C();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f50266i.a(new s0.b(27));
                    oVar.f50264f.g();
                    if (!cVar.d().f8228b.f409a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f50264f.d(cVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f50264f.h(((TaskCompletionSource) ((AtomicReference) cVar.f8238i).get()).getTask());
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
        Future<?> submit = this.f50268k.submit(new s4.v(6, this, cVar));
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
