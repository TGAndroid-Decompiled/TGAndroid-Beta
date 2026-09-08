package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f47295a;

    public g(CancellationSignal cancellationSignal) {
        this.f47295a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47295a.cancel();
        return gd.i.f10616a;
    }
}
