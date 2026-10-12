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
public final class p {
    public final Context f48321a;
    public final s f48322b;
    public final n6.o f48323c;
    public l d;
    public l e;
    public n f48324f;
    public final v f48325g;
    public final ca.c h;
    public final t9.a f48326i;
    public final t9.a f48327j;
    public final ExecutorService f48328k;
    public final com.google.firebase.messaging.s f48329l;
    public final j f48330m;
    public final u9.a f48331n;
    public final u9.d f48332o;

    public p(l9.h hVar, v vVar, u9.a aVar, s sVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, u9.d dVar) {
        this.f48322b = sVar;
        hVar.a();
        this.f48321a = hVar.f14626a;
        this.f48325g = vVar;
        this.f48331n = aVar;
        this.f48326i = aVar2;
        this.f48327j = aVar3;
        this.f48328k = executorService;
        this.h = cVar;
        this.f48329l = new com.google.firebase.messaging.s(executorService);
        this.f48330m = jVar;
        this.f48332o = dVar;
        System.currentTimeMillis();
        this.f48323c = new n6.o(26);
    }

    public static Task a(p pVar, ea.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.s sVar = pVar.f48329l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.e).get())) {
            pVar.d.a();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f48326i.a(new t0.a(23));
                    pVar.f48324f.g();
                    if (!bVar.d().f8660b.f2633a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f48324f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f48324f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8668i).get()).getTask());
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
        Future<?> submit = this.f48328k.submit(new s9.j(14, this, bVar));
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
