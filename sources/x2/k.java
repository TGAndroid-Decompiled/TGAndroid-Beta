package x2;

import android.media.Spatializer;
import e9.y0;
public final class k implements Spatializer.OnSpatializerStateChangedListener {
    public final q f45500a;

    public k(q qVar) {
        this.f45500a = qVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.f45500a;
        y0 y0Var = q.f45520l;
        qVar.f();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.f45500a;
        y0 y0Var = q.f45520l;
        qVar.f();
    }
}
