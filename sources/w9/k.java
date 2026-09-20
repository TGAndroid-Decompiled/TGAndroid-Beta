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
    public final long f45228a;
    public final Throwable f45229b;
    public final Thread f45230c;
    public final da.b d;
    public final m e;

    public k(m mVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = mVar;
        this.f45228a = j3;
        this.f45229b = th2;
        this.f45230c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f45228a;
        long j10 = j3 / 1000;
        m mVar = this.e;
        String e = mVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f45236c.k();
        com.google.firebase.messaging.n nVar = mVar.f45243m;
        nVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar.v(this.f45229b, this.f45230c, e, "crash", j10, true);
        try {
            cVar = mVar.f45238g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f3452b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        mVar.c(false, bVar);
        new f(mVar.f45237f);
        m.a(mVar, f.f45218b, Boolean.FALSE);
        if (!mVar.f45235b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) mVar.e.f7346b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f7586i).get()).getTask().onSuccessTask(executor, new m5.e(this, executor, e));
    }
}
