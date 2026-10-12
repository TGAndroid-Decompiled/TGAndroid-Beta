package p4;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
public final class f extends MediaRouter2$ControllerCallback {
    public final k f43030a;

    public f(k kVar) {
        this.f43030a = kVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f43030a.r(routingController);
    }
}
