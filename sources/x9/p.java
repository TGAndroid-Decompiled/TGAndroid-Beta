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
import ji.w4;
public final class p {
    public final Context f48320a;
    public final s f48321b;
    public final n3.b f48322c;
    public l d;
    public l e;
    public n f48323f;
    public final v f48324g;
    public final ca.c h;
    public final t9.a f48325i;
    public final t9.a f48326j;
    public final ExecutorService f48327k;
    public final com.google.firebase.messaging.s f48328l;
    public final j f48329m;
    public final u9.a f48330n;
    public final w4 f48331o;

    public p(l9.h hVar, v vVar, u9.a aVar, s sVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, w4 w4Var) {
        this.f48321b = sVar;
        hVar.a();
        this.f48320a = hVar.f14626a;
        this.f48324g = vVar;
        this.f48330n = aVar;
        this.f48325i = aVar2;
        this.f48326j = aVar3;
        this.f48327k = executorService;
        this.h = cVar;
        this.f48328l = new com.google.firebase.messaging.s(executorService);
        this.f48329m = jVar;
        this.f48331o = w4Var;
        System.currentTimeMillis();
        this.f48322c = new n3.b(27);
    }

    public static Task a(p pVar, ea.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.f48328l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.e).get())) {
            pVar.d.a();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f48325i.a(new t0.a(23));
                    pVar.f48323f.g();
                    if (!bVar.d().f8663b.f2637a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f48323f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f48323f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8671i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    oVar = new o(pVar, 0);
                }
                sVar.v(oVar);
                return forException;
            } catch (Throwable th2) {
                sVar.v(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(ea.b bVar) {
        Future<?> submit = this.f48327k.submit(new s9.j(14, this, bVar));
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
