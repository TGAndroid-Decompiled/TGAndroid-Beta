package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.b5;
public final class k implements Callable {
    public final long f50236a;
    public final Throwable f50237b;
    public final Thread f50238c;
    public final da.c d;
    public final m f50239e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.c cVar) {
        this.f50239e = mVar;
        this.f50236a = j3;
        this.f50237b = th2;
        this.f50238c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f50236a;
        long j10 = j3 / 1000;
        m mVar = this.f50239e;
        String e7 = mVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f50245c.C();
        com.google.firebase.messaging.n nVar = mVar.f50253m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f50237b, this.f50238c, e7, "crash", j10, true);
        try {
            cVar = mVar.f50248g;
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
        new f(mVar.f50247f);
        m.a(mVar, f.f50225b, Boolean.FALSE);
        if (!mVar.f50244b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.f50246e.f7971b;
        return ((TaskCompletionSource) ((AtomicReference) cVar2.f8238i).get()).getTask().onSuccessTask(executor, new b5(this, executor, e7));
    }
}
