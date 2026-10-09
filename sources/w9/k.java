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
    public final long f50238a;
    public final Throwable f50239b;
    public final Thread f50240c;
    public final da.c d;
    public final m f50241e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.c cVar) {
        this.f50241e = mVar;
        this.f50238a = j3;
        this.f50239b = th2;
        this.f50240c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f50238a;
        long j10 = j3 / 1000;
        m mVar = this.f50241e;
        String e7 = mVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f50247c.C();
        com.google.firebase.messaging.n nVar = mVar.f50255m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f50239b, this.f50240c, e7, "crash", j10, true);
        try {
            cVar = mVar.f50250g;
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
        new f(mVar.f50249f);
        m.a(mVar, f.f50227b, Boolean.FALSE);
        if (!mVar.f50246b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.f50248e.f7971b;
        return ((TaskCompletionSource) ((AtomicReference) cVar2.f8238i).get()).getTask().onSuccessTask(executor, new b5(this, executor, e7));
    }
}
