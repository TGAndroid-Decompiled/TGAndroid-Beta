package v0;

import android.os.CancellationSignal;
public final class g implements bd.l {
    public final CancellationSignal f49311a;

    public g(CancellationSignal cancellationSignal) {
        this.f49311a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f49311a.cancel();
        return qc.i.f46603a;
    }
}
