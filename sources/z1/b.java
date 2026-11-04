package z1;

import android.util.Log;
import b8.dg;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b extends FutureTask {
    public final a f59570a;

    public b(a aVar, dg dgVar) {
        super(dgVar);
        this.f59570a = aVar;
    }

    @Override
    public final void done() {
        a aVar = this.f59570a;
        AtomicBoolean atomicBoolean = aVar.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                aVar.b(obj);
            }
        } catch (InterruptedException e10) {
            Log.w("AsyncTask", e10);
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                aVar.b(null);
            }
        } catch (ExecutionException e11) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
