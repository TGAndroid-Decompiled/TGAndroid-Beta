package p4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f40854a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f40854a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f40854a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f40854a.requestUpdateVolume(i10);
    }
}
