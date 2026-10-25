package p4;

import android.media.MediaRouter;
public final class c0 extends MediaRouter.VolumeCallback {
    public final b0 f46654a;

    public c0(b0 b0Var) {
        this.f46654a = b0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f46654a.a(routeInfo, i10);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f46654a.b(routeInfo, i10);
    }
}
