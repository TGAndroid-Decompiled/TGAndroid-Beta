package sh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a6;
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.mz;
import org.telegram.messenger.o10;
import org.telegram.messenger.w7;
import org.telegram.messenger.y5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xy0;
public final class e extends Drawable implements y5, wm0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public gj I;
    public double J;
    public int K;
    public final xm0 L;
    public float M;
    public float N;
    public mz O;
    public eq P;
    public Drawable Q;
    public a R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final te.a f57443a;
    public final ImageReceiver f57445b;
    public int f57446b0;
    public final int f57447c;
    public int f57448c0;
    public final ViewGroup d;
    public String f57450e;
    public final int f57451e0;
    public String f57452f;
    public int f57453f0;
    public int f57454g0;
    public String h;
    public int f57455h0;
    public xy0 f57456n;
    public xy0 f57457r;
    public xy0 f57458s;
    public xy0 f57459w;
    public final RadialProgress2 f57461y;
    public final Paint f57460x = new Paint(1);
    public int f57444a0 = 0;
    public int f57449d0 = 255;

    public e(int i7, ViewGroup viewGroup, h6 h6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f57445b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f57447c = i7;
        this.E = z10;
        this.f57461y = new RadialProgress2(viewGroup, h6Var);
        this.d = viewGroup;
        xm0 xm0Var = new xm0(viewGroup);
        this.L = xm0Var;
        xm0Var.h = this;
        this.f57443a = new te.a(viewGroup, se.a.f57156a, 180L);
        this.f57451e0 = a6.q(i7).k();
    }

    @Override
    public final void C(boolean z10) {
        d();
    }

    @Override
    public final void N(String str) {
        d();
    }

    @Override
    public final void a(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().f22735v0, f10);
            p(true);
        }
    }

    public final void b() {
        this.f57445b.P();
        this.f57461y.e();
    }

    public final void c(boolean z10) {
        int i7;
        int i10;
        xy0 xy0Var = this.f57456n;
        if (xy0Var != null) {
            if (z10) {
                i10 = m6.wc;
            } else {
                i10 = m6.f29671ue;
            }
            xy0Var.n(m6.x0(null, i10, false));
        }
        this.f57460x.setColor(1711276032);
        xy0 xy0Var2 = this.f57459w;
        if (xy0Var2 != null) {
            xy0Var2.n(-1);
        }
        mz mzVar = this.O;
        if (mzVar != null) {
            if (z10) {
                i7 = m6.Gc;
            } else {
                i7 = m6.f29429hf;
            }
            mzVar.f25663m = i7;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.f57461y;
        if (!z11 && !this.X) {
            radialProgress2.g(m6.f29338cf, m6.f29355df, m6.f29374ef, m6.f29391ff);
            return;
        }
        xm0 xm0Var = this.L;
        if (z10) {
            int x02 = m6.x0(null, m6.f29535nc, false);
            int x03 = m6.x0(null, m6.f29553oc, false);
            int i11 = m6.f29593qc;
            xm0Var.g(x02, x03, m6.x0(null, i11, false), m6.x0(null, i11, false), m6.x0(null, m6.f29573pc, false));
            radialProgress2.g(m6.Ec, m6.Fc, m6.Gb, m6.Hb);
            return;
        }
        radialProgress2.g(m6.Ze, m6.f29298af, m6.f29501ld, m6.f29517md);
        int x04 = m6.x0(null, m6.le, false);
        int x05 = m6.x0(null, m6.f29518me, false);
        int i12 = m6.f29555oe;
        xm0Var.g(x04, x05, m6.x0(null, i12, false), m6.x0(null, i12, false), m6.x0(null, m6.ne, false));
    }

    public final void d() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int L2;
        int i7;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f57449d0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            e(false);
            boolean z10 = this.X;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f57461y;
            if (!z10 && !this.Y) {
                ImageReceiver imageReceiver = this.f57445b;
                imageReceiver.setAlpha(this.f57449d0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Z && (drawable = this.Q) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - nr.f37921k.getInterpolation(imageReceiver.f22636i1)) * g0.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f22636i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.H && this.f57459w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f57459w.f42224c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f57460x);
                    this.f57459w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
                }
            } else {
                int i12 = bounds.left;
                boolean z11 = this.E;
                if (z11) {
                    L = 0;
                } else {
                    L = g0.L(8.0f);
                }
                int i13 = i12 + L;
                int i14 = bounds.top;
                if (z11) {
                    L2 = 0;
                } else {
                    L2 = g0.L(3.0f);
                }
                int i15 = i14 + L2;
                if (!this.Y) {
                    i10 = g0.L(3.0f);
                }
                xy0 xy0Var = this.f57456n;
                if (xy0Var != null) {
                    xy0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.Y) {
                    float f10 = this.f57443a.f57665e;
                    if (this.f57457r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f57457r.f42222a.setAlpha((int) (f11 * 255.0f));
                        this.f57457r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        xm0 xm0Var = this.L;
                        xm0Var.f42142t = f10;
                        xm0Var.i(o10.x(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.M = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        xm0Var.b(canvas);
                        canvas.restore();
                    }
                }
                xy0 xy0Var2 = this.f57458s;
                if (xy0Var2 != null) {
                    float L5 = g0.L(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.Y) {
                        i7 = 20;
                    } else {
                        i7 = 2;
                    }
                    xy0Var2.e(canvas, L5, g0.L(i7 + 34) + i17);
                }
                int L6 = g0.L(2.0f) + i13;
                this.f57446b0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f57448c0 = L7;
                radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + i13, g0.L(44.0f) + g0.L(5.0f) + i15);
            }
            if (!this.Z) {
                gj gjVar = this.I;
                if (gjVar != null && gjVar.o4()) {
                    if (fc.D().x(this.G) == null) {
                        radialProgress2.p(true, 1.0f);
                        if (this.Y) {
                            m(6, true);
                        } else {
                            l(6);
                        }
                    }
                } else {
                    a aVar = this.R;
                    if (aVar != null && aVar.f57429g) {
                        if (this.Y) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.Y) {
                        if (aVar != null && aVar.f57428f) {
                            i11 = 4;
                        }
                        m(i11, true);
                    } else {
                        l(f());
                    }
                }
                if (this.Y) {
                    l(f());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e(boolean z10) {
        float f10;
        int width = getBounds().width();
        if (this.E) {
            f10 = 64.0f;
        } else {
            f10 = 72.0f;
        }
        int L = width - g0.L(f10);
        if (this.f57444a0 != L || z10) {
            this.f57444a0 = L;
            String str = this.f57450e;
            if (str != null) {
                if (this.f57456n == null) {
                    this.f57456n = new xy0(str, 15.0f, g0.o());
                }
                xy0 xy0Var = this.f57456n;
                xy0Var.q(TextUtils.ellipsize(this.f57450e, xy0Var.f42222a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f57452f;
            if (str2 != null) {
                if (this.f57457r == null) {
                    this.f57457r = new xy0(str2, 14.0f, null);
                }
                xy0 xy0Var2 = this.f57457r;
                xy0Var2.q(TextUtils.ellipsize(this.f57452f, xy0Var2.f42222a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f57458s == null) {
                    this.f57458s = new xy0(str3, 12.0f, null);
                }
                xy0 xy0Var3 = this.f57458s;
                xy0Var3.q(TextUtils.ellipsize(this.h, xy0Var3.f42222a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.f57459w == null) {
                this.f57459w = new xy0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    public final int f() {
        boolean z10 = this.Y;
        if (z10 && this.f57443a.f57666f) {
            return !MediaController.B().H();
        }
        if (!this.H && !z10) {
            if (this.X) {
                a aVar = this.R;
                if (aVar != null && aVar.f57428f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    @Override
    public final void g(float f10) {
        if (j()) {
            gj gjVar = MediaController.B().f22735v0;
            gjVar.f24137b0 = f10;
            gjVar.f24169i0 = (int) (gjVar.L0() * f10);
            p(true);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f57449d0;
    }

    @Override
    public final int getObserverTag() {
        return this.f57451e0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i7) {
        int i10;
        if (this.Y) {
            return g0.L(63.0f);
        }
        if (this.X) {
            return g0.L(56.0f);
        }
        int i11 = this.V;
        if (i11 == 0) {
            return g0.L(100.0f);
        }
        int round = Math.round((i7 / i11) * this.W);
        if (this.E) {
            i10 = (i7 * 4) / 5;
        } else {
            i10 = (i7 * 5) / 4;
        }
        return Math.min(round, i10);
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f57461y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        int i7 = 3;
        if (this.Y) {
            if (min >= 1.0f) {
                i7 = 4;
            }
            m(i7, true);
        } else {
            if (min >= 1.0f) {
                i7 = f();
            }
            l(i7);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        if (this.Y && MediaController.B().I(this.I) && MediaController.B().f22735v0 != null && MediaController.B().f22735v0.m0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.Y || this.f57454g0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f57446b0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f57448c0 + L2;
                if (f11 >= i11 && f11 <= i11 + L) {
                    this.S = true;
                    return true;
                }
            }
        }
        boolean z10 = this.S;
        if (z10) {
            if (i7 == 1) {
                a aVar = this.R;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f57425b;
                    int i12 = aVar.f57424a;
                    if (aVar.f57429g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f57428f) {
                        w7.G(i12).W(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    d();
                }
                this.S = false;
                return true;
            } else if (i7 == 3) {
                this.S = false;
                return true;
            }
        }
        return z10;
    }

    public final void l(int i7) {
        if (this.f57453f0 != i7) {
            this.f57453f0 = i7;
            this.f57461y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z10) {
        if (this.f57454g0 != i7) {
            this.f57454g0 = i7;
            this.f57461y.k(i7, true, z10);
        }
    }

    public final void n(org.telegram.messenger.gj r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.gj r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: sh.e.n(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.gj, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f57461y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        int i7 = 3;
        if (this.Y) {
            if (min >= 1.0f) {
                i7 = 4;
            }
            m(i7, true);
        } else {
            if (min >= 1.0f) {
                i7 = f();
            }
            l(i7);
        }
        this.d.invalidate();
    }

    public final void p(boolean z10) {
        int i7;
        if (this.Y && this.I != null) {
            gj gjVar = MediaController.B().f22735v0;
            boolean j3 = j();
            this.f57443a.a(j3, z10);
            if (gjVar != null && j3) {
                i7 = gjVar.f24169i0;
                xm0 xm0Var = this.L;
                if (!xm0Var.f42128e) {
                    xm0Var.h(gjVar.f24137b0);
                    xm0Var.f42139q = gjVar.f24160g0;
                }
                xm0Var.j(gjVar);
            } else {
                i7 = 0;
            }
            if (this.f57455h0 != i7) {
                this.f57455h0 = i7;
                this.h = g0.k0(i7, (int) this.J);
                e(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f57449d0 = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
