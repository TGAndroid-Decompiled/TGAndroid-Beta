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
    public final long f48425a;
    public final Throwable f48426b;
    public final Thread f48427c;
    public final da.b d;
    public final m f48428e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.f48428e = mVar;
        this.f48425a = j3;
        this.f48426b = th2;
        this.f48427c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f48425a;
        long j10 = j3 / 1000;
        m mVar = this.f48428e;
        String e7 = mVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f48434c.p();
        com.google.firebase.messaging.n nVar = mVar.f48442m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f48426b, this.f48427c, e7, "crash", j10, true);
        try {
            cVar = mVar.f48437g;
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
        new f(mVar.f48436f);
        m.a(mVar, f.f48414b, Boolean.FALSE);
        if (!mVar.f48433b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.f48435e.f6418b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f6684i).get()).getTask().onSuccessTask(executor, new z0(this, executor, e7));
    }
}
