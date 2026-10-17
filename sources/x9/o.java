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
    public final Context f49727a;
    public final r f49728b;
    public final n2.e f49729c;
    public mi.q d;
    public mi.q e;
    public m f49730f;
    public final u f49731g;
    public final ca.c h;
    public final t9.a f49732i;
    public final t9.a f49733j;
    public final ExecutorService f49734k;
    public final com.google.firebase.messaging.r f49735l;
    public final j f49736m;
    public final u9.a f49737n;
    public final le.b f49738o;

    public o(l9.h hVar, u uVar, u9.a aVar, r rVar, t9.a aVar2, t9.a aVar3, ca.c cVar, ExecutorService executorService, j jVar, le.b bVar) {
        this.f49728b = rVar;
        hVar.a();
        this.f49727a = hVar.f15961a;
        this.f49731g = uVar;
        this.f49737n = aVar;
        this.f49732i = aVar2;
        this.f49733j = aVar3;
        this.f49734k = executorService;
        this.h = cVar;
        this.f49735l = new com.google.firebase.messaging.r(executorService);
        this.f49736m = jVar;
        this.f49738o = bVar;
        System.currentTimeMillis();
        this.f49729c = new n2.e(28);
    }

    public static Task a(o oVar, ea.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.r rVar = oVar.f49735l;
        if (Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            oVar.d.O();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f49732i.a(new si.a(26));
                    oVar.f49730f.g();
                    if (!bVar.d().f8544b.f4249a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f49730f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f49730f.h(((TaskCompletionSource) ((AtomicReference) bVar.f8552i).get()).getTask());
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
        Future<?> submit = this.f49734k.submit(new s9.i(14, this, bVar));
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
