package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f44095a;

    public g(CancellationSignal cancellationSignal) {
        this.f44095a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f44095a.cancel();
        return gd.i.f9602a;
    }
}
