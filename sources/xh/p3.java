package xh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.v5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.t5;
public final class p3 extends Drawable implements n6, us {
    public final Paint f53968a;
    public final Paint f53969b;
    public final ImageReceiver f53970c;
    public final ImageReceiver d;
    public int e;
    public final f5[] f53971f;
    public final qz0 h;
    public final RectF f53972n;
    public final boolean f53973r;
    public final t5 f53974s;
    public boolean f53975w;
    public boolean f53976x;
    public View f53977y;

    public p3(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f53968a = paint;
        Paint paint2 = new Paint(1);
        this.f53969b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f53970c = imageReceiver;
        this.d = new ImageReceiver(null);
        this.e = 1;
        this.f53971f = new f5[2];
        this.f53972n = new RectF();
        this.f53974s = new t5(new o3(this, 1), 320L, gr.h, 0);
        this.f53973r = false;
        int i10 = t6.f20929d6;
        paint.setColor(t6.x0(null, i10, false));
        paint2.setColor(t6.x0(null, i10, false));
        paint2.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(2.0f), t6.r1(0.18f, -16777216));
        r8 r8Var = new r8((p6) null);
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f));
        d();
        this.h = new qz0(h20.p(user), 14.0f, null);
    }

    @Override
    public final void a(ei0 ei0Var) {
        this.f53977y = ei0Var;
        this.d.H0(ei0Var);
        this.f53970c.H0(ei0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f53976x = false;
        this.f53970c.R();
        this.d.R();
        zs.f(d20.f15147s0).n(this, zs.C1);
        f5[] f5VarArr = this.f53971f;
        f5 f5Var = f5VarArr[0];
        if (f5Var != null) {
            f5Var.n(this.f53977y);
        }
        f5 f5Var2 = f5VarArr[1];
        if (f5Var2 != null) {
            f5Var2.n(this.f53977y);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f53976x = true;
        this.f53970c.P();
        this.d.P();
        zs.f(d20.f15147s0).c(this, zs.C1);
        f5[] f5VarArr = this.f53971f;
        f5 f5Var = f5VarArr[0];
        if (f5Var != null) {
            f5Var.a(this.f53977y);
        }
        f5 f5Var2 = f5VarArr[1];
        if (f5Var2 != null) {
            f5Var2.a(this.f53977y);
        }
    }

    public final void d() {
        f5 f5Var;
        TLRPC.TL_messages_stickerSet m0 = ui.b0(d20.f15147s0).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (m0 != null && !m0.documents.isEmpty()) {
            TLRPC.Document document = m0.documents.get((int) Math.floor(Math.random() * m0.documents.size()));
            int i10 = 1 - this.e;
            this.e = i10;
            f5[] f5VarArr = this.f53971f;
            f5 f5Var2 = f5VarArr[i10];
            if (f5Var2 != null) {
                f5Var2.n(this.f53977y);
            }
            f5VarArr[this.e] = f5.l(d20.f15147s0, 9, document);
            f5VarArr[this.e].setColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.Ci, false), PorterDuff.Mode.SRC_IN));
            if (this.f53976x && (f5Var = f5VarArr[this.e]) != null) {
                f5Var.a(this.f53977y);
            }
            org.telegram.messenger.i0.h3(new o3(this, 0), 2500L);
            return;
        }
        this.f53975w = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.B0 && this.f53975w && this.f53976x) {
            this.f53975w = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        f5 f5Var;
        f5 f5Var2;
        int i11;
        Rect bounds = getBounds();
        int x02 = t6.x0(null, t6.f20929d6, false);
        Paint paint = this.f53968a;
        if (paint.getColor() != x02) {
            paint.setColor(x02);
        }
        Paint paint2 = this.f53969b;
        if (paint2.getColor() != x02) {
            paint2.setColor(x02);
        }
        boolean z10 = this.f53973r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float L = (org.telegram.messenger.i0.L((i10 + 38) + 6.66f) + this.h.f29774c) / 2.0f;
        float L2 = org.telegram.messenger.i0.L(32.0f) / 2.0f;
        RectF rectF = this.f53972n;
        rectF.set(bounds.centerX() - L, bounds.centerY() - L2, bounds.centerX() + L, bounds.centerY() + L2);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        ImageReceiver imageReceiver = this.f53970c;
        imageReceiver.y0(rectF.left, rectF.top, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
        imageReceiver.h(canvas, null);
        this.h.c(org.telegram.messenger.i0.L(36.0f) + rectF.left, rectF.centerY(), 1.0f, t6.x0(null, t6.G6, false), canvas);
        if (z10) {
            float L3 = rectF.right - org.telegram.messenger.i0.L(22.66f);
            canvas.drawCircle(L3, rectF.centerY(), org.telegram.messenger.i0.L(24.0f), paint2);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.y0(L3 - org.telegram.messenger.i0.L(16.0f), rectF.centerY() - org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
            imageReceiver2.h(canvas, null);
            return;
        }
        float e = this.f53974s.e(false, this.e);
        canvas.save();
        canvas.translate((int) (rectF.right - org.telegram.messenger.i0.L(30.66f)), (int) (rectF.centerY() - org.telegram.messenger.i0.L(12.0f)));
        int i12 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        int i13 = -1;
        f5[] f5VarArr = this.f53971f;
        if (i12 < 0 && (f5Var2 = f5VarArr[0]) != null) {
            canvas.save();
            f7 = 24.0f;
            if (this.e == 0) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            canvas.translate(0.0f, i11 * org.telegram.messenger.i0.L(9.0f) * e);
            float f13 = 1.0f - e;
            f10 = 1.0f;
            float f14 = (f13 * 0.4f) + 0.6f;
            f11 = 12.0f;
            f12 = 255.0f;
            canvas.scale(f14, f14, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            f5Var2.setBounds(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            f5Var2.setAlpha((int) (f13 * 255.0f));
            f5Var2.draw(canvas);
            canvas.restore();
        } else {
            f7 = 24.0f;
            f10 = 1.0f;
            f11 = 12.0f;
            f12 = 255.0f;
        }
        if (e > 0.0f && (f5Var = f5VarArr[1]) != null) {
            canvas.save();
            if (this.e != 1) {
                i13 = 1;
            }
            canvas.translate(0.0f, (f10 - e) * org.telegram.messenger.i0.L(9.0f) * i13);
            float f15 = (0.4f * e) + 0.6f;
            canvas.scale(f15, f15, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f11));
            f5Var.setBounds(0, 0, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7));
            f5Var.setAlpha((int) (e * f12));
            f5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public p3(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f53968a = paint;
        Paint paint2 = new Paint(1);
        this.f53969b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f53970c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.e = 1;
        this.f53971f = new f5[2];
        this.f53972n = new RectF();
        this.f53974s = new t5(new o3(this, 1), 320L, gr.h, 0);
        this.f53973r = true;
        int i10 = t6.f20929d6;
        paint.setColor(t6.x0(null, i10, false));
        paint2.setColor(t6.x0(null, i10, false));
        paint2.setShadowLayer(org.telegram.messenger.i0.L(2.33f), 0.0f, org.telegram.messenger.i0.L(2.0f), t6.r1(0.18f, -16777216));
        r8 r8Var = new r8((p6) null);
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f));
        TLRPC.PhotoSize w9 = b8.w(document.thumbs, 120, false, null, false);
        imageReceiver2.r0(ic.b(document), "120_120", ic.c(w9, document), "120_120", v5.d(document.thumbs, t6.f20872a7, 0.35f, false), 0L, null, null, 0);
        this.h = new qz0(h20.p(user), 14.0f, null);
    }
}
