package p4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f44135a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f44135a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f44135a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f44135a.requestUpdateVolume(i10);
    }
}
