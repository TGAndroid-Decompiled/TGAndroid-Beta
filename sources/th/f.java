package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
public final class f extends sh.c {
    public final TLRPC.MessageMedia f58265b;

    public f(TLRPC.MessageMedia messageMedia) {
        this.f58265b = messageMedia;
        this.f57472a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.f57472a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(g0.f24145p));
        int i7 = h20.f24400i;
        imageReceiver.s0(fc.p(h20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.f57472a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
