package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
public final class f extends sh.c {
    public final TLRPC.MessageMedia f58234b;

    public f(TLRPC.MessageMedia messageMedia) {
        this.f58234b = messageMedia;
        this.f57441a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.f57441a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(g0.f24009p));
        int i7 = i20.f24541i;
        imageReceiver.s0(gc.p(i20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f57441a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
