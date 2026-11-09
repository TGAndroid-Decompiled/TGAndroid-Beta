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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.xq;
public final class f extends Drawable implements x5, jm0 {
    public final boolean D;
    public String E;
    public String F;
    public boolean G;
    public ij H;
    public double I;
    public int J;
    public final km0 K;
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
    public final te.a f55308a;
    public int f55309a0;
    public final ImageReceiver f55310b;
    public int f55311b0;
    public final int f55312c;
    public final ViewGroup d;
    public final int f55314d0;
    public String f55315e;
    public int f55316e0;
    public String f55317f;
    public int f55318f0;
    public int f55319g0;
    public String h;
    public ny0 f55320n;
    public ny0 f55321r;
    public ny0 f55322s;
    public ny0 f55323w;
    public final RadialProgress2 f55325y;
    public final Paint f55324x = new Paint(1);
    public int Z = 0;
    public int f55313c0 = 255;

    public f(int i7, ViewGroup viewGroup, g6 g6Var, boolean z9) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f55310b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f55312c = i7;
        this.D = z9;
        this.f55325y = new RadialProgress2(viewGroup, g6Var);
        this.d = viewGroup;
        km0 km0Var = new km0(viewGroup);
        this.K = km0Var;
        km0Var.h = this;
        this.f55308a = new te.a(viewGroup, se.a.f55017a, 180L);
        this.f55314d0 = z5.q(i7).k();
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
            MediaController.B().i0(MediaController.B().f21295u0, f10);
            p(true);
        }
    }

    public final void b() {
        this.f55310b.P();
        this.f55325y.e();
    }

    public final void c(boolean z9) {
        int i7;
        int i10;
        ny0 ny0Var = this.f55320n;
        if (ny0Var != null) {
            if (z9) {
                i10 = l6.f28167tc;
            } else {
                i10 = l6.f28132re;
            }
            ny0Var.n(l6.x0(null, i10, false));
        }
        this.f55324x.setColor(1711276032);
        ny0 ny0Var2 = this.f55323w;
        if (ny0Var2 != null) {
            ny0Var2.n(-1);
        }
        rz rzVar = this.N;
        if (rzVar != null) {
            if (z9) {
                i7 = l6.Dc;
            } else {
                i7 = l6.f27892ef;
            }
            rzVar.f25389m = i7;
        }
        boolean z10 = this.X;
        RadialProgress2 radialProgress2 = this.f55325y;
        if (!z10 && !this.W) {
            radialProgress2.g(l6.Ze, l6.f27817af, l6.f27836bf, l6.f27856cf);
            return;
        }
        km0 km0Var = this.K;
        if (z9) {
            int x02 = l6.x0(null, l6.f27999kc, false);
            int x03 = l6.x0(null, l6.f28018lc, false);
            int i11 = l6.f28053nc;
            km0Var.g(x02, x03, l6.x0(null, i11, false), l6.x0(null, i11, false), l6.x0(null, l6.f28034mc, false));
            radialProgress2.g(l6.Bc, l6.Cc, l6.Db, l6.Eb);
            return;
        }
        radialProgress2.g(l6.We, l6.Xe, l6.f27963id, l6.f27981jd);
        int x04 = l6.x0(null, l6.f27964ie, false);
        int x05 = l6.x0(null, l6.f27982je, false);
        int i12 = l6.le;
        km0Var.g(x04, x05, l6.x0(null, i12, false), l6.x0(null, i12, false), l6.x0(null, l6.f28001ke, false));
    }

    @Override
    public final void d(float f10) {
        if (j()) {
            ij ijVar = MediaController.B().f21295u0;
            ijVar.f23222b0 = f10;
            ijVar.f23245g0 = (int) (ijVar.L0() * f10);
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
        if (this.f55313c0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            f(false);
            boolean z9 = this.W;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f55325y;
            if (!z9 && !this.X) {
                ImageReceiver imageReceiver = this.f55310b;
                imageReceiver.setAlpha(this.f55313c0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                    int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - xq.f40462k.getInterpolation(imageReceiver.f21197h1)) * g0.L(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f21197h1 * 5.0f) * 255.0f));
                    this.P.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                    this.P.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.G && this.f55323w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f55323w.f36541c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f55324x);
                    this.f55323w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
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
                ny0 ny0Var = this.f55320n;
                if (ny0Var != null) {
                    ny0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.X) {
                    float f10 = this.f55308a.f55499e;
                    if (this.f55321r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f55321r.f36539a.setAlpha((int) (f11 * 255.0f));
                        this.f55321r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        km0 km0Var = this.K;
                        km0Var.f35393t = f10;
                        km0Var.i(q.w(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.L = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.M = L4;
                        canvas.translate(L3, L4);
                        km0Var.b(canvas);
                        canvas.restore();
                    }
                }
                ny0 ny0Var2 = this.f55322s;
                if (ny0Var2 != null) {
                    float L5 = g0.L(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.X) {
                        i7 = 20;
                    } else {
                        i7 = 2;
                    }
                    ny0Var2.e(canvas, L5, g0.L(i7 + 34) + i17);
                }
                int L6 = g0.L(2.0f) + i13;
                this.f55309a0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f55311b0 = L7;
                radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + i13, g0.L(44.0f) + g0.L(5.0f) + i15);
            }
            if (!this.Y) {
                ij ijVar = this.H;
                if (ijVar != null && ijVar.o4()) {
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
                    if (aVar != null && aVar.f55292g) {
                        if (this.X) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f55291f) {
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
            String str = this.f55315e;
            if (str != null) {
                if (this.f55320n == null) {
                    this.f55320n = new ny0(str, 15.0f, g0.o());
                }
                ny0 ny0Var = this.f55320n;
                ny0Var.q(TextUtils.ellipsize(this.f55315e, ny0Var.f36539a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f55317f;
            if (str2 != null) {
                if (this.f55321r == null) {
                    this.f55321r = new ny0(str2, 14.0f, null);
                }
                ny0 ny0Var2 = this.f55321r;
                ny0Var2.q(TextUtils.ellipsize(this.f55317f, ny0Var2.f36539a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f55322s == null) {
                    this.f55322s = new ny0(str3, 12.0f, null);
                }
                ny0 ny0Var3 = this.f55322s;
                ny0Var3.q(TextUtils.ellipsize(this.h, ny0Var3.f36539a, L, TextUtils.TruncateAt.END));
            }
            if (this.G && this.f55323w == null) {
                this.f55323w = new ny0(g0.g0(this.J, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z9 = this.X;
        if (z9 && this.f55308a.f55500f) {
            return !MediaController.B().H();
        }
        if (!this.G && !z9) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f55291f) {
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
        return this.f55313c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f55314d0;
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
        this.f55325y.p(true, min);
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
        if (this.X && MediaController.B().I(this.H) && MediaController.B().f21295u0 != null && MediaController.B().f21295u0.f23263k0 == this.D) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.X || this.f55318f0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f55309a0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f55311b0 + L2;
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
                    TLRPC.Document document = aVar.f55288b;
                    int i12 = aVar.f55287a;
                    if (aVar.f55292g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f55291f) {
                        w7.G(i12).W(document, aVar.d, 2, 0);
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
        if (this.f55316e0 != i7) {
            this.f55316e0 = i7;
            this.f55325y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z9) {
        if (this.f55318f0 != i7) {
            this.f55318f0 = i7;
            this.f55325y.k(i7, true, z9);
        }
    }

    public final void n(org.telegram.messenger.ij r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.ij r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: sh.f.n(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.ij, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f55325y.p(true, min);
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
            ij ijVar = MediaController.B().f21295u0;
            boolean j3 = j();
            this.f55308a.a(j3, z9);
            if (ijVar != null && j3) {
                i7 = ijVar.f23245g0;
                km0 km0Var = this.K;
                if (!km0Var.f35379e) {
                    km0Var.h(ijVar.f23222b0);
                    km0Var.f35390q = ijVar.f23235e0;
                }
                km0Var.j(ijVar);
            } else {
                i7 = 0;
            }
            if (this.f55319g0 != i7) {
                this.f55319g0 = i7;
                this.h = g0.k0(i7, (int) this.I);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f55313c0 = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
