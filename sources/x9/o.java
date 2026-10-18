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
    public final Context f49705a;
    public final r f49706b;
    public final n2.e f49707c;
    public mi.q d;
    public mi.q e;
    public m f49708f;
    public final u f49709g;
    public final ca.c h;
    public final t9.a f49710i;
    public final t9.a f49711j;
    public final ExecutorService f49712k;
    public final com.google.firebase.messaging.r f49713l;
    public final j f49714m;
    public final u9.a f49715n;
    public final le.b f49716o;

    public o(l9.h hVar, u uVar, u9.a aVar, r rVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, le.b bVar) {
        this.f49706b = rVar;
        hVar.a();
        this.f49705a = hVar.f15966a;
        this.f49709g = uVar;
        this.f49715n = aVar;
        this.f49710i = aVar2;
        this.f49711j = aVar3;
        this.f49712k = executorService;
        this.h = cVar;
        this.f49713l = new com.google.firebase.messaging.r(executorService);
        this.f49714m = jVar;
        this.f49716o = bVar;
        System.currentTimeMillis();
        this.f49707c = new n2.e(28);
    }

    public static Task a(o oVar, ea.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.r rVar = oVar.f49713l;
        if (Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            oVar.d.O();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f49710i.a(new y(27));
                    oVar.f49708f.g();
                    if (!bVar.d().f8543b.f4250a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f49708f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f49708f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8551i).get()).getTask());
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
        Future<?> submit = this.f49712k.submit(new s9.i(14, this, bVar));
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
