package v0;

import android.os.CancellationSignal;
public final class g implements td.l {
    public final CancellationSignal f47855a;

    public g(CancellationSignal cancellationSignal) {
        this.f47855a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47855a.cancel();
        return id.i.f12775a;
    }
}
