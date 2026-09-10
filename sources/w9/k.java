package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import og.u0;
public final class k implements Callable {
    public final long f43889a;
    public final Throwable f43890b;
    public final Thread f43891c;
    public final da.b d;
    public final m e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = mVar;
        this.f43889a = j3;
        this.f43890b = th2;
        this.f43891c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f43889a;
        long j10 = j3 / 1000;
        m mVar = this.e;
        String e = mVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f43897c.C();
        com.google.firebase.messaging.n nVar = mVar.f43904m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f43890b, this.f43891c, e, "crash", j10, true);
        try {
            cVar = mVar.f43899g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f2145b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f43898f);
        m.a(mVar, f.f43879b, Boolean.FALSE);
        if (!mVar.f43896b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.f6118b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f6357i).get()).getTask().onSuccessTask(executor, new u0(this, executor, e));
    }
}
