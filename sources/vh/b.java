package vh;

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
import b8.kg;
import cg.r;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z8;
import qe.g;
public final class b extends Drawable implements x5 {
    public final qe.a E;
    public final RadialProgress2 F;
    public zi G;
    public final kg H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final g6 f56942a;
    public final z8 f56943b;
    public final ImageReceiver f56944c;
    public final View d;
    public final int f56945e;
    public boolean f56946f;
    public boolean h;
    public boolean f56947n;
    public boolean f56948r;
    public Drawable f56949s;
    public boolean f56950w;
    public final Paint f56951x;
    public final Paint f56952y;

    public b(int i3, View view) {
        Paint paint = new Paint(1);
        this.f56951x = paint;
        this.f56952y = new Paint(1);
        this.H = new kg((char) 0, 19);
        this.f56945e = i3;
        this.d = view;
        this.E = new qe.a(view, xq.h, 380L);
        g6 g6Var = new g6(false, false, false);
        this.f56942a = g6Var;
        g6Var.f33983b = 21;
        g6Var.w(g0.L(11.0f));
        g6Var.setCallback(view);
        this.f56943b = new z8(i3, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f56944c = imageReceiver;
        imageReceiver.J0(g0.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(18.0f));
        radialProgress2.d = -1;
        this.J = z5.q(i3).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j10;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, g0.L(36.0f), false, w10, true);
        ac f10 = ac.f(w11, photo);
        ac f11 = ac.f(w10, photo);
        if (w11 != null) {
            j10 = w11.size;
        } else {
            j10 = 0;
        }
        this.f56944c.r0(f10, "36_36", f11, "36_36_b", null, j10, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i3;
        if (!this.G.p4() && !this.G.Z2()) {
            if (!TextUtils.isEmpty(this.I) && w7.G(this.f56945e).T(this.I)) {
                g(3, z10);
                return;
            }
            if (this.f56950w) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            g(i3, z10);
        }
    }

    public final void c(Canvas canvas) {
        float f10;
        int i3;
        int i10;
        int x02;
        Rect bounds = getBounds();
        if (this.f56946f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int L = g0.L(f10);
        if (this.E.f53840e > 0.0f) {
            g gVar = this.f56943b.f40986c.d;
            float f11 = gVar.f53856c.f53866a;
            int i11 = (int) gVar.f53858f.f53866a;
            int W1 = (bounds.right - L) - g0.W1(f11, g0.L(2.0f), g0.L(4.0f) + i11);
            if (f11 > 0.0f) {
                z8 z8Var = this.f56943b;
                z8Var.f40990i = (int) (this.E.f53840e * 255.0f);
                z8Var.setBounds((bounds.right - L) - i11, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f56943b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            g6 g6Var = this.f56942a;
            g6Var.B = (int) (this.E.f53840e * 255.0f);
            g6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.f56942a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(k5.z(9.0f, bounds.right, L3), k5.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.F;
            radialProgress2.f31548a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f56944c.z0(rect);
            if (!this.f56947n || this.f56948r) {
                this.f56944c.h(canvas, null);
            }
            if (this.f56950w || this.f56947n) {
                if (this.f56947n && !this.f56948r) {
                    Paint paint = this.f56952y;
                    if (this.G.Q3()) {
                        i3 = k6.Tc;
                    } else {
                        i3 = k6.Sc;
                    }
                    paint.setColor(i0.a.o(k6.x0(null, i3, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f56952y);
                } else {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f56951x);
                }
            }
            if (this.f56947n) {
                if (this.f56949s == null) {
                    this.f56949s = p1.g(t0.f25457b, 2131231745);
                }
                Drawable drawable = this.f56949s;
                kg kgVar = this.H;
                if (this.f56948r) {
                    x02 = -1;
                } else {
                    if (this.G.Q3()) {
                        i10 = k6.f27942gc;
                    } else {
                        i10 = k6.f27850be;
                    }
                    x02 = k6.x0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                kgVar.getClass();
                if (((PorterDuffColorFilter) kgVar.f2723c) == null || kgVar.f2722b != x02 || ((PorterDuff.Mode) kgVar.d) != mode) {
                    kgVar.f2723c = new PorterDuffColorFilter(x02, mode);
                    kgVar.f2722b = x02;
                    kgVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) kgVar.f2723c);
                r.e(this.f56949s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.f56949s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        z8 z8Var = this.f56943b;
        float c2 = this.f56942a.c() + z8Var.f40986c.d.f53858f.f53866a;
        float L = z8Var.f40986c.d.f53856c.f53866a * g0.L(4.0f);
        float f11 = this.E.f53840e;
        return (f10 * f11) + (L * f11) + c2;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i3;
        float f10 = this.f56942a.d;
        int i10 = this.L;
        if (i10 > 0) {
            i3 = g0.L((i10 * 9.34f) + 8.66f);
        } else {
            i3 = 0;
        }
        return f10 + i3;
    }

    public final void f(boolean z10) {
        this.f56946f = z10;
    }

    public final void g(int i3, boolean z10) {
        if (this.M != i3) {
            this.M = i3;
            this.F.setIcon(i3, true, z10);
        }
    }

    @Override
    public final int getObserverTag() {
        return this.J;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(org.telegram.messenger.zi r27, org.telegram.tgnet.TLRPC.MessageMedia r28, org.telegram.messenger.zi r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: vh.b.h(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.zi, java.lang.String, boolean):void");
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        int i3;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.F.p(true, min);
        if (min < 1.0f) {
            i3 = 3;
        } else if (this.f56950w) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        g(i3, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z10) {
        int i3;
        if (arrayList != null) {
            i3 = arrayList.size();
        } else {
            i3 = 0;
        }
        this.L = i3;
        this.f56943b.d(arrayList, z10);
    }

    public final void k(int i3, boolean z10) {
        String str = null;
        if (i3 > 0) {
            str = bd.S(null, i3);
        }
        this.f56942a.t(str, z10, true);
    }

    public final void l(int i3) {
        this.f56942a.u(i3);
    }

    @Override
    public final void o(long j10, long j11) {
        float min;
        int i3;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.F.p(true, min);
        if (min < 1.0f) {
            i3 = 3;
        } else if (this.f56950w) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        g(i3, true);
        this.d.invalidate();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void M(String str) {
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
