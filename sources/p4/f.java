package p4;

import android.media.MediaRouter2;
public final class f extends MediaRouter2.ControllerCallback {
    public final k f44179a;

    public f(k kVar) {
        this.f44179a = kVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f44179a.r(routingController);
    }
}
