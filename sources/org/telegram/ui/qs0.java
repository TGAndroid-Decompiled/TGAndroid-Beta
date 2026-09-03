package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qs0 implements ot {
    public final String f40635a;
    public final VideoEditedInfo f40636b;
    public final MediaController.PhotoEntry f40637c;
    public final boolean d;
    public final int f40638e;
    public final int f40639f;
    public final boolean f40640g;
    public final PhotoViewer h;

    public qs0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10) {
        this.h = photoViewer;
        this.f40635a = str;
        this.f40636b = videoEditedInfo;
        this.f40637c = photoEntry;
        this.d = z4;
        this.f40638e = i10;
        this.f40639f = i11;
        this.f40640g = z10;
    }

    @Override
    public final boolean A() {
        if (this.h.f34408u7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String F(boolean z4) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.q70 I(ag.l lVar) {
        return null;
    }

    @Override
    public final boolean J() {
        if (this.h.f34372q7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f34399t7 = true;
        R();
        photoViewer.f34333m5.p(this.f40635a, this.f40636b, str, null, true, 0L, null, null, photoViewer.v1(), this.f40637c.thumbPath, null, null);
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    public final void R() {
        qt q10 = qt.q();
        ImageReceiver imageReceiver = q10.A;
        MediaController.PhotoEntry photoEntry = this.f40637c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            photoEntry.thumbPath = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.draw(canvas);
        }
        if (q10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / q10.C.getWidth(), createBitmap.getHeight() / q10.C.getHeight());
            q10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, q10.C.getWidth(), q10.C.getHeight());
            path.addRoundRect(rectF, q10.C.getWidth() / 8.0f, q10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            q10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.Q8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.Q).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override
    public final long a() {
        return this.h.B5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f34399t7 = true;
        R();
        photoViewer.f34333m5.p(this.f40635a, this.f40636b, str, null, false, 0L, null, null, photoViewer.v1(), this.f40637c.thumbPath, null, photoViewer.f34408u7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f34399t7 = true;
        R();
        photoViewer.f34333m5.p(this.f40635a, this.f40636b, str, null, false, 0L, stickerSet, photoViewer.f34372q7, photoViewer.v1(), this.f40637c.thumbPath, null, null);
    }

    @Override
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null) {
            if (!ou0Var.P() || photoViewer.f34298i4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null) {
            boolean P = ou0Var.P();
            MediaController.PhotoEntry photoEntry = this.f40637c;
            if (P) {
                if (photoViewer.f34298i4 == null) {
                    return;
                }
                photoViewer.f34399t7 = true;
                R();
                photoViewer.f34333m5.p(this.f40635a, this.f40636b, str, null, false, photoViewer.f34298i4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f34399t7 = true;
            R();
            photoEntry.imagePath = this.f40635a;
            photoViewer.d.o(photoViewer.M4, this.f40636b, this.d, this.f40638e, this.f40639f, this.f40640g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final void z(CharSequence charSequence, String str, org.telegram.ui.Components.xk xkVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f34399t7 = true;
        R();
        photoViewer.f34333m5.p(this.f40635a, this.f40636b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f40637c.thumbPath, xkVar, null);
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
