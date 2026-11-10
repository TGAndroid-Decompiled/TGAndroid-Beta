package s4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f54835a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f54835a = routeInfo;
    }

    @Override
    public final void f(int i7) {
        this.f54835a.requestSetVolume(i7);
    }

    @Override
    public final void i(int i7) {
        this.f54835a.requestUpdateVolume(i7);
    }
}
