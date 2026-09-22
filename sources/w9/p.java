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
import ki.e0;
import org.telegram.ui.Cells.f3;
public final class p {
    public final Context f45271a;
    public final s f45272b;
    public final m5.e f45273c;
    public f3 d;
    public f3 e;
    public n f45274f;
    public final v f45275g;
    public final ba.c h;
    public final s9.a f45276i;
    public final s9.a f45277j;
    public final ExecutorService f45278k;
    public final com.google.firebase.messaging.t f45279l;
    public final j f45280m;
    public final t9.a f45281n;
    public final e0 f45282o;

    public p(k9.h hVar, v vVar, t9.a aVar, s sVar, s9.a aVar2, s9.a aVar3, ba.c cVar, ExecutorService executorService, j jVar, e0 e0Var) {
        this.f45272b = sVar;
        hVar.a();
        this.f45271a = hVar.f13548a;
        this.f45275g = vVar;
        this.f45281n = aVar;
        this.f45276i = aVar2;
        this.f45277j = aVar3;
        this.f45278k = executorService;
        this.h = cVar;
        this.f45279l = new com.google.firebase.messaging.t(executorService);
        this.f45280m = jVar;
        this.f45282o = e0Var;
        System.currentTimeMillis();
        this.f45273c = new m5.e(29, (byte) 0);
    }

    public static Task a(p pVar, da.b bVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.t tVar = pVar.f45279l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            pVar.d.n();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f45276i.a(new s0.b(28));
                    pVar.f45274f.g();
                    if (!bVar.d().f7577b.f379a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f45274f.d(bVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f45274f.h(((TaskCompletionSource) ((AtomicReference) bVar.f7585i).get()).getTask());
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
        Future<?> submit = this.f45278k.submit(new u4.e(5, this, bVar));
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
