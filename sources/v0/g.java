package v0;

import android.os.CancellationSignal;
public final class g implements td.l {
    public final CancellationSignal f48301a;

    public g(CancellationSignal cancellationSignal) {
        this.f48301a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f48301a.cancel();
        return id.i.f12807a;
    }
}
