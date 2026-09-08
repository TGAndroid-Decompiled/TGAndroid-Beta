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
    public final long f48424a;
    public final Throwable f48425b;
    public final Thread f48426c;
    public final da.b d;
    public final m f48427e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.f48427e = mVar;
        this.f48424a = j3;
        this.f48425b = th2;
        this.f48426c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f48424a;
        long j10 = j3 / 1000;
        m mVar = this.f48427e;
        String e7 = mVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f48433c.p();
        com.google.firebase.messaging.n nVar = mVar.f48441m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f48425b, this.f48426c, e7, "crash", j10, true);
        try {
            cVar = mVar.f48436g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.f2554b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f48435f);
        m.a(mVar, f.f48413b, Boolean.FALSE);
        if (!mVar.f48432b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.f48434e.f6418b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f6684i).get()).getTask().onSuccessTask(executor, new z0(this, executor, e7));
    }
}
