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
    public final Context f44952a;
    public final r f44953b;
    public final o0.a f44954c;
    public a1 d;
    public a1 e;
    public m f44955f;
    public final u f44956g;
    public final ba.c h;
    public final s9.a f44957i;
    public final s9.a f44958j;
    public final ExecutorService f44959k;
    public final com.google.firebase.messaging.t f44960l;
    public final j f44961m;
    public final t9.a f44962n;
    public final ka.c f44963o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, ka.c cVar2) {
        this.f44953b = rVar;
        hVar.a();
        this.f44952a = hVar.f13546a;
        this.f44956g = uVar;
        this.f44962n = aVar;
        this.f44957i = aVar2;
        this.f44958j = aVar3;
        this.f44959k = executorService;
        this.h = cVar;
        this.f44960l = new com.google.firebase.messaging.t(executorService);
        this.f44961m = jVar;
        this.f44963o = cVar2;
        System.currentTimeMillis();
        this.f44954c = new o0.a();
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.t tVar = oVar.f44960l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            oVar.d.k();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f44957i.a(new t0.a(20));
                    oVar.f44955f.g();
                    if (!bVar.d().f7573b.f380a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f44955f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f44955f.h(((TaskCompletionSource) ((AtomicReference) bVar.f7581i).get()).getTask());
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
        Future<?> submit = this.f44959k.submit(new u4.e(5, this, bVar));
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
