package rh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public final class w8 {
    public int f47653a;
    public final RectF f47654b;
    public final org.telegram.ui.Components.t5 f47655c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public LinearGradient f47656f;
    public final Matrix f47657g;
    public final Paint h;
    public final boolean f47658i;
    public long f47659j;
    public final ImageReceiver f47660k;
    public final org.telegram.ui.Components.r8 f47661l;
    public final org.telegram.ui.Components.r8 f47662m;
    public qz0 f47663n;
    public qz0 f47664o;
    public boolean f47665p;
    public final dc f47666q;
    public int f47667r;
    public Drawable f47668s;
    public Drawable f47669t;
    public qz0 f47670u;
    public int v;
    public final x8 f47671w;

    public w8(x8 x8Var, boolean z10, long j10) {
        String str;
        y8 y8Var = x8Var.f47701w;
        this.f47671w = x8Var;
        this.f47654b = new RectF();
        gr grVar = gr.h;
        this.f47655c = new org.telegram.ui.Components.t5(x8Var, 0L, 600L, grVar);
        this.d = new org.telegram.ui.Components.t5(x8Var, 0L, 200L, grVar);
        this.e = new org.telegram.ui.Components.t5(x8Var, 0L, 350L, grVar);
        this.f47656f = null;
        this.f47657g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(x8Var);
        this.f47660k = imageReceiver;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f47661l = r8Var;
        org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f47662m = r8Var2;
        this.f47666q = new dc(x8Var);
        this.f47658i = z10;
        this.f47659j = j10;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(y8Var.f47769j1).Z1(Long.valueOf(j10));
            str = h20.k(Z1);
            r8Var.r(Z1);
            imageReceiver.i0(Z1, r8Var, null);
        } else {
            TLRPC.Chat L0 = vp.r1(y8Var.f47769j1).L0(Long.valueOf(-j10));
            if (L0 == null) {
                str = "";
            } else {
                str = L0.title;
            }
            r8Var.q(L0);
            imageReceiver.i0(L0, r8Var, null);
        }
        imageReceiver.J0(org.telegram.messenger.i0.L(56.0f));
        imageReceiver.P();
        imageReceiver.A0 = true;
        r8Var2.g(21);
        r8Var2.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20912c8, y8Var.f47768i1));
        this.f47663n = new qz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float e = this.f47655c.e(false, this.f47653a);
        int i10 = this.f47653a;
        x8 x8Var = this.f47671w;
        if (i10 >= 0 && i10 < x8Var.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (x8Var.getWidth() - org.telegram.messenger.i0.L(80.0f)) / Math.max(1.0f, x8Var.f47698n);
        float L = ((x8Var.f47698n - (e + 0.5f)) * width) + org.telegram.messenger.i0.L(40.0f);
        float L2 = org.telegram.messenger.i0.L(40.0f);
        float f12 = width / 2.0f;
        this.f47654b.set(L - f12, L2 - org.telegram.messenger.i0.L(50.0f), f12 + L, org.telegram.messenger.i0.L(50.0f) + L2);
        float f13 = (0.3f * d) + 0.7f;
        canvas.scale(f13, f13, L, L2);
        float a2 = this.f47666q.a(0.04f);
        canvas.scale(a2, a2, L, L2);
        if (d > 0.0f) {
            float d10 = this.e.d(this.f47665p);
            if (d10 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f47660k;
                imageReceiver.y0(L - (org.telegram.messenger.i0.L(56.0f) / 2.0f), L2 - (org.telegram.messenger.i0.L(56.0f) / 2.0f), org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (d10 > 0.0f) {
                int i11 = (int) L;
                int L3 = i11 - (org.telegram.messenger.i0.L(56.0f) / 2);
                int i12 = (int) L2;
                int L4 = i12 - (org.telegram.messenger.i0.L(56.0f) / 2);
                int L5 = (org.telegram.messenger.i0.L(56.0f) / 2) + i11;
                int L6 = (org.telegram.messenger.i0.L(56.0f) / 2) + i12;
                org.telegram.ui.Components.r8 r8Var = this.f47662m;
                r8Var.setBounds(L3, L4, L5, L6);
                r8Var.f29879y = (int) (d * f11 * d10);
                r8Var.draw(canvas);
                r8Var.f29879y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((L - (this.f47664o.f29774c / f10)) - org.telegram.messenger.i0.L(5.66f), (org.telegram.messenger.i0.L(23.0f) + L2) - (org.telegram.messenger.i0.L(16.0f) / f10), (this.f47664o.f29774c / f10) + L + org.telegram.messenger.i0.L(5.66f), (org.telegram.messenger.i0.L(16.0f) / f10) + org.telegram.messenger.i0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, x8Var.f47697f);
        int i13 = (int) (d * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47656f != null) {
            Matrix matrix = this.f47657g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47656f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        qz0 qz0Var = this.f47664o;
        qz0Var.c(L - (qz0Var.f29774c / f10), org.telegram.messenger.i0.L(23.0f) + L2, d, -1, canvas);
        qz0 qz0Var2 = this.f47663n;
        qz0Var2.f29784p = width - org.telegram.messenger.i0.L(4.0f);
        qz0Var2.c(L - (this.f47663n.k() / f10), org.telegram.messenger.i0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, x8Var.f47701w.f47768i1), canvas);
        if (this.v > 0) {
            int i14 = (int) L;
            int i15 = (int) L2;
            this.f47669t.setBounds(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f) + i14, i15 - org.telegram.messenger.i0.L(16.0f));
            this.f47668s.setBounds(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f) + i14, i15 - org.telegram.messenger.i0.L(16.0f));
            this.f47669t.setAlpha(i13);
            this.f47668s.setAlpha(i13);
            this.f47669t.draw(canvas);
            this.f47668s.draw(canvas);
            qz0 qz0Var3 = this.f47670u;
            qz0Var3.c(L - (qz0Var3.f29774c / f10), L2 - org.telegram.messenger.i0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        x8 x8Var = this.f47671w;
        y8 y8Var = x8Var.f47701w;
        if (this.f47658i) {
            if (this.f47665p) {
                j11 = 2666000;
            } else if (this.f47659j == d20.i(y8Var.f47769j1).e()) {
                j11 = 0;
            } else {
                j11 = this.f47659j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47665p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = d20.i(y8Var.f47769j1).e();
                }
                this.f47659j = j10;
                if (this.f47665p) {
                    str2 = cd.L0(2131745066, null);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f47660k;
                    org.telegram.ui.Components.r8 r8Var = this.f47661l;
                    if (i11 >= 0) {
                        TLRPC.User Z1 = vp.r1(y8Var.f47769j1).Z1(Long.valueOf(this.f47659j));
                        str = h20.k(Z1);
                        r8Var.r(Z1);
                        imageReceiver.i0(Z1, r8Var, null);
                    } else {
                        TLRPC.Chat L0 = vp.r1(y8Var.f47769j1).L0(Long.valueOf(-this.f47659j));
                        if (L0 == null) {
                            str = "";
                        } else {
                            str = L0.title;
                        }
                        r8Var.q(L0);
                        imageReceiver.i0(L0, r8Var, null);
                    }
                    str2 = str;
                }
                this.f47663n = new qz0(str2, 12.0f, null);
                x8Var.invalidate();
            }
        }
    }
}
