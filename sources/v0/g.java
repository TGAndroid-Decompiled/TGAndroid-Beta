package v0;

import android.os.CancellationSignal;
public final class g implements dd.l {
    public final CancellationSignal f48869a;

    public g(CancellationSignal cancellationSignal) {
        this.f48869a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f48869a.cancel();
        return sc.i.f47274a;
    }
}
