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
import sg.y;
public final class o {
    public final Context f49715a;
    public final r f49716b;
    public final n2.e f49717c;
    public mi.q d;
    public mi.q e;
    public m f49718f;
    public final u f49719g;
    public final ca.c h;
    public final t9.a f49720i;
    public final t9.a f49721j;
    public final ExecutorService f49722k;
    public final com.google.firebase.messaging.r f49723l;
    public final j f49724m;
    public final u9.a f49725n;
    public final te.b f49726o;

    public o(l9.h hVar, u uVar, u9.a aVar, r rVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, te.b bVar) {
        this.f49716b = rVar;
        hVar.a();
        this.f49715a = hVar.f15967a;
        this.f49719g = uVar;
        this.f49725n = aVar;
        this.f49720i = aVar2;
        this.f49721j = aVar3;
        this.f49722k = executorService;
        this.h = cVar;
        this.f49723l = new com.google.firebase.messaging.r(executorService);
        this.f49724m = jVar;
        this.f49726o = bVar;
        System.currentTimeMillis();
        this.f49717c = new n2.e(28);
    }

    public static Task a(o oVar, ea.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.r rVar = oVar.f49723l;
        if (Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            oVar.d.R();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f49720i.a(new y(27));
                    oVar.f49718f.g();
                    if (!bVar.d().f8542b.f4246a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f49718f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f49718f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8550i).get()).getTask());
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
        Future<?> submit = this.f49722k.submit(new s9.i(14, this, bVar));
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
