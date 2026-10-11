package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n7.z0;
public final class k implements Callable {
    public final long f50325a;
    public final Throwable f50326b;
    public final Thread f50327c;
    public final da.c d;
    public final m f50328e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.c cVar) {
        this.f50328e = mVar;
        this.f50325a = j3;
        this.f50326b = th2;
        this.f50327c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f50325a;
        long j10 = j3 / 1000;
        m mVar = this.f50328e;
        String e7 = mVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f50334c.D();
        com.google.firebase.messaging.n nVar = mVar.f50342m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f50326b, this.f50327c, e7, "crash", j10, true);
        try {
            cVar = mVar.f50337g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.f3800b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.c cVar2 = this.d;
        mVar.c(false, cVar2);
        new f(mVar.f50336f);
        m.a(mVar, f.f50314b, Boolean.FALSE);
        if (!mVar.f50333b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.f50335e.f7970b;
        return ((TaskCompletionSource) ((AtomicReference) cVar2.f8237i).get()).getTask().onSuccessTask(executor, new z0(this, executor, e7));
    }
}
