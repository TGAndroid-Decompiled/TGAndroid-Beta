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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
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
    public final h6 f56906a;
    public final a9 f56907b;
    public final ImageReceiver f56908c;
    public final View d;
    public final int f56909e;
    public boolean f56910f;
    public boolean h;
    public boolean f56911n;
    public boolean f56912r;
    public Drawable f56913s;
    public boolean f56914w;
    public final Paint f56915x;
    public final Paint f56916y;

    public b(int i7, View view) {
        Paint paint = new Paint(1);
        this.f56915x = paint;
        this.f56916y = new Paint(1);
        this.G = new wa((char) 0, 18);
        this.f56909e = i7;
        this.d = view;
        this.D = new te.a(view, wq.h, 380L);
        h6 h6Var = new h6(false, false, false);
        this.f56906a = h6Var;
        h6Var.f34187b = 21;
        h6Var.w(g0.L(11.0f));
        h6Var.setCallback(view);
        this.f56907b = new a9(i7, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f56908c = imageReceiver;
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
        this.f56908c.r0(f10, "36_36", f11, "36_36_b", null, j3, null, obj, 1);
    }

    public final void b(boolean z9) {
        int i7;
        if (!this.F.o4() && !this.F.Y2()) {
            if (!TextUtils.isEmpty(this.H) && w7.G(this.f56909e).S(this.H)) {
                g(3, z9);
                return;
            }
            if (this.f56914w) {
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
        if (this.f56910f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int L = g0.L(f10);
        if (this.D.f55498e > 0.0f) {
            g gVar = this.f56907b.f31797c.d;
            float f11 = gVar.f55514c.f55524a;
            int i11 = (int) gVar.f55516f.f55524a;
            int W1 = (bounds.right - L) - g0.W1(f11, g0.L(2.0f), g0.L(4.0f) + i11);
            if (f11 > 0.0f) {
                a9 a9Var = this.f56907b;
                a9Var.f31801i = (int) (this.D.f55498e * 255.0f);
                a9Var.setBounds((bounds.right - L) - i11, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f56907b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            h6 h6Var = this.f56906a;
            h6Var.B = (int) (this.D.f55498e * 255.0f);
            h6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.f56906a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(k5.z(9.0f, bounds.right, L3), k5.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.E;
            radialProgress2.f31492a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f56908c.z0(rect);
            if (!this.f56911n || this.f56912r) {
                this.f56908c.h(canvas, null);
            }
            if (this.f56914w || this.f56911n) {
                if (this.f56911n && !this.f56912r) {
                    Paint paint = this.f56916y;
                    if (this.F.P3()) {
                        i7 = m6.Tc;
                    } else {
                        i7 = m6.Sc;
                    }
                    paint.setColor(i0.a.o(m6.x0(null, i7, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f56916y);
                } else {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f56915x);
                }
            }
            if (this.f56911n) {
                if (this.f56913s == null) {
                    this.f56913s = jg.g.h(t0.f25570b, 2131231745);
                }
                Drawable drawable = this.f56913s;
                wa waVar = this.G;
                if (this.f56912r) {
                    x02 = -1;
                } else {
                    if (this.F.P3()) {
                        i10 = m6.f27951gc;
                    } else {
                        i10 = m6.f27860be;
                    }
                    x02 = m6.x0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                waVar.getClass();
                if (((PorterDuffColorFilter) waVar.f701c) == null || waVar.f700b != x02 || ((PorterDuff.Mode) waVar.d) != mode) {
                    waVar.f701c = new PorterDuffColorFilter(x02, mode);
                    waVar.f700b = x02;
                    waVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) waVar.f701c);
                s.e(this.f56913s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.f56913s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        a9 a9Var = this.f56907b;
        float c10 = this.f56906a.c() + a9Var.f31797c.d.f55516f.f55524a;
        float L = a9Var.f31797c.d.f55514c.f55524a * g0.L(4.0f);
        float f11 = this.D.f55498e;
        return (f10 * f11) + (L * f11) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i7;
        float f10 = this.f56906a.d;
        int i10 = this.K;
        if (i10 > 0) {
            i7 = g0.L((i10 * 9.34f) + 8.66f);
        } else {
            i7 = 0;
        }
        return f10 + i7;
    }

    public final void f(boolean z9) {
        this.f56910f = z9;
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
        } else if (this.f56914w) {
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
        this.f56907b.d(arrayList, z9);
    }

    public final void k(int i7, boolean z9) {
        String str = null;
        if (i7 > 0) {
            str = id.S(null, i7);
        }
        this.f56906a.t(str, z9, true);
    }

    public final void l(int i7) {
        this.f56906a.u(i7);
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
        } else if (this.f56914w) {
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
