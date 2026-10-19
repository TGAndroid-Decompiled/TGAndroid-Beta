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
    public final Context f49706a;
    public final r f49707b;
    public final n2.e f49708c;
    public mi.q d;
    public mi.q e;
    public m f49709f;
    public final u f49710g;
    public final ca.c h;
    public final t9.a f49711i;
    public final t9.a f49712j;
    public final ExecutorService f49713k;
    public final com.google.firebase.messaging.r f49714l;
    public final j f49715m;
    public final u9.a f49716n;
    public final te.b f49717o;

    public o(l9.h hVar, u uVar, u9.a aVar, r rVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, te.b bVar) {
        this.f49707b = rVar;
        hVar.a();
        this.f49706a = hVar.f15967a;
        this.f49710g = uVar;
        this.f49716n = aVar;
        this.f49711i = aVar2;
        this.f49712j = aVar3;
        this.f49713k = executorService;
        this.h = cVar;
        this.f49714l = new com.google.firebase.messaging.r(executorService);
        this.f49715m = jVar;
        this.f49717o = bVar;
        System.currentTimeMillis();
        this.f49708c = new n2.e(28);
    }

    public static Task a(o oVar, ea.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.r rVar = oVar.f49714l;
        if (Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            oVar.d.R();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f49711i.a(new y(27));
                    oVar.f49709f.g();
                    if (!bVar.d().f8542b.f4246a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f49709f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f49709f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8550i).get()).getTask());
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
        Future<?> submit = this.f49713k.submit(new s9.i(14, this, bVar));
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
