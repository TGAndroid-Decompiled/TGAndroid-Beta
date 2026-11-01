package z2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final Runnable f54566a;

    public c(Runnable runnable) {
        this.f54566a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f54566a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f54566a.run();
    }
}
