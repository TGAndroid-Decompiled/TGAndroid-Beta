package z9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class k implements Callable {
    public final long f60187a;
    public final Throwable f60188b;
    public final Thread f60189c;
    public final ha.c d;
    public final m f60190e;

    public k(m mVar, long j10, Throwable th2, Thread thread, ha.c cVar) {
        this.f60190e = mVar;
        this.f60187a = j10;
        this.f60188b = th2;
        this.f60189c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        fa.f fVar;
        String str;
        long j10 = this.f60187a;
        long j11 = j10 / 1000;
        m mVar = this.f60190e;
        String g7 = mVar.g();
        if (g7 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f60197c.a();
        x xVar = mVar.f60205m;
        xVar.getClass();
        String concat = "Persisting fatal event for session ".concat(g7);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        xVar.g(this.f60188b, this.f60189c, "crash", new ba.c(g7, j11, ed.p.f9954a), true);
        try {
            fVar = mVar.f60200g;
            str = ".ae" + j10;
            fVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) fVar.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ha.c cVar = this.d;
        mVar.c(false, cVar, false);
        mVar.d(new e().f60175a, Boolean.FALSE);
        if (!mVar.f60196b.a()) {
            return Tasks.forResult(null);
        }
        return ((TaskCompletionSource) ((AtomicReference) cVar.f14378i).get()).getTask().onSuccessTask(mVar.f60198e.f286a, new z6.c(this, g7));
    }
}
