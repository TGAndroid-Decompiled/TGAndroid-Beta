package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f47268a;

    public g(CancellationSignal cancellationSignal) {
        this.f47268a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47268a.cancel();
        return gd.i.f10588a;
    }
}
