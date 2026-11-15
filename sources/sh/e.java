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
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.i20;
import org.telegram.messenger.pz;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.vp;
public final class e extends Drawable implements x5, mm0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public gj I;
    public double J;
    public int K;
    public final nm0 L;
    public float M;
    public float N;
    public pz O;
    public vp P;
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
    public final te.a f56859a;
    public final ImageReceiver f56861b;
    public int f56862b0;
    public final int f56863c;
    public int f56864c0;
    public final ViewGroup d;
    public String f56866e;
    public final int f56867e0;
    public String f56868f;
    public int f56869f0;
    public int f56870g0;
    public String h;
    public int f56871h0;
    public oy0 f56872n;
    public oy0 f56873r;
    public oy0 f56874s;
    public oy0 f56875w;
    public final RadialProgress2 f56877y;
    public final Paint f56876x = new Paint(1);
    public int f56860a0 = 0;
    public int f56865d0 = 255;

    public e(int i7, ViewGroup viewGroup, e6 e6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f56861b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f56863c = i7;
        this.E = z10;
        this.f56877y = new RadialProgress2(viewGroup, e6Var);
        this.d = viewGroup;
        nm0 nm0Var = new nm0(viewGroup);
        this.L = nm0Var;
        nm0Var.h = this;
        this.f56859a = new te.a(viewGroup, se.a.f56572a, 180L);
        this.f56867e0 = z5.q(i7).k();
    }

    @Override
    public final void C(boolean z10) {
        c();
    }

    @Override
    public final void N(String str) {
        c();
    }

    public final void a() {
        this.f56861b.P();
        this.f56877y.e();
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        oy0 oy0Var = this.f56872n;
        if (oy0Var != null) {
            if (z10) {
                i10 = j6.wc;
            } else {
                i10 = j6.f29173ue;
            }
            oy0Var.n(j6.x0(null, i10, false));
        }
        this.f56876x.setColor(1711276032);
        oy0 oy0Var2 = this.f56875w;
        if (oy0Var2 != null) {
            oy0Var2.n(-1);
        }
        pz pzVar = this.O;
        if (pzVar != null) {
            if (z10) {
                i7 = j6.Gc;
            } else {
                i7 = j6.f28931hf;
            }
            pzVar.f26036m = i7;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.f56877y;
        if (!z11 && !this.X) {
            radialProgress2.g(j6.f28840cf, j6.f28857df, j6.f28876ef, j6.f28893ff);
            return;
        }
        nm0 nm0Var = this.L;
        if (z10) {
            int x02 = j6.x0(null, j6.f29037nc, false);
            int x03 = j6.x0(null, j6.f29055oc, false);
            int i11 = j6.f29095qc;
            nm0Var.g(x02, x03, j6.x0(null, i11, false), j6.x0(null, i11, false), j6.x0(null, j6.f29075pc, false));
            radialProgress2.g(j6.Ec, j6.Fc, j6.Gb, j6.Hb);
            return;
        }
        radialProgress2.g(j6.Ze, j6.f28800af, j6.f29003ld, j6.f29019md);
        int x04 = j6.x0(null, j6.le, false);
        int x05 = j6.x0(null, j6.f29020me, false);
        int i12 = j6.f29057oe;
        nm0Var.g(x04, x05, j6.x0(null, i12, false), j6.x0(null, i12, false), j6.x0(null, j6.ne, false));
    }

    public final void c() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void d(boolean z10) {
        float f10;
        int width = getBounds().width();
        if (this.E) {
            f10 = 64.0f;
        } else {
            f10 = 72.0f;
        }
        int L = width - g0.L(f10);
        if (this.f56860a0 != L || z10) {
            this.f56860a0 = L;
            String str = this.f56866e;
            if (str != null) {
                if (this.f56872n == null) {
                    this.f56872n = new oy0(str, 15.0f, g0.o());
                }
                oy0 oy0Var = this.f56872n;
                oy0Var.q(TextUtils.ellipsize(this.f56866e, oy0Var.f38101a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f56868f;
            if (str2 != null) {
                if (this.f56873r == null) {
                    this.f56873r = new oy0(str2, 14.0f, null);
                }
                oy0 oy0Var2 = this.f56873r;
                oy0Var2.q(TextUtils.ellipsize(this.f56868f, oy0Var2.f38101a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f56874s == null) {
                    this.f56874s = new oy0(str3, 12.0f, null);
                }
                oy0 oy0Var3 = this.f56874s;
                oy0Var3.q(TextUtils.ellipsize(this.h, oy0Var3.f38101a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.f56875w == null) {
                this.f56875w = new oy0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int L2;
        int i7;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f56865d0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            d(false);
            boolean z10 = this.X;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f56877y;
            if (!z10 && !this.Y) {
                ImageReceiver imageReceiver = this.f56861b;
                imageReceiver.setAlpha(this.f56865d0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Z && (drawable = this.Q) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - er.f34423k.getInterpolation(imageReceiver.f22278i1)) * g0.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f22278i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.H && this.f56875w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f56875w.f38103c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f56876x);
                    this.f56875w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
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
                oy0 oy0Var = this.f56872n;
                if (oy0Var != null) {
                    oy0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.Y) {
                    float f10 = this.f56859a.f57085e;
                    if (this.f56873r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f56873r.f38101a.setAlpha((int) (f11 * 255.0f));
                        this.f56873r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        nm0 nm0Var = this.L;
                        nm0Var.f37643t = f10;
                        nm0Var.i(i20.w(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.M = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        nm0Var.b(canvas);
                        canvas.restore();
                    }
                }
                oy0 oy0Var2 = this.f56874s;
                if (oy0Var2 != null) {
                    float L5 = g0.L(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.Y) {
                        i7 = 20;
                    } else {
                        i7 = 2;
                    }
                    oy0Var2.e(canvas, L5, g0.L(i7 + 34) + i17);
                }
                int L6 = g0.L(2.0f) + i13;
                this.f56862b0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f56864c0 = L7;
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
                    if (aVar != null && aVar.f56845g) {
                        if (this.Y) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.Y) {
                        if (aVar != null && aVar.f56844f) {
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

    @Override
    public final void e(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().f22377v0, f10);
            p(true);
        }
    }

    public final int f() {
        boolean z10 = this.Y;
        if (z10 && this.f56859a.f57086f) {
            return !MediaController.B().H();
        }
        if (!this.H && !z10) {
            if (this.X) {
                a aVar = this.R;
                if (aVar != null && aVar.f56844f) {
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
            gj gjVar = MediaController.B().f22377v0;
            gjVar.f23779b0 = f10;
            gjVar.f23811i0 = (int) (gjVar.L0() * f10);
            p(true);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f56865d0;
    }

    @Override
    public final int getObserverTag() {
        return this.f56867e0;
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
        this.f56877y.p(true, min);
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
        if (this.Y && MediaController.B().I(this.I) && MediaController.B().f22377v0 != null && MediaController.B().f22377v0.m0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.Y || this.f56870g0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f56862b0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f56864c0 + L2;
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
                    TLRPC.Document document = aVar.f56841b;
                    int i12 = aVar.f56840a;
                    if (aVar.f56845g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f56844f) {
                        w7.G(i12).W(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    c();
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
        if (this.f56869f0 != i7) {
            this.f56869f0 = i7;
            this.f56877y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z10) {
        if (this.f56870g0 != i7) {
            this.f56870g0 = i7;
            this.f56877y.k(i7, true, z10);
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
        this.f56877y.p(true, min);
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
            gj gjVar = MediaController.B().f22377v0;
            boolean j3 = j();
            this.f56859a.a(j3, z10);
            if (gjVar != null && j3) {
                i7 = gjVar.f23811i0;
                nm0 nm0Var = this.L;
                if (!nm0Var.f37629e) {
                    nm0Var.h(gjVar.f23779b0);
                    nm0Var.f37640q = gjVar.f23802g0;
                }
                nm0Var.j(gjVar);
            } else {
                i7 = 0;
            }
            if (this.f56871h0 != i7) {
                this.f56871h0 = i7;
                this.h = g0.k0(i7, (int) this.J);
                d(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f56865d0 = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
