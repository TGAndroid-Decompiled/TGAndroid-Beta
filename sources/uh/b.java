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
import bg.s;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.y8;
import te.g;
public final class b extends Drawable implements x5 {
    public final te.a E;
    public final RadialProgress2 F;
    public gj G;
    public final xa H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final g6 f58408a;
    public final y8 f58409b;
    public final ImageReceiver f58410c;
    public final View d;
    public final int f58411e;
    public boolean f58412f;
    public boolean h;
    public boolean f58413n;
    public boolean f58414r;
    public Drawable f58415s;
    public boolean f58416w;
    public final Paint f58417x;
    public final Paint f58418y;

    public b(int i7, View view) {
        Paint paint = new Paint(1);
        this.f58417x = paint;
        this.f58418y = new Paint(1);
        this.H = new xa((char) 0, 18);
        this.f58411e = i7;
        this.d = view;
        this.E = new te.a(view, er.h, 380L);
        g6 g6Var = new g6(false, false, false);
        this.f58408a = g6Var;
        g6Var.f34829b = 21;
        g6Var.w(g0.L(11.0f));
        g6Var.setCallback(view);
        this.f58409b = new y8(i7, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f58410c = imageReceiver;
        imageReceiver.J0(g0.L(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(18.0f));
        radialProgress2.d = -1;
        this.J = z5.q(i7).k();
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
        this.f58410c.r0(f10, "36_36", f11, "36_36_b", null, j3, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i7;
        if (!this.G.o4() && !this.G.Y2()) {
            if (!TextUtils.isEmpty(this.I) && w7.G(this.f58411e).S(this.I)) {
                g(3, z10);
                return;
            }
            if (this.f58416w) {
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
        if (this.f58412f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int L = g0.L(f10);
        if (this.E.f57081e > 0.0f) {
            g gVar = this.f58409b.f41934c.d;
            float f11 = gVar.f57097c.f57107a;
            int i11 = (int) gVar.f57099f.f57107a;
            int W1 = (bounds.right - L) - g0.W1(f11, g0.L(2.0f), g0.L(4.0f) + i11);
            if (f11 > 0.0f) {
                y8 y8Var = this.f58409b;
                y8Var.f41938i = (int) (this.E.f57081e * 255.0f);
                y8Var.setBounds((bounds.right - L) - i11, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.f58409b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            g6 g6Var = this.f58408a;
            g6Var.C = (int) (this.E.f57081e * 255.0f);
            g6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.f58408a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(k5.z(9.0f, bounds.right, L3), k5.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.F;
            radialProgress2.f32655a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f58410c.z0(rect);
            if (!this.f58413n || this.f58414r) {
                this.f58410c.h(canvas, null);
            }
            if (this.f58416w || this.f58413n) {
                if (this.f58413n && !this.f58414r) {
                    Paint paint = this.f58418y;
                    if (this.G.P3()) {
                        i7 = j6.Wc;
                    } else {
                        i7 = j6.Vc;
                    }
                    paint.setColor(i0.a.o(j6.x0(null, i7, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f58418y);
                } else {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.f58417x);
                }
            }
            if (this.f58413n) {
                if (this.f58415s == null) {
                    this.f58415s = i5.c.g(t0.f26600b, 2131231745);
                }
                Drawable drawable = this.f58415s;
                xa xaVar = this.H;
                if (this.f58414r) {
                    x02 = -1;
                } else {
                    if (this.G.P3()) {
                        i10 = j6.f28964jc;
                    } else {
                        i10 = j6.f28875ee;
                    }
                    x02 = j6.x0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                xaVar.getClass();
                if (((PorterDuffColorFilter) xaVar.f714c) == null || xaVar.f713b != x02 || ((PorterDuff.Mode) xaVar.d) != mode) {
                    xaVar.f714c = new PorterDuffColorFilter(x02, mode);
                    xaVar.f713b = x02;
                    xaVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) xaVar.f714c);
                s.e(this.f58415s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.f58415s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        y8 y8Var = this.f58409b;
        float c10 = this.f58408a.c() + y8Var.f41934c.d.f57099f.f57107a;
        float L = y8Var.f41934c.d.f57097c.f57107a * g0.L(4.0f);
        float f11 = this.E.f57081e;
        return (f10 * f11) + (L * f11) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i7;
        float f10 = this.f58408a.d;
        int i10 = this.L;
        if (i10 > 0) {
            i7 = g0.L((i10 * 9.34f) + 8.66f);
        } else {
            i7 = 0;
        }
        return f10 + i7;
    }

    public final void f(boolean z10) {
        this.f58412f = z10;
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
        } else if (this.f58416w) {
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
        this.f58409b.d(arrayList, z10);
    }

    public final void k(int i7, boolean z10) {
        String str = null;
        if (i7 > 0) {
            str = hd.S(null, i7);
        }
        this.f58408a.t(str, z10, true);
    }

    public final void l(int i7) {
        this.f58408a.u(i7);
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
        } else if (this.f58416w) {
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
