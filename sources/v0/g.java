package v0;

import android.os.CancellationSignal;
public final class g implements dd.l {
    public final CancellationSignal f45543a;

    public g(CancellationSignal cancellationSignal) {
        this.f45543a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f45543a.cancel();
        return sc.i.f44253a;
    }
}
