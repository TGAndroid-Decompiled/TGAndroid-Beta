package r4;

import android.media.MediaRouter;
public final class d0 extends MediaRouter.VolumeCallback {
    public final c0 f54256a;

    public d0(c0 c0Var) {
        this.f54256a = c0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.f54256a.a(routeInfo, i3);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i3) {
        this.f54256a.b(routeInfo, i3);
    }
}
