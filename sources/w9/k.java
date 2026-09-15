package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class k implements Callable {
    public final long f44930a;
    public final Throwable f44931b;
    public final Thread f44932c;
    public final da.b d;
    public final m e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = mVar;
        this.f44930a = j3;
        this.f44931b = th2;
        this.f44932c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f44930a;
        long j10 = j3 / 1000;
        m mVar = this.e;
        String e = mVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f44938c.k();
        com.google.firebase.messaging.n nVar = mVar.f44945m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f44931b, this.f44932c, e, "crash", j10, true);
        try {
            cVar = mVar.f44940g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f3447b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f44939f);
        m.a(mVar, f.f44920b, Boolean.FALSE);
        if (!mVar.f44937b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.f7347b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f7581i).get()).getTask().onSuccessTask(executor, new o0.a(this, executor, e));
    }
}
