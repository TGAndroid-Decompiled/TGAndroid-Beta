package uh;

import a8.xa;
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
import bg.t;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a6;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.y5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import te.g;
public final class b extends Drawable implements y5 {
    public final te.a E;
    public final RadialProgress2 F;
    public fj G;
    public final xa H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final m6 f59100a;
    public final f9 f59101b;
    public final ImageReceiver f59102c;
    public final View d;
    public final int f59103e;
    public boolean f59104f;
    public boolean h;
    public boolean f59105n;
    public boolean f59106r;
    public Drawable f59107s;
    public boolean f59108w;
    public final Paint f59109x;
    public final Paint f59110y;

    public b(int i7, View view) {
        Paint paint = new Paint(1);
        this.f59109x = paint;
        this.f59110y = new Paint(1);
        this.H = new xa((char) 0, 18);
        this.f59103e = i7;
        this.d = view;
        this.E = new te.a(view, kr.h, 380L);
        m6 m6Var = new m6(false, false, false);
        this.f59100a = m6Var;
        m6Var.f37394b = 21;
        m6Var.w(g0.L(11.0f));
        m6Var.setCallback(view);
        this.f59101b = new f9(i7, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f59102c = imageReceiver;
        imageReceiver.K0(g0.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(18.0f));
        radialProgress2.d = -1;
        this.J = a6.q(i7).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j3;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, g0.L(36.0f), false, w10, true);
        fc f10 = fc.f(w11, photo);
        fc f11 = fc.f(w10, photo);
        if (w11 != null) {
            j3 = w11.size;
        } else {
            j3 = 0;
        }
        this.f59102c.s0(f10, "36_36", f11, "36_36_b", null, j3, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i7;
        if (!this.G.o4() && !this.G.Y2()) {
            if (!TextUtils.isEmpty(this.I) && w7.G(this.f59103e).S(this.I)) {
                g(3, z10);
                return;
            }
            if (this.f59108w) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            g(i7, z10);
        }
    }

    public final void c(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        int x02;
        Rect bounds = getBounds();
        if (this.f59104f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int L = g0.L(f10);
        if (this.E.f57779e > 0.0f) {
            g gVar = this.f59101b.f35058c.d;
            float f11 = gVar.f57795c.f57805a;
            int i11 = (int) gVar.f57797f.f57805a;
            int W1 = (bounds.right - L) - g0.W1(f11, g0.L(2.0f), g0.L(4.0f) + i11);
            if (f11 > 0.0f) {
                f9 f9Var = this.f59101b;
                f9Var.f35062i = (int) (this.E.f57779e * 255.0f);
                f9Var.setBounds((bounds.right - L) - i11, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f59101b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            m6 m6Var = this.f59100a;
            m6Var.C = (int) (this.E.f57779e * 255.0f);
            m6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.f59100a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(f3.z(9.0f, bounds.right, L3), f3.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.F;
            radialProgress2.f33152a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f59102c.A0(rect);
            if (!this.f59105n || this.f59106r) {
                this.f59102c.h(canvas, null);
            }
            if (this.f59108w || this.f59105n) {
                if (this.f59105n && !this.f59106r) {
                    Paint paint = this.f59110y;
                    if (this.G.P3()) {
                        i7 = n6.Wc;
                    } else {
                        i7 = n6.Vc;
                    }
                    paint.setColor(i0.a.o(n6.x0(null, i7, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f59110y);
                } else {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f59109x);
                }
            }
            if (this.f59105n) {
                if (this.f59107s == null) {
                    this.f59107s = i5.c.g(t0.f27013b, 2131231749);
                }
                Drawable drawable = this.f59107s;
                xa xaVar = this.H;
                if (this.f59106r) {
                    x02 = -1;
                } else {
                    if (this.G.P3()) {
                        i10 = n6.f29566jc;
                    } else {
                        i10 = n6.f29477ee;
                    }
                    x02 = n6.x0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                xaVar.getClass();
                if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != x02 || ((PorterDuff.Mode) xaVar.d) != mode) {
                    xaVar.f714c = new PorterDuffColorFilter(x02, mode);
                    xaVar.f713b = x02;
                    xaVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
                t.e(this.f59107s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.f59107s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        f9 f9Var = this.f59101b;
        float c10 = this.f59100a.c() + f9Var.f35058c.d.f57797f.f57805a;
        float L = f9Var.f35058c.d.f57795c.f57805a * g0.L(4.0f);
        float f11 = this.E.f57779e;
        return (f10 * f11) + (L * f11) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i7;
        float f10 = this.f59100a.d;
        int i10 = this.L;
        if (i10 > 0) {
            i7 = g0.L((i10 * 9.34f) + 8.66f);
        } else {
            i7 = 0;
        }
        return f10 + i7;
    }

    public final void f(boolean z10) {
        this.f59104f = z10;
    }

    public final void g(int i7, boolean z10) {
        if (this.M != i7) {
            this.M = i7;
            this.F.setIcon(i7, true, z10);
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

    public final void h(org.telegram.messenger.fj r27, org.telegram.tgnet.TLRPC.MessageMedia r28, org.telegram.messenger.fj r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: uh.b.h(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.fj, java.lang.String, boolean):void");
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
        this.F.p(true, min);
        if (min < 1.0f) {
            i7 = 3;
        } else if (this.f59108w) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        g(i7, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z10) {
        int i7;
        if (arrayList != null) {
            i7 = arrayList.size();
        } else {
            i7 = 0;
        }
        this.L = i7;
        this.f59101b.d(arrayList, z10);
    }

    public final void k(int i7, boolean z10) {
        String str = null;
        if (i7 > 0) {
            str = gd.S(null, i7);
        }
        this.f59100a.t(str, z10, true);
    }

    public final void l(int i7) {
        this.f59100a.u(i7);
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
        this.F.p(true, min);
        if (min < 1.0f) {
            i7 = 3;
        } else if (this.f59108w) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        g(i7, true);
        this.d.invalidate();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
