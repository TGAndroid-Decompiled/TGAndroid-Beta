package p4;

import android.media.MediaRouter;
public final class c0 extends MediaRouter.VolumeCallback {
    public final b0 f43804a;

    public c0(b0 b0Var) {
        this.f43804a = b0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f43804a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f43804a.b(routeInfo, i10);
    }
}
