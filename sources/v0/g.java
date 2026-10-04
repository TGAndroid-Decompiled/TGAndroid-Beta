package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f47746a;

    public g(CancellationSignal cancellationSignal) {
        this.f47746a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47746a.cancel();
        return gd.i.f10452a;
    }
}
