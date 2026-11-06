package uh;

import a8.wa;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import bg.s;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
import te.g;
public final class b extends Drawable implements x5 {
    public final te.a D;
    public final RadialProgress2 E;
    public ij F;
    public final wa G;
    public String H;
    public final int I;
    public boolean J;
    public int K;
    public int L;
    public final i6 f56781a;
    public final b9 f56782b;
    public final ImageReceiver f56783c;
    public final View d;
    public final int f56784e;
    public boolean f56785f;
    public boolean h;
    public boolean f56786n;
    public boolean f56787r;
    public Drawable f56788s;
    public boolean f56789w;
    public final Paint f56790x;
    public final Paint f56791y;

    public b(int i7, View view) {
        Paint paint = new Paint(1);
        this.f56790x = paint;
        this.f56791y = new Paint(1);
        this.G = new wa((char) 0, 18);
        this.f56784e = i7;
        this.d = view;
        this.D = new te.a(view, xq.h, 380L);
        i6 i6Var = new i6(false, false, false);
        this.f56781a = i6Var;
        i6Var.f34516b = 21;
        i6Var.w(g0.L(11.0f));
        i6Var.setCallback(view);
        this.f56782b = new b9(i7, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f56783c = imageReceiver;
        imageReceiver.J0(g0.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(18.0f));
        radialProgress2.d = -1;
        this.I = z5.q(i7).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j3;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, g0.L(36.0f), false, w10, true);
        hc f10 = hc.f(w11, photo);
        hc f11 = hc.f(w10, photo);
        if (w11 != null) {
            j3 = w11.size;
        } else {
            j3 = 0;
        }
        this.f56783c.r0(f10, "36_36", f11, "36_36_b", null, j3, null, obj, 1);
    }

    public final void b(boolean z9) {
        int i7;
        if (!this.F.p4() && !this.F.Z2()) {
            if (!TextUtils.isEmpty(this.H) && w7.G(this.f56784e).T(this.H)) {
                g(3, z9);
                return;
            }
            if (this.f56789w) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            g(i7, z9);
        }
    }

    public final void c(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        int x02;
        Rect bounds = getBounds();
        if (this.f56785f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int L = g0.L(f10);
        if (this.D.f55370e > 0.0f) {
            g gVar = this.f56782b.f32084c.d;
            float f11 = gVar.f55386c.f55396a;
            int i11 = (int) gVar.f55388f.f55396a;
            int W1 = (bounds.right - L) - g0.W1(f11, g0.L(2.0f), g0.L(4.0f) + i11);
            if (f11 > 0.0f) {
                b9 b9Var = this.f56782b;
                b9Var.f32088i = (int) (this.D.f55370e * 255.0f);
                b9Var.setBounds((bounds.right - L) - i11, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f56782b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            i6 i6Var = this.f56781a;
            i6Var.B = (int) (this.D.f55370e * 255.0f);
            i6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.f56781a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(k5.z(9.0f, bounds.right, L3), k5.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.E;
            radialProgress2.f31471a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f56783c.z0(rect);
            if (!this.f56786n || this.f56787r) {
                this.f56783c.h(canvas, null);
            }
            if (this.f56789w || this.f56786n) {
                if (this.f56786n && !this.f56787r) {
                    Paint paint = this.f56791y;
                    if (this.F.Q3()) {
                        i7 = k6.Tc;
                    } else {
                        i7 = k6.Sc;
                    }
                    paint.setColor(i0.a.o(k6.x0(null, i7, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f56791y);
                } else {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f56790x);
                }
            }
            if (this.f56786n) {
                if (this.f56788s == null) {
                    this.f56788s = jg.g.h(t0.f25555b, 2131231745);
                }
                Drawable drawable = this.f56788s;
                wa waVar = this.G;
                if (this.f56787r) {
                    x02 = -1;
                } else {
                    if (this.F.Q3()) {
                        i10 = k6.f27909gc;
                    } else {
                        i10 = k6.f27818be;
                    }
                    x02 = k6.x0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                waVar.getClass();
                if (((PorterDuffColorFilter) waVar.f701c) == null || waVar.f700b != x02 || ((PorterDuff.Mode) waVar.d) != mode) {
                    waVar.f701c = new PorterDuffColorFilter(x02, mode);
                    waVar.f700b = x02;
                    waVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) waVar.f701c);
                s.e(this.f56788s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.f56788s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        b9 b9Var = this.f56782b;
        float c10 = this.f56781a.c() + b9Var.f32084c.d.f55388f.f55396a;
        float L = b9Var.f32084c.d.f55386c.f55396a * g0.L(4.0f);
        float f11 = this.D.f55370e;
        return (f10 * f11) + (L * f11) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i7;
        float f10 = this.f56781a.d;
        int i10 = this.K;
        if (i10 > 0) {
            i7 = g0.L((i10 * 9.34f) + 8.66f);
        } else {
            i7 = 0;
        }
        return f10 + i7;
    }

    public final void f(boolean z9) {
        this.f56785f = z9;
    }

    public final void g(int i7, boolean z9) {
        if (this.L != i7) {
            this.L = i7;
            this.E.setIcon(i7, true, z9);
        }
    }

    @Override
    public final int getObserverTag() {
        return this.I;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(org.telegram.messenger.ij r27, org.telegram.tgnet.TLRPC.MessageMedia r28, org.telegram.messenger.ij r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: uh.b.h(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.ij, java.lang.String, boolean):void");
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        int i7;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.p(true, min);
        if (min < 1.0f) {
            i7 = 3;
        } else if (this.f56789w) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        g(i7, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z9) {
        int i7;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        this.K = i7;
        this.f56782b.d(arrayList, z9);
    }

    public final void k(int i7, boolean z9) {
        String str = null;
        if (i7 > 0) {
            str = hd.S(null, i7);
        }
        this.f56781a.t(str, z9, true);
    }

    public final void l(int i7) {
        this.f56781a.u(i7);
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        int i7;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.p(true, min);
        if (min < 1.0f) {
            i7 = 3;
        } else if (this.f56789w) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        g(i7, true);
        this.d.invalidate();
    }

    @Override
    public final void C(boolean z9) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
