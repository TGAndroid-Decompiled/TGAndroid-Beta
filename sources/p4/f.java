package p4;

import android.media.MediaRouter2;
public final class f extends MediaRouter2.ControllerCallback {
    public final k f39701a;

    public f(k kVar) {
        this.f39701a = kVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f39701a.r(routingController);
    }
}
