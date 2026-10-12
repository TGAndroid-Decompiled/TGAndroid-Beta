package v0;

import android.os.CancellationSignal;
public final class g implements sd.l {
    public final CancellationSignal f49255a;

    public g(CancellationSignal cancellationSignal) {
        this.f49255a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f49255a.cancel();
        return hd.i.f11090a;
    }
}
