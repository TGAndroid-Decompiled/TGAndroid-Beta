package p4;

import android.media.MediaRouter;
public final class d0 extends MediaRouter.VolumeCallback {
    public final c0 f44709a;

    public d0(c0 c0Var) {
        this.f44709a = c0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f44709a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f44709a.b(routeInfo, i10);
    }
}
