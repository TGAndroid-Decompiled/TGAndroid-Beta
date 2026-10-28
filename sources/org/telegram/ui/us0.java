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
public final class us0 implements ft {
    public final String f44100a;
    public final VideoEditedInfo f44101b;
    public final MediaController.PhotoEntry f44102c;
    public final boolean d;
    public final int e;
    public final int f44103f;
    public final boolean f44104g;
    public final PhotoViewer h;

    public us0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f44100a = str;
        this.f44101b = videoEditedInfo;
        this.f44102c = photoEntry;
        this.d = z10;
        this.e = i10;
        this.f44103f = i11;
        this.f44104g = z11;
    }

    @Override
    public final boolean A() {
        if (this.h.f35847x7 != null) {
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
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        if (this.h.f35809t7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean M(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void N(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35837w7 = true;
        R();
        photoViewer.f35771p5.p(this.f44100a, this.f44101b, str, null, true, 0L, null, null, photoViewer.x1(), this.f44102c.thumbPath, null, null);
    }

    @Override
    public final void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35837w7 = true;
        R();
        photoViewer.f35771p5.p(this.f44100a, this.f44101b, str, charSequence, false, 0L, null, null, photoViewer.x1(), this.f44102c.thumbPath, oyVar, null);
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
        ht o10 = ht.o();
        ImageReceiver imageReceiver = o10.A;
        MediaController.PhotoEntry photoEntry = this.f44102c;
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
        if (o10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / o10.C.getWidth(), createBitmap.getHeight() / o10.C.getHeight());
            o10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, o10.C.getWidth(), o10.C.getHeight());
            path.addRoundRect(rectF, o10.C.getWidth() / 8.0f, o10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            o10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.T).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.i1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override
    public final long a() {
        return this.h.E5;
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
    public final org.telegram.ui.Components.l80 i(bh.p pVar) {
        return null;
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
        photoViewer.f35837w7 = true;
        R();
        photoViewer.f35771p5.p(this.f44100a, this.f44101b, str, null, false, 0L, null, null, photoViewer.x1(), this.f44102c.thumbPath, null, photoViewer.f35847x7);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35837w7 = true;
        R();
        photoViewer.f35771p5.p(this.f44100a, this.f44101b, str, null, false, 0L, stickerSet, photoViewer.f35809t7, photoViewer.x1(), this.f44102c.thumbPath, null, null);
    }

    @Override
    public final boolean x() {
        PhotoViewer photoViewer = this.h;
        qu0 qu0Var = photoViewer.d;
        if (qu0Var != null) {
            if (!qu0Var.Q() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        qu0 qu0Var = photoViewer.d;
        if (qu0Var != null) {
            boolean Q = qu0Var.Q();
            MediaController.PhotoEntry photoEntry = this.f44102c;
            if (Q) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.f35837w7 = true;
                R();
                photoViewer.f35771p5.p(this.f44100a, this.f44101b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.x1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f35837w7 = true;
            R();
            photoEntry.imagePath = this.f44100a;
            photoViewer.d.o(photoViewer.P4, this.f44101b, this.d, this.e, this.f44103f, this.f44104g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject z() {
        return null;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
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
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
