package z2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final Runnable f52638a;

    public c(Runnable runnable) {
        this.f52638a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f52638a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f52638a.run();
    }
}
