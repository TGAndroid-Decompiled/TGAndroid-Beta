package v0;

import android.os.CancellationSignal;

public final class g implements ad.l {

    public final CancellationSignal f48661a;

    public g(CancellationSignal cancellationSignal) {
        this.f48661a = cancellationSignal;
    }

    @Override
    public final Object invoke(Object obj) {
        this.f48661a.cancel();
        return pc.i.f45696a;
    }
}
