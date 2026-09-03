package v0;

import android.os.CancellationSignal;
public final class g implements dd.l {
    public final CancellationSignal f45607a;

    public g(CancellationSignal cancellationSignal) {
        this.f45607a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f45607a.cancel();
        return sc.i.f44318a;
    }
}
