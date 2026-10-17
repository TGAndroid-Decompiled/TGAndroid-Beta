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
    public final long f49705a;
    public final Throwable f49706b;
    public final Thread f49707c;
    public final ea.b d;
    public final m e;

    public k(m mVar, long j10, Throwable th2, Thread thread, ea.b bVar) {
        this.e = mVar;
        this.f49705a = j10;
        this.f49706b = th2;
        this.f49707c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ca.c cVar;
        String str;
        long j10 = this.f49705a;
        long j11 = j10 / 1000;
        m mVar = this.e;
        String e = mVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f49713c.O();
        com.google.firebase.messaging.l lVar = mVar.f49720m;
        lVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        lVar.A(this.f49706b, this.f49707c, e, "crash", j11, true);
        try {
            cVar = mVar.f49715g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f5048b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ea.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f49714f);
        m.a(mVar, f.f49695b, Boolean.FALSE);
        if (!mVar.f49712b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.f7662b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f8552i).get()).getTask().onSuccessTask(executor, new n2.e(this, executor, e));
    }
}
