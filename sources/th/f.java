package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
public final class f extends sh.c {
    public final TLRPC.MessageMedia f57656b;

    public f(TLRPC.MessageMedia messageMedia) {
        this.f57656b = messageMedia;
        this.f56857a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.f56857a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(g0.f23610p));
        int i7 = k20.f24632i;
        imageReceiver.s0(gc.p(k20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f56857a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
