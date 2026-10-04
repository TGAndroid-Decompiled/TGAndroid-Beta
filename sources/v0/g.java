package v0;

import android.os.CancellationSignal;
public final class g implements rd.l {
    public final CancellationSignal f47754a;

    public g(CancellationSignal cancellationSignal) {
        this.f47754a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f47754a.cancel();
        return gd.i.f10453a;
    }
}
