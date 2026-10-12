package p4;

import android.media.MediaRouter;
public final class h0 extends q {
    public final MediaRouter.RouteInfo f43045a;

    public h0(MediaRouter.RouteInfo routeInfo) {
        this.f43045a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f43045a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f43045a.requestUpdateVolume(i10);
    }
}
