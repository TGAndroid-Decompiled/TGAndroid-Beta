package x2;

import android.media.Spatializer;
import e9.y0;
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final p f45462a;

    public j(p pVar) {
        this.f45462a = pVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f45462a;
        y0 y0Var = p.f45482l;
        pVar.f();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f45462a;
        y0 y0Var = p.f45482l;
        pVar.f();
    }
}
