package p4;

import android.media.MediaRouter;
public final class h0 extends q {
    public final MediaRouter.RouteInfo f45252a;

    public h0(MediaRouter.RouteInfo routeInfo) {
        this.f45252a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f45252a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f45252a.requestUpdateVolume(i10);
    }
}
