package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f43761a;

    public g(CancellationSignal cancellationSignal) {
        this.f43761a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f43761a.cancel();
        return gd.i.f9603a;
    }
}
