package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class l implements Callable {
    public final long f48950a;
    public final Throwable f48951b;
    public final Thread f48952c;
    public final da.b d;
    public final n f48953e;

    public l(n nVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.f48953e = nVar;
        this.f48950a = j3;
        this.f48951b = th2;
        this.f48952c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f48950a;
        long j10 = j3 / 1000;
        n nVar = this.f48953e;
        String e7 = nVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f48959c.o();
        com.google.firebase.messaging.n nVar2 = nVar.f48967m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.v(this.f48951b, this.f48952c, e7, "crash", j10, true);
        try {
            cVar = nVar.f48962g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.f3721b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f48961f);
        n.a(nVar, f.f48938b, Boolean.FALSE);
        if (!nVar.f48958b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.f48960e.f7922b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f8186i).get()).getTask().onSuccessTask(executor, new o0.a(this, executor, e7));
    }
}
