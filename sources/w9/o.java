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
import og.u0;
public final class o {
    public final Context f43911a;
    public final r f43912b;
    public final u0 f43913c;
    public a1 d;
    public a1 e;
    public m f43914f;
    public final u f43915g;
    public final ba.c h;
    public final s9.a f43916i;
    public final s9.a f43917j;
    public final ExecutorService f43918k;
    public final com.google.firebase.messaging.s f43919l;
    public final j f43920m;
    public final t9.a f43921n;
    public final l2.g f43922o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l2.g gVar) {
        this.f43912b = rVar;
        hVar.a();
        this.f43911a = hVar.f12392a;
        this.f43915g = uVar;
        this.f43921n = aVar;
        this.f43916i = aVar2;
        this.f43917j = aVar3;
        this.f43918k = executorService;
        this.h = cVar;
        this.f43919l = new com.google.firebase.messaging.s(executorService);
        this.f43920m = jVar;
        this.f43922o = gVar;
        System.currentTimeMillis();
        this.f43913c = new u0();
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.s sVar = oVar.f43919l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.e).get())) {
            oVar.d.C();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f43916i.a(new u2.c(12));
                    oVar.f43914f.g();
                    if (!bVar.d().f6349b.f378a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f43914f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f43914f.h(((TaskCompletionSource) ((AtomicReference) bVar.f6357i).get()).getTask());
                        nVar = new n(oVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    nVar = new n(oVar, 0);
                }
                sVar.o(nVar);
                return forException;
            } catch (Throwable th2) {
                sVar.o(new n(oVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(da.b bVar) {
        Future<?> submit = this.f43918k.submit(new u4.e(5, this, bVar));
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
