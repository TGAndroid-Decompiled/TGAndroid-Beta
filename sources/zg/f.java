package zg;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public final class f extends yg.e {
    public final TLRPC.MessageMedia f50839b;

    public f(TLRPC.MessageMedia messageMedia) {
        this.f50839b = messageMedia;
        this.f50222a.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.f50222a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 38, 38, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) null, 0);
        }
    }

    @Override
    public final void c(Canvas canvas, int i9, int i10) {
        ImageReceiver imageReceiver = this.f50222a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i9, i10);
        imageReceiver.draw(canvas);
    }
}
