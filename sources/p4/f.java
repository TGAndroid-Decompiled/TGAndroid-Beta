package p4;

import android.media.MediaRouter2;
public final class f extends MediaRouter2.ControllerCallback {
    public final k f43830a;

    public f(k kVar) {
        this.f43830a = kVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f43830a.r(routingController);
    }
}
