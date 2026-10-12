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
public final class l implements Callable {
    public final long f50466a;
    public final Throwable f50467b;
    public final Thread f50468c;
    public final da.c d;
    public final n f50469e;

    public l(n nVar, long j3, Throwable th2, Thread thread, da.c cVar) {
        this.f50469e = nVar;
        this.f50466a = j3;
        this.f50467b = th2;
        this.f50468c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f50466a;
        long j10 = j3 / 1000;
        n nVar = this.f50469e;
        String e7 = nVar.e();
        if (e7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f50475c.C();
        com.google.firebase.messaging.n nVar2 = nVar.f50483m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.v(this.f50467b, this.f50468c, e7, "crash", j10, true);
        try {
            cVar = nVar.f50478g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.f3798b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.c cVar2 = this.d;
        nVar.c(false, cVar2);
        new f(nVar.f50477f);
        n.a(nVar, f.f50454b, Boolean.FALSE);
        if (!nVar.f50474b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.f50476e.f7967b;
        return ((TaskCompletionSource) ((AtomicReference) cVar2.f8235i).get()).getTask().onSuccessTask(executor, new z0(this, executor, e7));
    }
}
