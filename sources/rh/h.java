package rh;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
public final class h extends qh.e {
    public final TLRPC.Document f42886b;
    public final Object f42887c;

    public h(TLRPC.Document document, Object obj) {
        boolean z10;
        String str;
        this.f42886b = document;
        this.f42887c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.f42050a;
        if (!MessageObject.isStickerDocument(document) && !MessageObject.isVideoSticker(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        MessageObject.isAnimatedStickerDocument(document, true);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, h6.f19210lc, 1.0f);
        boolean z11 = z10;
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        long j3 = document.size;
        if (z11) {
            str = "webp";
        } else {
            str = null;
        }
        imageReceiver.setImage(forDocument, "38_38", svgThumb, j3, str, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f42050a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
