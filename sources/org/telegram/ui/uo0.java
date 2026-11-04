package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uo0 implements gs {
    public final String f50162a;
    public final org.telegram.messenger.b20 f50163b;
    public final org.telegram.messenger.ye f50164c;
    public final boolean d;
    public final int f50165e;
    public final int f50166f;
    public final boolean f50167g;
    public final PhotoViewer h;

    public uo0(PhotoViewer photoViewer, String str, org.telegram.messenger.b20 b20Var, org.telegram.messenger.ye yeVar, boolean z10, int i3, int i10, boolean z11) {
        this.h = photoViewer;
        this.f50162a = str;
        this.f50163b = b20Var;
        this.f50164c = yeVar;
        this.d = z10;
        this.f50165e = i3;
        this.f50166f = i10;
        this.f50167g = z11;
    }

    @Override
    public final boolean A() {
        if (this.h.f41595y7 != null) {
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
        if (this.h.f41556u7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(CharSequence charSequence, String str, org.telegram.ui.Components.ei eiVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41585x7 = true;
        R();
        photoViewer.f41518q5.p(this.f50162a, this.f50163b, str, charSequence, false, 0L, null, null, photoViewer.x1(), this.f50164c.f25311c, eiVar, null);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41585x7 = true;
        R();
        photoViewer.f41518q5.p(this.f50162a, this.f50163b, str, null, true, 0L, null, null, photoViewer.x1(), this.f50164c.f25311c, null, null);
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
        is p10 = is.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.ye yeVar = this.f50164c;
        if (yeVar.f25311c != null) {
            try {
                new File(yeVar.f25311c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            yeVar.f25311c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p10.C.getWidth(), createBitmap.getHeight() / p10.C.getHeight());
            p10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, p10.C.getWidth(), p10.C.getHeight());
            path.addRoundRect(rectF, p10.C.getWidth() / 8.0f, p10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.V8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.zb.a0(createBitmap, photoViewer.i1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.U);
        yeVar.f25311c = org.telegram.messenger.w7.K(a02, null, true, true).toString();
    }

    @Override
    public final long a() {
        return this.h.F5;
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
    public final boolean k(int i3) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41585x7 = true;
        R();
        photoViewer.f41518q5.p(this.f50162a, this.f50163b, str, null, false, 0L, null, null, photoViewer.x1(), this.f50164c.f25311c, null, photoViewer.f41595y7);
    }

    @Override
    public final org.telegram.ui.Components.f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41585x7 = true;
        R();
        photoViewer.f41518q5.p(this.f50162a, this.f50163b, str, null, false, 0L, stickerSet, photoViewer.f41556u7, photoViewer.x1(), this.f50164c.f25311c, null, null);
    }

    @Override
    public final boolean x() {
        kq0 kq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        wm wmVar = photoViewer.f41481m4;
        if ((wmVar == null || (chat = wmVar.f51292e) == null || org.telegram.messenger.t3.t(chat)) && (kq0Var = photoViewer.d) != null) {
            if (!kq0Var.Q() || photoViewer.f41481m4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        kq0 kq0Var = photoViewer.d;
        if (kq0Var != null) {
            boolean Q = kq0Var.Q();
            org.telegram.messenger.ye yeVar = this.f50164c;
            if (Q) {
                if (photoViewer.f41481m4 == null) {
                    return;
                }
                photoViewer.f41585x7 = true;
                R();
                photoViewer.f41518q5.p(this.f50162a, this.f50163b, str, null, false, photoViewer.f41481m4.a(), null, null, photoViewer.x1(), yeVar.f25311c, null, null);
                return;
            }
            photoViewer.f41585x7 = true;
            R();
            yeVar.h = this.f50162a;
            photoViewer.d.o(photoViewer.Q4, this.f50163b, this.d, this.f50165e, this.f50166f, this.f50167g);
            org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0).m(org.telegram.messenger.hs.f23302s3, Boolean.TRUE);
        }
    }

    @Override
    public final org.telegram.messenger.zi z() {
        return null;
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
    public final void i(org.telegram.messenger.ry ryVar) {
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
    public final void J() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
