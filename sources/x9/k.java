package x9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class k implements Callable {
    public final long f48297a;
    public final Throwable f48298b;
    public final Thread f48299c;
    public final ea.b d;
    public final n e;

    public k(n nVar, long j10, Throwable th2, Thread thread, ea.b bVar) {
        this.e = nVar;
        this.f48297a = j10;
        this.f48298b = th2;
        this.f48299c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ca.c cVar;
        String str;
        long j10 = this.f48297a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f48307c.a();
        com.google.firebase.messaging.m mVar = nVar.f48314m;
        mVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        mVar.v(this.f48298b, this.f48299c, e, "crash", j11, true);
        try {
            cVar = nVar.f48309g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f4675b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ea.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f48308f);
        n.a(nVar, f.f48287b, Boolean.FALSE);
        if (!nVar.f48306b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f6206b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f8668i).get()).getTask().onSuccessTask(executor, new n6.o(this, executor, e));
    }
}
