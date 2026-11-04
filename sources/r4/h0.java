package r4;

import android.media.MediaRouter;
public final class h0 extends q {
    public final MediaRouter.RouteInfo f54295a;

    public h0(MediaRouter.RouteInfo routeInfo) {
        this.f54295a = routeInfo;
    }

    @Override
    public final void f(int i3) {
        this.f54295a.requestSetVolume(i3);
    }

    @Override
    public final void i(int i3) {
        this.f54295a.requestUpdateVolume(i3);
    }
}
