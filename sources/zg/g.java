package zg;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RadialProgress2;
public final class g extends yg.e {
    public final MessageObject f50840b;
    public final RadialProgress2 f50841c;

    public g(MessageObject messageObject) {
        this.f50840b = messageObject;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.f50841c = radialProgress2;
        TLRPC.Document document = messageObject.getDocument();
        if (MessageObject.isDocumentHasThumb(document)) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
            radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = MessageObject.getArtworkUrl(document, true);
            if (!TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.h(artworkUrl);
            } else {
                radialProgress2.i(null, null, null);
            }
        }
        radialProgress2.g(f6.f23099ie, f6.f23116je, f6.f23309uc, f6.f23323vc);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.f50841c;
        radialProgress2.m(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void b() {
        super.b();
        this.f50841c.f();
    }

    @Override
    public final void c(Canvas canvas, int i9, int i10) {
        RadialProgress2 radialProgress2 = this.f50841c;
        radialProgress2.setCircleRadius(i9 / 2);
        radialProgress2.q(0, 0, i9, i10);
        radialProgress2.draw(canvas);
    }
}
