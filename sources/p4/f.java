package p4;

import android.media.MediaRouter2;
public final class f extends MediaRouter2.ControllerCallback {
    public final k f43831a;

    public f(k kVar) {
        this.f43831a = kVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f43831a.r(routingController);
    }
}
