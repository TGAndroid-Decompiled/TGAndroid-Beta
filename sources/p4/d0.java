package p4;

import android.media.MediaRouter;
public final class d0 extends MediaRouter.VolumeCallback {
    public final c0 f44720a;

    public d0(c0 c0Var) {
        this.f44720a = c0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f44720a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f44720a.b(routeInfo, i10);
    }
}
