package s4;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
public final class f extends MediaRouter2$ControllerCallback {
    public final k f56997a;

    public f(k kVar) {
        this.f56997a = kVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f56997a.r(routingController);
    }
}
