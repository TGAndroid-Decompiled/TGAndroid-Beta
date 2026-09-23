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
import n7.a1;
public final class o {
    public final Context f44902a;
    public final r f44903b;
    public final o0.a f44904c;
    public a1 d;
    public a1 e;
    public m f44905f;
    public final u f44906g;
    public final ba.c h;
    public final s9.a f44907i;
    public final s9.a f44908j;
    public final ExecutorService f44909k;
    public final com.google.firebase.messaging.t f44910l;
    public final j f44911m;
    public final t9.a f44912n;
    public final ka.c f44913o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, ka.c cVar2) {
        this.f44903b = rVar;
        hVar.a();
        this.f44902a = hVar.f13536a;
        this.f44906g = uVar;
        this.f44912n = aVar;
        this.f44907i = aVar2;
        this.f44908j = aVar3;
        this.f44909k = executorService;
        this.h = cVar;
        this.f44910l = new com.google.firebase.messaging.t(executorService);
        this.f44911m = jVar;
        this.f44913o = cVar2;
        System.currentTimeMillis();
        this.f44904c = new o0.a();
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.t tVar = oVar.f44910l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            oVar.d.k();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f44907i.a(new v3.d(4));
                    oVar.f44905f.g();
                    if (!bVar.d().f7561b.f382a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f44905f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f44905f.h(((TaskCompletionSource) ((AtomicReference) bVar.f7569i).get()).getTask());
                        nVar = new n(oVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    nVar = new n(oVar, 0);
                }
                tVar.k(nVar);
                return forException;
            } catch (Throwable th2) {
                tVar.k(new n(oVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.f44909k.submit(new u4.e(5, this, bVar));
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
