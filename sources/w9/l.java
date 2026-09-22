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
    public final long f45249a;
    public final Throwable f45250b;
    public final Thread f45251c;
    public final da.b d;
    public final n e;

    public l(n nVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = nVar;
        this.f45249a = j3;
        this.f45250b = th2;
        this.f45251c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f45249a;
        long j10 = j3 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f45257c.n();
        com.google.firebase.messaging.n nVar2 = nVar.f45264m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.v(this.f45250b, this.f45251c, e, "crash", j10, true);
        try {
            cVar = nVar.f45259g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f3451b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f45258f);
        n.a(nVar, f.f45238b, Boolean.FALSE);
        if (!nVar.f45256b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f7344b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f7585i).get()).getTask().onSuccessTask(executor, new m5.e(this, executor, e));
    }
}
