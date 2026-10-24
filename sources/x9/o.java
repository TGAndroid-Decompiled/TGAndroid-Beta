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
public final class o {
    public final Context f50156a;
    public final r f50157b;
    public final n2.e f50158c;
    public mi.q d;
    public mi.q e;
    public m f50159f;
    public final u f50160g;
    public final ca.c h;
    public final t9.a f50161i;
    public final t9.a f50162j;
    public final ExecutorService f50163k;
    public final com.google.firebase.messaging.r f50164l;
    public final j f50165m;
    public final u9.a f50166n;
    public final te.b f50167o;

    public o(l9.h hVar, u uVar, u9.a aVar, r rVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, te.b bVar) {
        this.f50157b = rVar;
        hVar.a();
        this.f50156a = hVar.f16030a;
        this.f50160g = uVar;
        this.f50166n = aVar;
        this.f50161i = aVar2;
        this.f50162j = aVar3;
        this.f50163k = executorService;
        this.h = cVar;
        this.f50164l = new com.google.firebase.messaging.r(executorService);
        this.f50165m = jVar;
        this.f50167o = bVar;
        System.currentTimeMillis();
        this.f50158c = new n2.e(27);
    }

    public static Task a(o oVar, ea.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.r rVar = oVar.f50164l;
        if (Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            oVar.d.C();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f50161i.a(new v0.k(9));
                    oVar.f50159f.g();
                    if (!bVar.d().f8549b.f4253a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f50159f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f50159f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8557i).get()).getTask());
                        nVar = new n(oVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    nVar = new n(oVar, 0);
                }
                rVar.v(nVar);
                return forException;
            } catch (Throwable th2) {
                rVar.v(new n(oVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(ea.b bVar) {
        Future<?> submit = this.f50163k.submit(new s9.i(14, this, bVar));
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
