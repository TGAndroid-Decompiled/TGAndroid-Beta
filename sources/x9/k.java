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
    public final long f48296a;
    public final Throwable f48297b;
    public final Thread f48298c;
    public final ea.b d;
    public final n e;

    public k(n nVar, long j10, Throwable th2, Thread thread, ea.b bVar) {
        this.e = nVar;
        this.f48296a = j10;
        this.f48297b = th2;
        this.f48298c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ca.c cVar;
        String str;
        long j10 = this.f48296a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f48306c.a();
        com.google.firebase.messaging.m mVar = nVar.f48313m;
        mVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        mVar.v(this.f48297b, this.f48298c, e, "crash", j11, true);
        try {
            cVar = nVar.f48308g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f4678b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ea.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f48307f);
        n.a(nVar, f.f48286b, Boolean.FALSE);
        if (!nVar.f48305b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f6209b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f8671i).get()).getTask().onSuccessTask(executor, new n3.b(this, executor, e));
    }
}
