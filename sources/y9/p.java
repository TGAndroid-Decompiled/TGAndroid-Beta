package y9;

import aa.b0;
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
import org.telegram.ui.Components.cy0;
public final class p {
    public final Context f52458a;
    public final s f52459b;
    public final l f52460c;
    public m4.c d;
    public m4.c e;
    public n f52461f;
    public final v f52462g;
    public final da.c h;
    public final u9.a f52463i;
    public final u9.a f52464j;
    public final ExecutorService f52465k;
    public final com.google.firebase.messaging.q f52466l;
    public final j f52467m;
    public final v9.a f52468n;
    public final t6.f f52469o;

    public p(m9.h hVar, v vVar, v9.a aVar, s sVar, u9.a aVar2, u9.a aVar3, da.c cVar, ExecutorService executorService, j jVar, t6.f fVar) {
        this.f52459b = sVar;
        hVar.a();
        this.f52458a = hVar.f18380a;
        this.f52462g = vVar;
        this.f52468n = aVar;
        this.f52463i = aVar2;
        this.f52464j = aVar3;
        this.f52465k = executorService;
        this.h = cVar;
        ?? obj = new Object();
        obj.f7758b = Tasks.forResult(null);
        obj.f7759c = new Object();
        obj.d = new ThreadLocal();
        obj.f7757a = executorService;
        executorService.execute(new cy0(obj, 21));
        this.f52466l = obj;
        this.f52467m = jVar;
        this.f52469o = fVar;
        System.currentTimeMillis();
        this.f52460c = new l();
    }

    public static Task a(p pVar, b0 b0Var) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.q qVar = pVar.f52466l;
        if (Boolean.TRUE.equals(((ThreadLocal) qVar.d).get())) {
            pVar.d.b();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f52463i.a(new vg.d(12));
                    pVar.f52461f.g();
                    if (!b0Var.d().f10371b.f6189a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f52461f.d(b0Var)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f52461f.h(((TaskCompletionSource) ((AtomicReference) b0Var.f1036i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    oVar = new o(pVar, 0);
                }
                qVar.F(oVar);
                return forException;
            } catch (Throwable th2) {
                qVar.F(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(b0 b0Var) {
        Future<?> submit = this.f52465k.submit(new t9.i(14, this, b0Var));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
