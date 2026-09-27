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
import n7.z0;
import u2.x0;
public final class p {
    public final Context f45279a;
    public final s f45280b;
    public final o0.a f45281c;
    public z0 d;
    public z0 e;
    public n f45282f;
    public final v f45283g;
    public final ba.c h;
    public final s9.a f45284i;
    public final s9.a f45285j;
    public final ExecutorService f45286k;
    public final com.google.firebase.messaging.t f45287l;
    public final j f45288m;
    public final t9.a f45289n;
    public final l.d f45290o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l.d dVar) {
        this.f45280b = sVar;
        hVar.a();
        this.f45279a = hVar.f13536a;
        this.f45283g = vVar;
        this.f45289n = aVar;
        this.f45284i = aVar2;
        this.f45285j = aVar3;
        this.f45286k = executorService;
        this.h = cVar;
        this.f45287l = new com.google.firebase.messaging.t(executorService);
        this.f45288m = jVar;
        this.f45290o = dVar;
        System.currentTimeMillis();
        this.f45281c = new o0.a();
    }

    public static Task a(p pVar, da.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.t tVar = pVar.f45287l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            pVar.d.o();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f45284i.a(new x0(11));
                    pVar.f45282f.g();
                    if (!bVar.d().f7562b.f382a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f45282f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f45282f.h(((TaskCompletionSource) ((AtomicReference) bVar.f7570i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    oVar = new o(pVar, 0);
                }
                tVar.k(oVar);
                return forException;
            } catch (Throwable th2) {
                tVar.k(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.f45286k.submit(new u4.e(5, this, bVar));
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
