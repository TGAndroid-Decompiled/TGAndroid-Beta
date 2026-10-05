package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f47761a;

    public g(CancellationSignal cancellationSignal) {
        this.f47761a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47761a.cancel();
        return gd.i.f10453a;
    }
}
