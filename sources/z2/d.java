package z2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
public final class d implements Spatializer$OnSpatializerStateChangedListener {
    public final Runnable f50640a;

    public d(Runnable runnable) {
        this.f50640a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f50640a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f50640a.run();
    }
}
