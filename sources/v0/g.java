package v0;

import android.os.CancellationSignal;
public final class g implements ud.l {
    public final CancellationSignal f49975a;

    public g(CancellationSignal cancellationSignal) {
        this.f49975a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f49975a.cancel();
        return jd.i.f15580a;
    }
}
