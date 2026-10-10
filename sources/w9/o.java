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
    public final Context f50306a;
    public final r f50307b;
    public final b5 f50308c;
    public n6.t d;
    public n6.t f50309e;
    public m f50310f;
    public final u f50311g;
    public final ba.c h;
    public final s9.a f50312i;
    public final s9.a f50313j;
    public final ExecutorService f50314k;
    public final com.google.firebase.messaging.s f50315l;
    public final j f50316m;
    public final t9.a f50317n;
    public final g0 f50318o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, g0 g0Var) {
        this.f50307b = rVar;
        hVar.a();
        this.f50306a = hVar.f14747a;
        this.f50311g = uVar;
        this.f50317n = aVar;
        this.f50312i = aVar2;
        this.f50313j = aVar3;
        this.f50314k = executorService;
        this.h = cVar;
        this.f50315l = new com.google.firebase.messaging.s(executorService);
        this.f50316m = jVar;
        this.f50318o = g0Var;
        System.currentTimeMillis();
        this.f50308c = new b5();
    }

    public static Task a(o oVar, da.c cVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.f50315l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f7973e).get())) {
            oVar.d.C();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f50312i.a(new s0.b(27));
                    oVar.f50310f.g();
                    if (!cVar.d().f8228b.f409a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f50310f.d(cVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f50310f.h(((TaskCompletionSource) ((AtomicReference) cVar.f8238i).get()).getTask());
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
        Future<?> submit = this.f50314k.submit(new s4.v(6, this, cVar));
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
