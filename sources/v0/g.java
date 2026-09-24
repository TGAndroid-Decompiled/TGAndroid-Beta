package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f44081a;

    public g(CancellationSignal cancellationSignal) {
        this.f44081a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f44081a.cancel();
        return gd.i.f9602a;
    }
}
