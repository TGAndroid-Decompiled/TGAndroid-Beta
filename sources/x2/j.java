package x2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import e9.y0;
public final class j implements Spatializer$OnSpatializerStateChangedListener {
    public final p f50549a;

    public j(p pVar) {
        this.f50549a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        y0 y0Var = p.f50571l;
        this.f50549a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        y0 y0Var = p.f50571l;
        this.f50549a.f();
    }
}
