package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f47267a;

    public g(CancellationSignal cancellationSignal) {
        this.f47267a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47267a.cancel();
        return gd.i.f10588a;
    }
}
