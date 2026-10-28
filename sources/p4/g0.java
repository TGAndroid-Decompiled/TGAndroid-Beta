package p4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f46728a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f46728a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f46728a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f46728a.requestUpdateVolume(i10);
    }
}
