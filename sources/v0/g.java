package v0;

import android.os.CancellationSignal;
public final class g implements zc.l {
    public final CancellationSignal f48234a;

    public g(CancellationSignal cancellationSignal) {
        this.f48234a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f48234a.cancel();
        return oc.i.f19197a;
    }
}
