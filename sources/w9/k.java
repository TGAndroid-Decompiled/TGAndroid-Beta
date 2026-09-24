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
    public final long f45197a;
    public final Throwable f45198b;
    public final Thread f45199c;
    public final da.b d;
    public final m e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = mVar;
        this.f45197a = j3;
        this.f45198b = th2;
        this.f45199c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f45197a;
        long j10 = j3 / 1000;
        m mVar = this.e;
        String e = mVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f45205c.o();
        com.google.firebase.messaging.n nVar = mVar.f45212m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f45198b, this.f45199c, e, "crash", j10, true);
        try {
            cVar = mVar.f45207g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f3444b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f45206f);
        m.a(mVar, f.f45187b, Boolean.FALSE);
        if (!mVar.f45204b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.f7328b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f7568i).get()).getTask().onSuccessTask(executor, new o0.a(this, executor, e));
    }
}
