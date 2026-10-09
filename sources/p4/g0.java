package p4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f45363a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f45363a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f45363a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f45363a.requestUpdateVolume(i10);
    }
}
