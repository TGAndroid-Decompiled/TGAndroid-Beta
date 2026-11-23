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
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.y5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import te.g;
public final class b extends Drawable implements y5 {
    public final te.a E;
    public final RadialProgress2 F;
    public gj G;
    public final xa H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final n6 f58983a;
    public final g9 f58984b;
    public final ImageReceiver f58985c;
    public final View d;
    public final int f58986e;
    public boolean f58987f;
    public boolean h;
    public boolean f58988n;
    public boolean f58989r;
    public Drawable f58990s;
    public boolean f58991w;
    public final Paint f58992x;
    public final Paint f58993y;

    public b(int i7, View view) {
        Paint paint = new Paint(1);
        this.f58992x = paint;
        this.f58993y = new Paint(1);
        this.H = new xa((char) 0, 18);
        this.f58986e = i7;
        this.d = view;
        this.E = new te.a(view, nr.h, 380L);
        n6 n6Var = new n6(false, false, false);
        this.f58983a = n6Var;
        n6Var.f37751b = 21;
        n6Var.w(g0.L(11.0f));
        n6Var.setCallback(view);
        this.f58984b = new g9(i7, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f58985c = imageReceiver;
        imageReceiver.J0(g0.L(5.0f));
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
        gc f10 = gc.f(w11, photo);
        gc f11 = gc.f(w10, photo);
        if (w11 != null) {
            j3 = w11.size;
        } else {
            j3 = 0;
        }
        this.f58985c.r0(f10, "36_36", f11, "36_36_b", null, j3, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i7;
        if (!this.G.o4() && !this.G.Y2()) {
            if (!TextUtils.isEmpty(this.I) && w7.G(this.f58986e).S(this.I)) {
                g(3, z10);
                return;
            }
            if (this.f58991w) {
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
        if (this.f58987f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int L = g0.L(f10);
        if (this.E.f57665e > 0.0f) {
            g gVar = this.f58984b.f35442c.d;
            float f11 = gVar.f57681c.f57691a;
            int i11 = (int) gVar.f57683f.f57691a;
            int W1 = (bounds.right - L) - g0.W1(f11, g0.L(2.0f), g0.L(4.0f) + i11);
            if (f11 > 0.0f) {
                g9 g9Var = this.f58984b;
                g9Var.f35446i = (int) (this.E.f57665e * 255.0f);
                g9Var.setBounds((bounds.right - L) - i11, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f58984b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            n6 n6Var = this.f58983a;
            n6Var.C = (int) (this.E.f57665e * 255.0f);
            n6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.f58983a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(f3.z(9.0f, bounds.right, L3), f3.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.F;
            radialProgress2.f33054a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f58985c.z0(rect);
            if (!this.f58988n || this.f58989r) {
                this.f58985c.h(canvas, null);
            }
            if (this.f58991w || this.f58988n) {
                if (this.f58988n && !this.f58989r) {
                    Paint paint = this.f58993y;
                    if (this.G.P3()) {
                        i7 = m6.Wc;
                    } else {
                        i7 = m6.Vc;
                    }
                    paint.setColor(i0.a.o(m6.x0(null, i7, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f58993y);
                } else {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f58992x);
                }
            }
            if (this.f58988n) {
                if (this.f58990s == null) {
                    this.f58990s = i5.c.g(t0.f26895b, 2131231746);
                }
                Drawable drawable = this.f58990s;
                xa xaVar = this.H;
                if (this.f58989r) {
                    x02 = -1;
                } else {
                    if (this.G.P3()) {
                        i10 = m6.f29462jc;
                    } else {
                        i10 = m6.f29373ee;
                    }
                    x02 = m6.x0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                xaVar.getClass();
                if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != x02 || ((PorterDuff.Mode) xaVar.d) != mode) {
                    xaVar.f714c = new PorterDuffColorFilter(x02, mode);
                    xaVar.f713b = x02;
                    xaVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
                t.e(this.f58990s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.f58990s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        g9 g9Var = this.f58984b;
        float c10 = this.f58983a.c() + g9Var.f35442c.d.f57683f.f57691a;
        float L = g9Var.f35442c.d.f57681c.f57691a * g0.L(4.0f);
        float f11 = this.E.f57665e;
        return (f10 * f11) + (L * f11) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i7;
        float f10 = this.f58983a.d;
        int i10 = this.L;
        if (i10 > 0) {
            i7 = g0.L((i10 * 9.34f) + 8.66f);
        } else {
            i7 = 0;
        }
        return f10 + i7;
    }

    public final void f(boolean z10) {
        this.f58987f = z10;
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

    public final void h(org.telegram.messenger.gj r27, org.telegram.tgnet.TLRPC.MessageMedia r28, org.telegram.messenger.gj r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: uh.b.h(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.gj, java.lang.String, boolean):void");
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
        } else if (this.f58991w) {
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
        this.f58984b.d(arrayList, z10);
    }

    public final void k(int i7, boolean z10) {
        String str = null;
        if (i7 > 0) {
            str = hd.S(null, i7);
        }
        this.f58983a.t(str, z10, true);
    }

    public final void l(int i7) {
        this.f58983a.u(i7);
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
        } else if (this.f58991w) {
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
