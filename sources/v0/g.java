package v0;

import android.os.CancellationSignal;
public final class g implements td.l {
    public final CancellationSignal f47863a;

    public g(CancellationSignal cancellationSignal) {
        this.f47863a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47863a.cancel();
        return id.i.f12775a;
    }
}
