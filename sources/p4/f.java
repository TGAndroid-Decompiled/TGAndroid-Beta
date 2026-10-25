package p4;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
public final class f extends MediaRouter2$ControllerCallback {
    public final k f46679a;

    public f(k kVar) {
        this.f46679a = kVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f46679a.r(routingController);
    }
}
