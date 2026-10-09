package x2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import e9.y0;
public final class j implements Spatializer$OnSpatializerStateChangedListener {
    public final p f50503a;

    public j(p pVar) {
        this.f50503a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        y0 y0Var = p.f50525l;
        this.f50503a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        y0 y0Var = p.f50525l;
        this.f50503a.f();
    }
}
