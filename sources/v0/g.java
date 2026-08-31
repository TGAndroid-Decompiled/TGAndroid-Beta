package v0;

import android.os.CancellationSignal;
public final class g implements dd.l {
    public final CancellationSignal f48833a;

    public g(CancellationSignal cancellationSignal) {
        this.f48833a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f48833a.cancel();
        return sc.i.f47243a;
    }
}
