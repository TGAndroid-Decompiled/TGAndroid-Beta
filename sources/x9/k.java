package x9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x7.g8;
public final class k implements Callable {
    public final long f53459a;
    public final Throwable f53460b;
    public final Thread f53461c;
    public final ea.d d;
    public final n e;

    public k(n nVar, long j10, Throwable th2, Thread thread, ea.d dVar) {
        this.e = nVar;
        this.f53459a = j10;
        this.f53460b = th2;
        this.f53461c = thread;
        this.d = dVar;
    }

    @Override
    public final Object call() {
        ca.c cVar;
        String str;
        long j10 = this.f53459a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f53470c.b();
        j2.f fVar = nVar.f53477m;
        fVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        fVar.u(this.f53460b, this.f53461c, e, "crash", j11, true);
        try {
            cVar = nVar.f53472g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f4084b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ea.d dVar = this.d;
        nVar.c(false, dVar);
        new f(nVar.f53471f);
        n.a(nVar, f.f53449b, Boolean.FALSE);
        if (!nVar.f53469b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f53554a;
        return ((TaskCompletionSource) ((AtomicReference) dVar.f6471i).get()).getTask().onSuccessTask(executor, new g8(this, executor, e));
    }
}
