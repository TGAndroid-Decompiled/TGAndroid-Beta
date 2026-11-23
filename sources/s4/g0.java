package s4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f57008a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f57008a = routeInfo;
    }

    @Override
    public final void f(int i7) {
        this.f57008a.requestSetVolume(i7);
    }

    @Override
    public final void i(int i7) {
        this.f57008a.requestUpdateVolume(i7);
    }
}
