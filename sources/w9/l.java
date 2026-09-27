package w9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class l implements Callable {
    public final long f45257a;
    public final Throwable f45258b;
    public final Thread f45259c;
    public final da.b d;
    public final n e;

    public l(n nVar, long j3, Throwable th2, Thread thread, da.b bVar) {
        this.e = nVar;
        this.f45257a = j3;
        this.f45258b = th2;
        this.f45259c = thread;
        this.d = bVar;
    }

    @Override
    public final Object call() {
        ba.c cVar;
        String str;
        long j3 = this.f45257a;
        long j10 = j3 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f45265c.o();
        com.google.firebase.messaging.n nVar2 = nVar.f45272m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.v(this.f45258b, this.f45259c, e, "crash", j10, true);
        try {
            cVar = nVar.f45267g;
            str = ".ae" + j3;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File(cVar.f3446b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        da.b bVar = this.d;
        nVar.c(false, bVar);
        new f(nVar.f45266f);
        n.a(nVar, f.f45246b, Boolean.FALSE);
        if (!nVar.f45264b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f7336b;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f7570i).get()).getTask().onSuccessTask(executor, new o0.a(this, executor, e));
    }
}
