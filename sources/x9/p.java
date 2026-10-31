package x9;

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
import td.z1;
import th.m1;
import x7.g8;
public final class p {
    public final Context f53484a;
    public final s f53485b;
    public final g8 f53486c;
    public u9.b d;
    public u9.b e;
    public n f53487f;
    public final v f53488g;
    public final ca.c h;
    public final t9.a f53489i;
    public final t9.a f53490j;
    public final ExecutorService f53491k;
    public final xa.n f53492l;
    public final j f53493m;
    public final u9.a f53494n;
    public final n2.u f53495o;

    public p(l9.h hVar, v vVar, u9.a aVar, s sVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, n2.u uVar) {
        this.f53485b = sVar;
        hVar.a();
        this.f53484a = hVar.f11707a;
        this.f53488g = vVar;
        this.f53494n = aVar;
        this.f53489i = aVar2;
        this.f53490j = aVar3;
        this.f53491k = executorService;
        this.h = cVar;
        ?? obj = new Object();
        obj.f53555b = Tasks.forResult(null);
        obj.f53556c = new Object();
        obj.d = new ThreadLocal();
        obj.f53554a = executorService;
        executorService.execute(new u0.b(obj, 3));
        this.f53492l = obj;
        this.f53493m = jVar;
        this.f53495o = uVar;
        System.currentTimeMillis();
        this.f53486c = new g8();
    }

    public static Task a(p pVar, ea.d dVar) {
        Task forException;
        o oVar;
        xa.n nVar = pVar.f53492l;
        if (Boolean.TRUE.equals(((ThreadLocal) nVar.d).get())) {
            pVar.d.b();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f53489i.a(new m1(20));
                    pVar.f53487f.g();
                    if (!dVar.d().f6463b.f6459a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f53487f.d(dVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f53487f.h(((TaskCompletionSource) ((AtomicReference) dVar.f6471i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    oVar = new o(pVar, 0);
                }
                nVar.Y(oVar);
                return forException;
            } catch (Throwable th2) {
                nVar.Y(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(ea.d dVar) {
        Future<?> submit = this.f53491k.submit(new z1(this, dVar, false, 12));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e7);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}
