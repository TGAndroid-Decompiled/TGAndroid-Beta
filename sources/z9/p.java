package z9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.nh;
public final class p {
    public final Context f60216a;
    public final s f60217b;
    public final ua.b f60218c;
    public w9.b d;
    public w9.b f60219e;
    public m f60220f;
    public final v f60221g;
    public final fa.f h;
    public final v9.a f60222i;
    public final v9.a f60223j;
    public final i f60224k;
    public final w9.a f60225l;
    public final nh f60226m;
    public final aa.g f60227n;

    public p(n9.h hVar, v vVar, w9.a aVar, s sVar, v9.a aVar2, v9.a aVar3, fa.f fVar, i iVar, nh nhVar, aa.g gVar) {
        this.f60217b = sVar;
        hVar.a();
        this.f60216a = hVar.f20296a;
        this.f60221g = vVar;
        this.f60225l = aVar;
        this.f60222i = aVar2;
        this.f60223j = aVar3;
        this.h = fVar;
        this.f60224k = iVar;
        this.f60226m = nhVar;
        this.f60227n = gVar;
        System.currentTimeMillis();
        this.f60218c = new ua.b();
    }

    public final void a(ha.c cVar) {
        aa.g.a();
        aa.g.a();
        this.d.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f60222i.a(new j(1));
                this.f60220f.i();
                if (cVar.b().f14368b.f14364a) {
                    if (!this.f60220f.f(cVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.f60220f.j(((TaskCompletionSource) ((AtomicReference) cVar.f14378i).get()).getTask());
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(ha.c cVar) {
        Future<?> submit = this.f60227n.f286a.f282a.submit(new n(this, cVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        aa.g.a();
        try {
            w9.b bVar = this.d;
            fa.f fVar = (fa.f) bVar.f57425c;
            fVar.getClass();
            if (!new File((File) fVar.d, (String) bVar.f57424b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
