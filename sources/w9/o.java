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
import org.telegram.ui.Cells.f3;
public final class o {
    public final Context f45250a;
    public final r f45251b;
    public final m5.e f45252c;
    public f3 d;
    public f3 e;
    public m f45253f;
    public final u f45254g;
    public final ba.c h;
    public final s9.a f45255i;
    public final s9.a f45256j;
    public final ExecutorService f45257k;
    public final com.google.firebase.messaging.t f45258l;
    public final j f45259m;
    public final t9.a f45260n;
    public final l.d f45261o;

    public o(k9.h hVar, u uVar, t9.a aVar, r rVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, l.d dVar) {
        this.f45251b = rVar;
        hVar.a();
        this.f45250a = hVar.f13548a;
        this.f45254g = uVar;
        this.f45260n = aVar;
        this.f45255i = aVar2;
        this.f45256j = aVar3;
        this.f45257k = executorService;
        this.h = cVar;
        this.f45258l = new com.google.firebase.messaging.t(executorService);
        this.f45259m = jVar;
        this.f45261o = dVar;
        System.currentTimeMillis();
        this.f45252c = new m5.e(29, (byte) 0);
    }

    public static Task a(o oVar, da.b bVar) {
        Task forException;
        n nVar;
        com.google.firebase.messaging.t tVar = oVar.f45258l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            oVar.d.k();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    oVar.f45255i.a(new s0.b(28));
                    oVar.f45253f.g();
                    if (!bVar.d().f7578b.f382a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        nVar = new n(oVar, 0);
                    } else {
                        if (!oVar.f45253f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = oVar.f45253f.h(((TaskCompletionSource) ((AtomicReference) bVar.f7586i).get()).getTask());
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
        Future<?> submit = this.f45257k.submit(new u4.e(5, this, bVar));
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
