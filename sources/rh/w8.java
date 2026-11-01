package rh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
public final class w8 {
    public int f47663a;
    public final RectF f47664b;
    public final org.telegram.ui.Components.t5 f47665c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public LinearGradient f47666f;
    public final Matrix f47667g;
    public final Paint h;
    public final boolean f47668i;
    public long f47669j;
    public final ImageReceiver f47670k;
    public final org.telegram.ui.Components.r8 f47671l;
    public final org.telegram.ui.Components.r8 f47672m;
    public rz0 f47673n;
    public rz0 f47674o;
    public boolean f47675p;
    public final dc f47676q;
    public int f47677r;
    public Drawable f47678s;
    public Drawable f47679t;
    public rz0 f47680u;
    public int v;
    public final x8 f47681w;

    public w8(x8 x8Var, boolean z10, long j10) {
        String str;
        y8 y8Var = x8Var.f47715w;
        this.f47681w = x8Var;
        this.f47664b = new RectF();
        gr grVar = gr.h;
        this.f47665c = new org.telegram.ui.Components.t5(x8Var, 0L, 600L, grVar);
        this.d = new org.telegram.ui.Components.t5(x8Var, 0L, 200L, grVar);
        this.e = new org.telegram.ui.Components.t5(x8Var, 0L, 350L, grVar);
        this.f47666f = null;
        this.f47667g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(x8Var);
        this.f47670k = imageReceiver;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f47671l = r8Var;
        org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f47672m = r8Var2;
        this.f47676q = new dc(x8Var);
        this.f47668i = z10;
        this.f47669j = j10;
        if (j10 >= 0) {
            TLRPC.User Z1 = wp.r1(y8Var.f47781j1).Z1(Long.valueOf(j10));
            str = i20.k(Z1);
            r8Var.r(Z1);
            imageReceiver.i0(Z1, r8Var, null);
        } else {
            TLRPC.Chat L0 = wp.r1(y8Var.f47781j1).L0(Long.valueOf(-j10));
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
        r8Var2.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20913c8, y8Var.f47780i1));
        this.f47673n = new rz0(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float e = this.f47665c.e(false, this.f47663a);
        int i10 = this.f47663a;
        x8 x8Var = this.f47681w;
        if (i10 >= 0 && i10 < x8Var.d.size()) {
            z10 = true;
        }
        float d = this.d.d(z10);
        canvas.save();
        float width = (x8Var.getWidth() - org.telegram.messenger.i0.L(80.0f)) / Math.max(1.0f, x8Var.f47712n);
        float L = ((x8Var.f47712n - (e + 0.5f)) * width) + org.telegram.messenger.i0.L(40.0f);
        float L2 = org.telegram.messenger.i0.L(40.0f);
        float f12 = width / 2.0f;
        this.f47664b.set(L - f12, L2 - org.telegram.messenger.i0.L(50.0f), f12 + L, org.telegram.messenger.i0.L(50.0f) + L2);
        float f13 = (0.3f * d) + 0.7f;
        canvas.scale(f13, f13, L, L2);
        float a2 = this.f47676q.a(0.04f);
        canvas.scale(a2, a2, L, L2);
        if (d > 0.0f) {
            float d10 = this.e.d(this.f47675p);
            if (d10 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f47670k;
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
                org.telegram.ui.Components.r8 r8Var = this.f47672m;
                r8Var.setBounds(L3, L4, L5, L6);
                r8Var.f29935y = (int) (d * f11 * d10);
                r8Var.draw(canvas);
                r8Var.f29935y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((L - (this.f47674o.f30126c / f10)) - org.telegram.messenger.i0.L(5.66f), (org.telegram.messenger.i0.L(23.0f) + L2) - (org.telegram.messenger.i0.L(16.0f) / f10), (this.f47674o.f30126c / f10) + L + org.telegram.messenger.i0.L(5.66f), (org.telegram.messenger.i0.L(16.0f) / f10) + org.telegram.messenger.i0.L(23.0f) + L2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, x8Var.f47711f);
        int i13 = (int) (d * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47666f != null) {
            Matrix matrix = this.f47667g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47666f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        rz0 rz0Var = this.f47674o;
        rz0Var.c(L - (rz0Var.f30126c / f10), org.telegram.messenger.i0.L(23.0f) + L2, d, -1, canvas);
        rz0 rz0Var2 = this.f47673n;
        rz0Var2.f30136p = width - org.telegram.messenger.i0.L(4.0f);
        rz0Var2.c(L - (this.f47673n.k() / f10), org.telegram.messenger.i0.L(42.0f) + L2, d, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, x8Var.f47715w.f47780i1), canvas);
        if (this.v > 0) {
            int i14 = (int) L;
            int i15 = (int) L2;
            this.f47679t.setBounds(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f) + i14, i15 - org.telegram.messenger.i0.L(16.0f));
            this.f47678s.setBounds(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f) + i14, i15 - org.telegram.messenger.i0.L(16.0f));
            this.f47679t.setAlpha(i13);
            this.f47678s.setAlpha(i13);
            this.f47679t.draw(canvas);
            this.f47678s.draw(canvas);
            rz0 rz0Var3 = this.f47680u;
            rz0Var3.c(L - (rz0Var3.f30126c / f10), L2 - org.telegram.messenger.i0.L(27.0f), d, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        x8 x8Var = this.f47681w;
        y8 y8Var = x8Var.f47715w;
        if (this.f47668i) {
            if (this.f47675p) {
                j11 = 2666000;
            } else if (this.f47669j == e20.i(y8Var.f47781j1).e()) {
                j11 = 0;
            } else {
                j11 = this.f47669j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47675p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = e20.i(y8Var.f47781j1).e();
                }
                this.f47669j = j10;
                if (this.f47675p) {
                    str2 = dd.L0(2131745066, null);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f47670k;
                    org.telegram.ui.Components.r8 r8Var = this.f47671l;
                    if (i11 >= 0) {
                        TLRPC.User Z1 = wp.r1(y8Var.f47781j1).Z1(Long.valueOf(this.f47669j));
                        str = i20.k(Z1);
                        r8Var.r(Z1);
                        imageReceiver.i0(Z1, r8Var, null);
                    } else {
                        TLRPC.Chat L0 = wp.r1(y8Var.f47781j1).L0(Long.valueOf(-this.f47669j));
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
                this.f47673n = new rz0(str2, 12.0f, null);
                x8Var.invalidate();
            }
        }
    }
}
