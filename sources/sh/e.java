package sh;

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
import org.telegram.messenger.gc;
import org.telegram.messenger.ij;
import org.telegram.messenger.rz;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xq;
public final class e extends Drawable implements x5, im0 {
    public final boolean D;
    public String E;
    public String F;
    public boolean G;
    public ij H;
    public double I;
    public int J;
    public final jm0 K;
    public float L;
    public float M;
    public rz N;
    public np O;
    public Drawable P;
    public a Q;
    public boolean R;
    public boolean S;
    public TLRPC.MessageMedia T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final te.a f55179a;
    public int f55180a0;
    public final ImageReceiver f55181b;
    public int f55182b0;
    public final int f55183c;
    public final ViewGroup d;
    public final int f55185d0;
    public String f55186e;
    public int f55187e0;
    public String f55188f;
    public int f55189f0;
    public int f55190g0;
    public String h;
    public ly0 f55191n;
    public ly0 f55192r;
    public ly0 f55193s;
    public ly0 f55194w;
    public final RadialProgress2 f55196y;
    public final Paint f55195x = new Paint(1);
    public int Z = 0;
    public int f55184c0 = 255;

    public e(int i7, ViewGroup viewGroup, f6 f6Var, boolean z9) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f55181b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f55183c = i7;
        this.D = z9;
        this.f55196y = new RadialProgress2(viewGroup, f6Var);
        this.d = viewGroup;
        jm0 jm0Var = new jm0(viewGroup);
        this.K = jm0Var;
        jm0Var.h = this;
        this.f55179a = new te.a(viewGroup, se.a.f54888a, 180L);
        this.f55185d0 = z5.q(i7).k();
    }

    @Override
    public final void C(boolean z9) {
        e();
    }

    @Override
    public final void M(String str) {
        e();
    }

    @Override
    public final void a(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().f21292u0, f10);
            p(true);
        }
    }

    public final void b() {
        this.f55181b.P();
        this.f55196y.e();
    }

    public final void c(boolean z9) {
        int i7;
        int i10;
        ly0 ly0Var = this.f55191n;
        if (ly0Var != null) {
            if (z9) {
                i10 = k6.f28150tc;
            } else {
                i10 = k6.f28115re;
            }
            ly0Var.n(k6.x0(null, i10, false));
        }
        this.f55195x.setColor(1711276032);
        ly0 ly0Var2 = this.f55194w;
        if (ly0Var2 != null) {
            ly0Var2.n(-1);
        }
        rz rzVar = this.N;
        if (rzVar != null) {
            if (z9) {
                i7 = k6.Dc;
            } else {
                i7 = k6.f27875ef;
            }
            rzVar.f25385m = i7;
        }
        boolean z10 = this.X;
        RadialProgress2 radialProgress2 = this.f55196y;
        if (!z10 && !this.W) {
            radialProgress2.g(k6.Ze, k6.f27800af, k6.f27819bf, k6.f27839cf);
            return;
        }
        jm0 jm0Var = this.K;
        if (z9) {
            int x02 = k6.x0(null, k6.f27982kc, false);
            int x03 = k6.x0(null, k6.f28001lc, false);
            int i11 = k6.f28036nc;
            jm0Var.g(x02, x03, k6.x0(null, i11, false), k6.x0(null, i11, false), k6.x0(null, k6.f28017mc, false));
            radialProgress2.g(k6.Bc, k6.Cc, k6.Db, k6.Eb);
            return;
        }
        radialProgress2.g(k6.We, k6.Xe, k6.f27946id, k6.f27964jd);
        int x04 = k6.x0(null, k6.f27947ie, false);
        int x05 = k6.x0(null, k6.f27965je, false);
        int i12 = k6.le;
        jm0Var.g(x04, x05, k6.x0(null, i12, false), k6.x0(null, i12, false), k6.x0(null, k6.f27984ke, false));
    }

    @Override
    public final void d(float f10) {
        if (j()) {
            ij ijVar = MediaController.B().f21292u0;
            ijVar.f23197b0 = f10;
            ijVar.f23220g0 = (int) (ijVar.L0() * f10);
            p(true);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int L2;
        int i7;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f55184c0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            f(false);
            boolean z9 = this.W;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f55196y;
            if (!z9 && !this.X) {
                ImageReceiver imageReceiver = this.f55181b;
                imageReceiver.setAlpha(this.f55184c0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                    int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - xq.f40314k.getInterpolation(imageReceiver.f21194h1)) * g0.L(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f21194h1 * 5.0f) * 255.0f));
                    this.P.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                    this.P.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.G && this.f55194w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f55194w.f35777c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f55195x);
                    this.f55194w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
                }
            } else {
                int i12 = bounds.left;
                boolean z10 = this.D;
                if (z10) {
                    L = 0;
                } else {
                    L = g0.L(8.0f);
                }
                int i13 = i12 + L;
                int i14 = bounds.top;
                if (z10) {
                    L2 = 0;
                } else {
                    L2 = g0.L(3.0f);
                }
                int i15 = i14 + L2;
                if (!this.X) {
                    i10 = g0.L(3.0f);
                }
                ly0 ly0Var = this.f55191n;
                if (ly0Var != null) {
                    ly0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.X) {
                    float f10 = this.f55179a.f55370e;
                    if (this.f55192r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f55192r.f35775a.setAlpha((int) (f11 * 255.0f));
                        this.f55192r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        jm0 jm0Var = this.K;
                        jm0Var.f35029t = f10;
                        jm0Var.i(q.w(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.L = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.M = L4;
                        canvas.translate(L3, L4);
                        jm0Var.b(canvas);
                        canvas.restore();
                    }
                }
                ly0 ly0Var2 = this.f55193s;
                if (ly0Var2 != null) {
                    float L5 = g0.L(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.X) {
                        i7 = 20;
                    } else {
                        i7 = 2;
                    }
                    ly0Var2.e(canvas, L5, g0.L(i7 + 34) + i17);
                }
                int L6 = g0.L(2.0f) + i13;
                this.f55180a0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f55182b0 = L7;
                radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + i13, g0.L(44.0f) + g0.L(5.0f) + i15);
            }
            if (!this.Y) {
                ij ijVar = this.H;
                if (ijVar != null && ijVar.p4()) {
                    if (gc.D().x(this.F) == null) {
                        radialProgress2.p(true, 1.0f);
                        if (this.X) {
                            m(6, true);
                        } else {
                            l(6);
                        }
                    }
                } else {
                    a aVar = this.Q;
                    if (aVar != null && aVar.f55165g) {
                        if (this.X) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f55164f) {
                            i11 = 4;
                        }
                        m(i11, true);
                    } else {
                        l(g());
                    }
                }
                if (this.X) {
                    l(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z9) {
        float f10;
        int width = getBounds().width();
        if (this.D) {
            f10 = 64.0f;
        } else {
            f10 = 72.0f;
        }
        int L = width - g0.L(f10);
        if (this.Z != L || z9) {
            this.Z = L;
            String str = this.f55186e;
            if (str != null) {
                if (this.f55191n == null) {
                    this.f55191n = new ly0(str, 15.0f, g0.o());
                }
                ly0 ly0Var = this.f55191n;
                ly0Var.q(TextUtils.ellipsize(this.f55186e, ly0Var.f35775a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f55188f;
            if (str2 != null) {
                if (this.f55192r == null) {
                    this.f55192r = new ly0(str2, 14.0f, null);
                }
                ly0 ly0Var2 = this.f55192r;
                ly0Var2.q(TextUtils.ellipsize(this.f55188f, ly0Var2.f35775a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f55193s == null) {
                    this.f55193s = new ly0(str3, 12.0f, null);
                }
                ly0 ly0Var3 = this.f55193s;
                ly0Var3.q(TextUtils.ellipsize(this.h, ly0Var3.f35775a, L, TextUtils.TruncateAt.END));
            }
            if (this.G && this.f55194w == null) {
                this.f55194w = new ly0(g0.g0(this.J, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z9 = this.X;
        if (z9 && this.f55179a.f55371f) {
            return !MediaController.B().H();
        }
        if (!this.G && !z9) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f55164f) {
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
        return this.f55184c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f55185d0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i7) {
        int i10;
        if (this.X) {
            return g0.L(63.0f);
        }
        if (this.W) {
            return g0.L(56.0f);
        }
        int i11 = this.U;
        if (i11 == 0) {
            return g0.L(100.0f);
        }
        int round = Math.round((i7 / i11) * this.V);
        if (this.D) {
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
        this.f55196y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        int i7 = 3;
        if (this.X) {
            if (min >= 1.0f) {
                i7 = 4;
            }
            m(i7, true);
        } else {
            if (min >= 1.0f) {
                i7 = g();
            }
            l(i7);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        if (this.X && MediaController.B().I(this.H) && MediaController.B().f21292u0 != null && MediaController.B().f21292u0.f23238k0 == this.D) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.X || this.f55189f0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f55180a0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f55182b0 + L2;
                if (f11 >= i11 && f11 <= i11 + L) {
                    this.R = true;
                    return true;
                }
            }
        }
        boolean z9 = this.R;
        if (z9) {
            if (i7 == 1) {
                a aVar = this.Q;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f55161b;
                    int i12 = aVar.f55160a;
                    if (aVar.f55165g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f55164f) {
                        w7.G(i12).X(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.R = false;
                return true;
            } else if (i7 == 3) {
                this.R = false;
                return true;
            }
        }
        return z9;
    }

    public final void l(int i7) {
        if (this.f55187e0 != i7) {
            this.f55187e0 = i7;
            this.f55196y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z9) {
        if (this.f55189f0 != i7) {
            this.f55189f0 = i7;
            this.f55196y.k(i7, true, z9);
        }
    }

    public final void n(org.telegram.messenger.ij r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.ij r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: sh.e.n(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.ij, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f55196y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        int i7 = 3;
        if (this.X) {
            if (min >= 1.0f) {
                i7 = 4;
            }
            m(i7, true);
        } else {
            if (min >= 1.0f) {
                i7 = g();
            }
            l(i7);
        }
        this.d.invalidate();
    }

    public final void p(boolean z9) {
        int i7;
        if (this.X && this.H != null) {
            ij ijVar = MediaController.B().f21292u0;
            boolean j3 = j();
            this.f55179a.a(j3, z9);
            if (ijVar != null && j3) {
                i7 = ijVar.f23220g0;
                jm0 jm0Var = this.K;
                if (!jm0Var.f35015e) {
                    jm0Var.h(ijVar.f23197b0);
                    jm0Var.f35026q = ijVar.f23210e0;
                }
                jm0Var.j(ijVar);
            } else {
                i7 = 0;
            }
            if (this.f55190g0 != i7) {
                this.f55190g0 = i7;
                this.h = g0.k0(i7, (int) this.I);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f55184c0 = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
