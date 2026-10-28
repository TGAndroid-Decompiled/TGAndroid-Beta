package v0;

import android.os.CancellationSignal;
public final class g implements ud.l {
    public final CancellationSignal f50010a;

    public g(CancellationSignal cancellationSignal) {
        this.f50010a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f50010a.cancel();
        return jd.i.f15579a;
    }
}
