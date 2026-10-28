package y9;

import aa.b0;
import aa.m0;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m4.w1;
public final class k implements Callable {
    public final long f52492a;
    public final Throwable f52493b;
    public final Thread f52494c;
    public final b0 d;
    public final n e;

    public k(n nVar, long j10, Throwable th2, Thread thread, b0 b0Var) {
        this.e = nVar;
        this.f52492a = j10;
        this.f52493b = th2;
        this.f52494c = thread;
        this.d = b0Var;
    }

    @Override
    public final Object call() {
        da.c cVar;
        String str;
        long j10 = this.f52492a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f52502c.b();
        m0 m0Var = nVar.f52509m;
        m0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        m0Var.t(this.f52493b, this.f52494c, e, "crash", j11, true);
        try {
            cVar = nVar.f52504g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.f8274b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        b0 b0Var = this.d;
        nVar.c(false, b0Var);
        new f(nVar.f52503f);
        n.a(nVar, f.f52482b, Boolean.FALSE);
        if (!nVar.f52501b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f7757a;
        return ((TaskCompletionSource) ((AtomicReference) b0Var.f1036i).get()).getTask().onSuccessTask(executor, new w1(this, executor, e));
    }
}
