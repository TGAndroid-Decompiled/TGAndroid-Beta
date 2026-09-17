package x2;

import android.media.Spatializer;
import e9.y0;
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final p f48731a;

    public j(p pVar) {
        this.f48731a = pVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f48731a;
        y0 y0Var = p.f48753l;
        pVar.f();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f48731a;
        y0 y0Var = p.f48753l;
        pVar.f();
    }
}
