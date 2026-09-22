package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f43808a;

    public g(CancellationSignal cancellationSignal) {
        this.f43808a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f43808a.cancel();
        return gd.i.f9617a;
    }
}
