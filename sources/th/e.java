package th;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.jz;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xq;
public final class e extends Drawable implements x5, lm0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public zi I;
    public double J;
    public int K;
    public final mm0 L;
    public float M;
    public float N;
    public jz O;
    public np P;
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
    public final qe.a f55400a;
    public final ImageReceiver f55402b;
    public int f55403b0;
    public final int f55404c;
    public int f55405c0;
    public final ViewGroup d;
    public String f55407e;
    public final int f55408e0;
    public String f55409f;
    public int f55410f0;
    public int f55411g0;
    public String h;
    public int f55412h0;
    public ly0 f55413n;
    public ly0 f55414r;
    public ly0 f55415s;
    public ly0 f55416w;
    public final RadialProgress2 f55418y;
    public final Paint f55417x = new Paint(1);
    public int f55401a0 = 0;
    public int f55406d0 = 255;

    public e(int i3, ViewGroup viewGroup, e6 e6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f55402b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f55404c = i3;
        this.E = z10;
        this.f55418y = new RadialProgress2(viewGroup, e6Var);
        this.d = viewGroup;
        mm0 mm0Var = new mm0(viewGroup);
        this.L = mm0Var;
        mm0Var.h = this;
        this.f55400a = new qe.a(viewGroup, pe.a.f53446a, 180L);
        this.f55408e0 = z5.q(i3).k();
    }

    @Override
    public final void C(boolean z10) {
        e();
    }

    @Override
    public final void M(String str) {
        e();
    }

    public final void a() {
        this.f55402b.P();
        this.f55418y.e();
    }

    public final void b(boolean z10) {
        int i3;
        int i10;
        ly0 ly0Var = this.f55413n;
        if (ly0Var != null) {
            if (z10) {
                i10 = k6.tc;
            } else {
                i10 = k6.f28147re;
            }
            ly0Var.n(k6.x0(null, i10, false));
        }
        this.f55417x.setColor(1711276032);
        ly0 ly0Var2 = this.f55416w;
        if (ly0Var2 != null) {
            ly0Var2.n(-1);
        }
        jz jzVar = this.O;
        if (jzVar != null) {
            if (z10) {
                i3 = k6.Dc;
            } else {
                i3 = k6.f27906ef;
            }
            jzVar.f23770m = i3;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.f55418y;
        if (!z11 && !this.X) {
            radialProgress2.g(k6.Ze, k6.f27831af, k6.f27851bf, k6.f27868cf);
            return;
        }
        mm0 mm0Var = this.L;
        if (z10) {
            int x02 = k6.x0(null, k6.f28013kc, false);
            int x03 = k6.x0(null, k6.f28031lc, false);
            int i11 = k6.f28068nc;
            mm0Var.g(x02, x03, k6.x0(null, i11, false), k6.x0(null, i11, false), k6.x0(null, k6.f28049mc, false));
            radialProgress2.g(k6.Bc, k6.Cc, k6.Db, k6.Eb);
            return;
        }
        radialProgress2.g(k6.We, k6.Xe, k6.f27979id, k6.f27995jd);
        int x04 = k6.x0(null, k6.ie, false);
        int x05 = k6.x0(null, k6.f27996je, false);
        int i12 = k6.f28033le;
        mm0Var.g(x04, x05, k6.x0(null, i12, false), k6.x0(null, i12, false), k6.x0(null, k6.ke, false));
    }

    @Override
    public final void c(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().f21348v0, f10);
            p(true);
        }
    }

    @Override
    public final void d(float f10) {
        if (j()) {
            zi ziVar = MediaController.B().f21348v0;
            ziVar.f26828b0 = f10;
            ziVar.f26851g0 = (int) (ziVar.L0() * f10);
            p(true);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int L2;
        int i3;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f55406d0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            f(false);
            boolean z10 = this.X;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f55418y;
            if (!z10 && !this.Y) {
                ImageReceiver imageReceiver = this.f55402b;
                imageReceiver.setAlpha(this.f55406d0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Z && (drawable = this.Q) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                    int z11 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - xq.f40456k.getInterpolation(imageReceiver.f21249i1)) * g0.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f21249i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(z11, interpolation, intrinsicWidth + z11, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.H && this.f55416w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f55416w.f35918c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f55417x);
                    this.f55416w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
                }
            } else {
                int i12 = bounds.left;
                boolean z12 = this.E;
                if (z12) {
                    L = 0;
                } else {
                    L = g0.L(8.0f);
                }
                int i13 = i12 + L;
                int i14 = bounds.top;
                if (z12) {
                    L2 = 0;
                } else {
                    L2 = g0.L(3.0f);
                }
                int i15 = i14 + L2;
                if (!this.Y) {
                    i10 = g0.L(3.0f);
                }
                ly0 ly0Var = this.f55413n;
                if (ly0Var != null) {
                    ly0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.Y) {
                    float f10 = this.f55400a.f53840e;
                    if (this.f55414r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f55414r.f35916a.setAlpha((int) (f11 * 255.0f));
                        this.f55414r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        mm0 mm0Var = this.L;
                        mm0Var.f36205t = f10;
                        mm0Var.i(q.w(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.M = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        mm0Var.b(canvas);
                        canvas.restore();
                    }
                }
                ly0 ly0Var2 = this.f55415s;
                if (ly0Var2 != null) {
                    float L5 = g0.L(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.Y) {
                        i3 = 20;
                    } else {
                        i3 = 2;
                    }
                    ly0Var2.e(canvas, L5, g0.L(i3 + 34) + i17);
                }
                int L6 = g0.L(2.0f) + i13;
                this.f55403b0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f55405c0 = L7;
                radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + i13, g0.L(44.0f) + g0.L(5.0f) + i15);
            }
            if (!this.Z) {
                zi ziVar = this.I;
                if (ziVar != null && ziVar.p4()) {
                    if (zb.D().x(this.G) == null) {
                        radialProgress2.p(true, 1.0f);
                        if (this.Y) {
                            m(6, true);
                        } else {
                            l(6);
                        }
                    }
                } else {
                    a aVar = this.R;
                    if (aVar != null && aVar.f55386g) {
                        if (this.Y) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.Y) {
                        if (aVar != null && aVar.f55385f) {
                            i11 = 4;
                        }
                        m(i11, true);
                    } else {
                        l(g());
                    }
                }
                if (this.Y) {
                    l(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        float f10;
        int width = getBounds().width();
        if (this.E) {
            f10 = 64.0f;
        } else {
            f10 = 72.0f;
        }
        int L = width - g0.L(f10);
        if (this.f55401a0 != L || z10) {
            this.f55401a0 = L;
            String str = this.f55407e;
            if (str != null) {
                if (this.f55413n == null) {
                    this.f55413n = new ly0(str, 15.0f, g0.o());
                }
                ly0 ly0Var = this.f55413n;
                ly0Var.q(TextUtils.ellipsize(this.f55407e, ly0Var.f35916a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f55409f;
            if (str2 != null) {
                if (this.f55414r == null) {
                    this.f55414r = new ly0(str2, 14.0f, null);
                }
                ly0 ly0Var2 = this.f55414r;
                ly0Var2.q(TextUtils.ellipsize(this.f55409f, ly0Var2.f35916a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f55415s == null) {
                    this.f55415s = new ly0(str3, 12.0f, null);
                }
                ly0 ly0Var3 = this.f55415s;
                ly0Var3.q(TextUtils.ellipsize(this.h, ly0Var3.f35916a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.f55416w == null) {
                this.f55416w = new ly0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.Y;
        if (z10 && this.f55400a.f53841f) {
            return !MediaController.B().H();
        }
        if (!this.H && !z10) {
            if (this.X) {
                a aVar = this.R;
                if (aVar != null && aVar.f55385f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
    }

    @Override
    public final int getAlpha() {
        return this.f55406d0;
    }

    @Override
    public final int getObserverTag() {
        return this.f55408e0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i3) {
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
        int round = Math.round((i3 / i11) * this.W);
        if (this.E) {
            i10 = (i3 * 4) / 5;
        } else {
            i10 = (i3 * 5) / 4;
        }
        return Math.min(round, i10);
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f55418y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        int i3 = 3;
        if (this.Y) {
            if (min >= 1.0f) {
                i3 = 4;
            }
            m(i3, true);
        } else {
            if (min >= 1.0f) {
                i3 = g();
            }
            l(i3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        if (this.Y && MediaController.B().I(this.I) && MediaController.B().f21348v0 != null && MediaController.B().f21348v0.f26869k0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i3) {
        if (!this.Y || this.f55411g0 == 4) {
            return false;
        }
        if (i3 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f55403b0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f55405c0 + L2;
                if (f11 >= i11 && f11 <= i11 + L) {
                    this.S = true;
                    return true;
                }
            }
        }
        boolean z10 = this.S;
        if (z10) {
            if (i3 == 1) {
                a aVar = this.R;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f55382b;
                    int i12 = aVar.f55381a;
                    if (aVar.f55386g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f55385f) {
                        w7.G(i12).X(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.S = false;
                return true;
            } else if (i3 == 3) {
                this.S = false;
                return true;
            }
        }
        return z10;
    }

    public final void l(int i3) {
        if (this.f55410f0 != i3) {
            this.f55410f0 = i3;
            this.f55418y.setIcon(i3, true, true);
        }
    }

    public final void m(int i3, boolean z10) {
        if (this.f55411g0 != i3) {
            this.f55411g0 = i3;
            this.f55418y.k(i3, true, z10);
        }
    }

    public final void n(org.telegram.messenger.zi r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.zi r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: th.e.n(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.zi, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f55418y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        int i3 = 3;
        if (this.Y) {
            if (min >= 1.0f) {
                i3 = 4;
            }
            m(i3, true);
        } else {
            if (min >= 1.0f) {
                i3 = g();
            }
            l(i3);
        }
        this.d.invalidate();
    }

    public final void p(boolean z10) {
        int i3;
        if (this.Y && this.I != null) {
            zi ziVar = MediaController.B().f21348v0;
            boolean j10 = j();
            this.f55400a.a(j10, z10);
            if (ziVar != null && j10) {
                i3 = ziVar.f26851g0;
                mm0 mm0Var = this.L;
                if (!mm0Var.f36191e) {
                    mm0Var.h(ziVar.f26828b0);
                    mm0Var.f36202q = ziVar.f26841e0;
                }
                mm0Var.j(ziVar);
            } else {
                i3 = 0;
            }
            if (this.f55412h0 != i3) {
                this.f55412h0 = i3;
                this.h = g0.k0(i3, (int) this.J);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i3) {
        this.f55406d0 = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
