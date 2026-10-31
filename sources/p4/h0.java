package p4;

import android.media.MediaRouter;
public final class h0 extends q {
    public final MediaRouter.RouteInfo f44747a;

    public h0(MediaRouter.RouteInfo routeInfo) {
        this.f44747a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f44747a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f44747a.requestUpdateVolume(i10);
    }
}
