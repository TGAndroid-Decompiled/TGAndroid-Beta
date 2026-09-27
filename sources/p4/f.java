package p4;

import android.media.MediaRouter2;
public final class f extends MediaRouter2.ControllerCallback {
    public final k f40841a;

    public f(k kVar) {
        this.f40841a = kVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f40841a.r(routingController);
    }
}
