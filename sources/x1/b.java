package x1;

import a8.gg;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b extends FutureTask {
    public final a f51290a;

    public b(a aVar, gg ggVar) {
        super(ggVar);
        this.f51290a = aVar;
    }

    @Override
    public final void done() {
        a aVar = this.f51290a;
        AtomicBoolean atomicBoolean = aVar.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                aVar.b(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                aVar.b(null);
            }
        } catch (ExecutionException e10) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
