package th;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.RadialProgress2;
public final class g extends sh.e {
    public final MessageObject f49199b;
    public final RadialProgress2 f49200c;

    public g(MessageObject messageObject) {
        this.f49199b = messageObject;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.f49200c = radialProgress2;
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
        radialProgress2.g(y6.ie, y6.f23473je, y6.f23680uc, y6.f23698vc);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.f49200c;
        radialProgress2.n(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void b() {
        super.b();
        this.f49200c.f();
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        RadialProgress2 radialProgress2 = this.f49200c;
        radialProgress2.setCircleRadius(i10 / 2);
        radialProgress2.r(0, 0, i10, i11);
        radialProgress2.draw(canvas);
    }
}
