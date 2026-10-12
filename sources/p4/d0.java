package p4;

import android.media.MediaRouter;
public final class d0 extends MediaRouter.VolumeCallback {
    public final c0 f43007a;

    public d0(c0 c0Var) {
        this.f43007a = c0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f43007a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f43007a.b(routeInfo, i10);
    }
}
