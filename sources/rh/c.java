package rh;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.RadialProgress2;
public final class c extends qh.e {
    public final String f47590b;
    public final Uri f47591c;
    public final String d;
    public final long f47592e;
    public final String f47593f;
    public final Drawable h;
    public final StaticLayout f47594n;

    public c(String str) {
        long j3;
        this.f47590b = str;
        this.f47591c = null;
        File file = new File(str);
        try {
            j3 = file.length();
        } catch (Throwable unused) {
            j3 = 0;
        }
        this.f47592e = j3;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f47593f = str2;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(name, str2, false);
        if (thumbForNameOrMime != 0) {
            this.h = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(i6.x0(null, i6.Bi, false));
            this.f47594n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f47594n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, MessageObject messageObject) {
        b bVar = new b();
        bVar.f47580a.setColor(i6.x0(null, i6.G6, false));
        bVar.f47581b.setColor(i6.x0(null, i6.f21185y6, false));
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f47582c = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(21.0f));
        bVar.f47582c.g(i6.f20900ie, i6.f20918je, i6.f21120uc, i6.f21137vc);
        if (MessageObject.isMusicDocument(document)) {
            if (MessageObject.isDocumentHasThumb(document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                bVar.f47582c.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
            } else {
                String artworkUrl = MessageObject.getArtworkUrl(document, true);
                if (!TextUtils.isEmpty(artworkUrl)) {
                    bVar.f47582c.h(artworkUrl);
                } else {
                    bVar.f47582c.i(null, null, null);
                }
            }
            bVar.f47582c.setIcon(0, false, false);
        } else {
            bVar.f47582c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.d = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f47583e = str2;
        bVar.f47589l = -1;
        bVar.f47584f = null;
        bVar.f47585g = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i10 - AndroidUtilities.dp(34.0f)) / 2.0f, AndroidUtilities.dp(15.0f));
            this.f47594n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f47590b = null;
        this.f47591c = uri;
        String fileName = MediaController.getFileName(uri);
        fileName = fileName == null ? "?" : fileName;
        this.d = fileName;
        String[] split = fileName.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f47593f = str;
        this.f47592e = 0L;
        int thumbForNameOrMime = AndroidUtilities.getThumbForNameOrMime(fileName, str, false);
        if (thumbForNameOrMime != 0) {
            this.h = ApplicationLoader.applicationContext.getResources().getDrawable(thumbForNameOrMime);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(i6.x0(null, i6.Bi, false));
            this.f47594n = new StaticLayout(TextUtils.ellipsize(str, textPaint, AndroidUtilities.dp(34.0f), TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f47594n = null;
    }
}
