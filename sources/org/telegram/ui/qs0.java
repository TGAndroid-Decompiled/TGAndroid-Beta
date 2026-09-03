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
public final class qs0 implements pt {
    public final String f37471a;
    public final VideoEditedInfo f37472b;
    public final MediaController.PhotoEntry f37473c;
    public final boolean d;
    public final int e;
    public final int f37474f;
    public final boolean f37475g;
    public final PhotoViewer h;

    public qs0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10) {
        this.h = photoViewer;
        this.f37471a = str;
        this.f37472b = videoEditedInfo;
        this.f37473c = photoEntry;
        this.d = z4;
        this.e = i10;
        this.f37474f = i11;
        this.f37475g = z10;
    }

    @Override
    public final void A(CharSequence charSequence, String str, org.telegram.ui.Components.vk vkVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f31847t7 = true;
        R();
        photoViewer.f31781m5.p(this.f37471a, this.f37472b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f37473c.thumbPath, vkVar, null);
    }

    @Override
    public final boolean B() {
        if (this.h.f31856u7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String G(boolean z4) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f31820q7 != null) {
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
        photoViewer.f31847t7 = true;
        R();
        photoViewer.f31781m5.p(this.f37471a, this.f37472b, str, null, true, 0L, null, null, photoViewer.v1(), this.f37473c.thumbPath, null, null);
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
        rt q10 = rt.q();
        ImageReceiver imageReceiver = q10.A;
        MediaController.PhotoEntry photoEntry = this.f37473c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
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
    public final org.telegram.ui.Components.p70 d(ah.e eVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        return false;
    }

    @Override
    public final void n(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f31847t7 = true;
        R();
        photoViewer.f31781m5.p(this.f37471a, this.f37472b, str, null, false, 0L, null, null, photoViewer.v1(), this.f37473c.thumbPath, null, photoViewer.f31856u7);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f31847t7 = true;
        R();
        photoViewer.f31781m5.p(this.f37471a, this.f37472b, str, null, false, 0L, stickerSet, photoViewer.f31820q7, photoViewer.v1(), this.f37473c.thumbPath, null, null);
    }

    @Override
    public final boolean x() {
        PhotoViewer photoViewer = this.h;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null) {
            if (!ou0Var.P() || photoViewer.f31746i4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var != null) {
            boolean P = ou0Var.P();
            MediaController.PhotoEntry photoEntry = this.f37473c;
            if (P) {
                if (photoViewer.f31746i4 == null) {
                    return;
                }
                photoViewer.f31847t7 = true;
                R();
                photoViewer.f31781m5.p(this.f37471a, this.f37472b, str, null, false, photoViewer.f31746i4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f31847t7 = true;
            R();
            photoEntry.imagePath = this.f37471a;
            photoViewer.d.o(photoViewer.M4, this.f37472b, this.d, this.e, this.f37474f, this.f37475g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject z() {
        return null;
    }

    @Override
    public final void C(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
