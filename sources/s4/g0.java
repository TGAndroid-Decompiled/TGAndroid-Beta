package s4;

import android.media.MediaRouter;
public final class g0 extends q {
    public final MediaRouter.RouteInfo f54731a;

    public g0(MediaRouter.RouteInfo routeInfo) {
        this.f54731a = routeInfo;
    }

    @Override
    public final void f(int i7) {
        this.f54731a.requestSetVolume(i7);
    }

    @Override
    public final void i(int i7) {
        this.f54731a.requestUpdateVolume(i7);
    }
}
