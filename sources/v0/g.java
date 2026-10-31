package v0;

import android.os.CancellationSignal;
public final class g implements ld.l {
    public final CancellationSignal f50273a;

    public g(CancellationSignal cancellationSignal) {
        this.f50273a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f50273a.cancel();
        return ad.j.f401a;
    }
}
