package s4;

import android.media.MediaRouter;
public final class c0 extends MediaRouter.VolumeCallback {
    public final b0 f54799a;

    public c0(b0 b0Var) {
        this.f54799a = b0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i7) {
        this.f54799a.a(routeInfo, i7);
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i7) {
        this.f54799a.b(routeInfo, i7);
    }
}
