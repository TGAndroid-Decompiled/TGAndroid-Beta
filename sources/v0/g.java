package v0;

import android.os.CancellationSignal;
public final class g implements td.l {
    public final CancellationSignal f47853a;

    public g(CancellationSignal cancellationSignal) {
        this.f47853a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47853a.cancel();
        return id.i.f12777a;
    }
}
