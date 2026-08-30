package x1;

import android.util.Log;
import h2.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b extends FutureTask {
    public final a f46644a;

    public b(a aVar, f fVar) {
        super(fVar);
        this.f46644a = aVar;
    }

    @Override
    public final void done() {
        a aVar = this.f46644a;
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
        } catch (ExecutionException e6) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e6.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
