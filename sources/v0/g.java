package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f42833a;

    public g(CancellationSignal cancellationSignal) {
        this.f42833a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f42833a.cancel();
        return gd.i.f8748a;
    }
}
