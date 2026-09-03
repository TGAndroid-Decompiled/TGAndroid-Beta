package x1;

import android.util.Log;
import h2.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b extends FutureTask {
    public final a f50271a;

    public b(a aVar, f fVar) {
        super(fVar);
        this.f50271a = aVar;
    }

    @Override
    public final void done() {
        a aVar = this.f50271a;
        AtomicBoolean atomicBoolean = aVar.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                aVar.b(obj);
            }
        } catch (InterruptedException e6) {
            Log.w("AsyncTask", e6);
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
