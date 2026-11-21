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
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.lz;
import org.telegram.messenger.n10;
import org.telegram.messenger.w7;
import org.telegram.messenger.y5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.ym0;
public final class e extends Drawable implements y5, xm0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public fj I;
    public double J;
    public int K;
    public final ym0 L;
    public float M;
    public float N;
    public lz O;
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
    public final te.a f57474a;
    public final ImageReceiver f57476b;
    public int f57477b0;
    public final int f57478c;
    public int f57479c0;
    public final ViewGroup d;
    public String f57481e;
    public final int f57482e0;
    public String f57483f;
    public int f57484f0;
    public int f57485g0;
    public String h;
    public int f57486h0;
    public xy0 f57487n;
    public xy0 f57488r;
    public xy0 f57489s;
    public xy0 f57490w;
    public final RadialProgress2 f57492y;
    public final Paint f57491x = new Paint(1);
    public int f57475a0 = 0;
    public int f57480d0 = 255;

    public e(int i7, ViewGroup viewGroup, h6 h6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f57476b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f57478c = i7;
        this.E = z10;
        this.f57492y = new RadialProgress2(viewGroup, h6Var);
        this.d = viewGroup;
        ym0 ym0Var = new ym0(viewGroup);
        this.L = ym0Var;
        ym0Var.h = this;
        this.f57474a = new te.a(viewGroup, se.a.f57187a, 180L);
        this.f57482e0 = a6.q(i7).k();
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
            MediaController.B().i0(MediaController.B().f22768v0, f10);
            p(true);
        }
    }

    public final void b() {
        this.f57476b.P();
        this.f57492y.e();
    }

    public final void c(boolean z10) {
        int i7;
        int i10;
        xy0 xy0Var = this.f57487n;
        if (xy0Var != null) {
            if (z10) {
                i10 = m6.wc;
            } else {
                i10 = m6.f29702ue;
            }
            xy0Var.n(m6.x0(null, i10, false));
        }
        this.f57491x.setColor(1711276032);
        xy0 xy0Var2 = this.f57490w;
        if (xy0Var2 != null) {
            xy0Var2.n(-1);
        }
        lz lzVar = this.O;
        if (lzVar != null) {
            if (z10) {
                i7 = m6.Gc;
            } else {
                i7 = m6.f29460hf;
            }
            lzVar.f25521m = i7;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.f57492y;
        if (!z11 && !this.X) {
            radialProgress2.g(m6.f29369cf, m6.f29386df, m6.f29405ef, m6.f29422ff);
            return;
        }
        ym0 ym0Var = this.L;
        if (z10) {
            int x02 = m6.x0(null, m6.f29566nc, false);
            int x03 = m6.x0(null, m6.f29584oc, false);
            int i11 = m6.f29624qc;
            ym0Var.g(x02, x03, m6.x0(null, i11, false), m6.x0(null, i11, false), m6.x0(null, m6.f29604pc, false));
            radialProgress2.g(m6.Ec, m6.Fc, m6.Gb, m6.Hb);
            return;
        }
        radialProgress2.g(m6.Ze, m6.f29329af, m6.f29532ld, m6.f29548md);
        int x04 = m6.x0(null, m6.le, false);
        int x05 = m6.x0(null, m6.f29549me, false);
        int i12 = m6.f29586oe;
        ym0Var.g(x04, x05, m6.x0(null, i12, false), m6.x0(null, i12, false), m6.x0(null, m6.ne, false));
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
        if (this.f57480d0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            e(false);
            boolean z10 = this.X;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f57492y;
            if (!z10 && !this.Y) {
                ImageReceiver imageReceiver = this.f57476b;
                imageReceiver.setAlpha(this.f57480d0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Z && (drawable = this.Q) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - nr.f37960k.getInterpolation(imageReceiver.f22669i1)) * g0.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f22669i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.H && this.f57490w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f57490w.f42254c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f57491x);
                    this.f57490w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
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
                xy0 xy0Var = this.f57487n;
                if (xy0Var != null) {
                    xy0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.Y) {
                    float f10 = this.f57474a.f57696e;
                    if (this.f57488r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f57488r.f42252a.setAlpha((int) (f11 * 255.0f));
                        this.f57488r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        ym0 ym0Var = this.L;
                        ym0Var.f42481t = f10;
                        ym0Var.i(n10.x(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.M = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        ym0Var.b(canvas);
                        canvas.restore();
                    }
                }
                xy0 xy0Var2 = this.f57489s;
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
                this.f57477b0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f57479c0 = L7;
                radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + i13, g0.L(44.0f) + g0.L(5.0f) + i15);
            }
            if (!this.Z) {
                fj fjVar = this.I;
                if (fjVar != null && fjVar.o4()) {
                    if (ec.D().x(this.G) == null) {
                        radialProgress2.p(true, 1.0f);
                        if (this.Y) {
                            m(6, true);
                        } else {
                            l(6);
                        }
                    }
                } else {
                    a aVar = this.R;
                    if (aVar != null && aVar.f57460g) {
                        if (this.Y) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.Y) {
                        if (aVar != null && aVar.f57459f) {
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
        if (this.f57475a0 != L || z10) {
            this.f57475a0 = L;
            String str = this.f57481e;
            if (str != null) {
                if (this.f57487n == null) {
                    this.f57487n = new xy0(str, 15.0f, g0.o());
                }
                xy0 xy0Var = this.f57487n;
                xy0Var.q(TextUtils.ellipsize(this.f57481e, xy0Var.f42252a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f57483f;
            if (str2 != null) {
                if (this.f57488r == null) {
                    this.f57488r = new xy0(str2, 14.0f, null);
                }
                xy0 xy0Var2 = this.f57488r;
                xy0Var2.q(TextUtils.ellipsize(this.f57483f, xy0Var2.f42252a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f57489s == null) {
                    this.f57489s = new xy0(str3, 12.0f, null);
                }
                xy0 xy0Var3 = this.f57489s;
                xy0Var3.q(TextUtils.ellipsize(this.h, xy0Var3.f42252a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.f57490w == null) {
                this.f57490w = new xy0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    public final int f() {
        boolean z10 = this.Y;
        if (z10 && this.f57474a.f57697f) {
            return !MediaController.B().H();
        }
        if (!this.H && !z10) {
            if (this.X) {
                a aVar = this.R;
                if (aVar != null && aVar.f57459f) {
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
            fj fjVar = MediaController.B().f22768v0;
            fjVar.f23953b0 = f10;
            fjVar.f23985i0 = (int) (fjVar.L0() * f10);
            p(true);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f57480d0;
    }

    @Override
    public final int getObserverTag() {
        return this.f57482e0;
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
        this.f57492y.p(true, min);
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
        if (this.Y && MediaController.B().I(this.I) && MediaController.B().f22768v0 != null && MediaController.B().f22768v0.m0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.Y || this.f57485g0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f57477b0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f57479c0 + L2;
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
                    TLRPC.Document document = aVar.f57456b;
                    int i12 = aVar.f57455a;
                    if (aVar.f57460g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f57459f) {
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
        if (this.f57484f0 != i7) {
            this.f57484f0 = i7;
            this.f57492y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z10) {
        if (this.f57485g0 != i7) {
            this.f57485g0 = i7;
            this.f57492y.k(i7, true, z10);
        }
    }

    public final void n(org.telegram.messenger.fj r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.fj r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: sh.e.n(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.fj, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f57492y.p(true, min);
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
            fj fjVar = MediaController.B().f22768v0;
            boolean j3 = j();
            this.f57474a.a(j3, z10);
            if (fjVar != null && j3) {
                i7 = fjVar.f23985i0;
                ym0 ym0Var = this.L;
                if (!ym0Var.f42467e) {
                    ym0Var.h(fjVar.f23953b0);
                    ym0Var.f42478q = fjVar.f23976g0;
                }
                ym0Var.j(fjVar);
            } else {
                i7 = 0;
            }
            if (this.f57486h0 != i7) {
                this.f57486h0 = i7;
                this.h = g0.k0(i7, (int) this.J);
                e(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f57480d0 = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
