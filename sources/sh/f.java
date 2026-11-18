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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.vy0;
public final class f extends Drawable implements y5, um0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public fj I;
    public double J;
    public int K;
    public final vm0 L;
    public float M;
    public float N;
    public lz O;
    public cq P;
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
    public final te.a f57435a;
    public final ImageReceiver f57437b;
    public int f57438b0;
    public final int f57439c;
    public int f57440c0;
    public final ViewGroup d;
    public String f57442e;
    public final int f57443e0;
    public String f57444f;
    public int f57445f0;
    public int f57446g0;
    public String h;
    public int f57447h0;
    public vy0 f57448n;
    public vy0 f57449r;
    public vy0 f57450s;
    public vy0 f57451w;
    public final RadialProgress2 f57453y;
    public final Paint f57452x = new Paint(1);
    public int f57436a0 = 0;
    public int f57441d0 = 255;

    public f(int i7, ViewGroup viewGroup, i6 i6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f57437b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.f57439c = i7;
        this.E = z10;
        this.f57453y = new RadialProgress2(viewGroup, i6Var);
        this.d = viewGroup;
        vm0 vm0Var = new vm0(viewGroup);
        this.L = vm0Var;
        vm0Var.h = this;
        this.f57435a = new te.a(viewGroup, se.a.f57146a, 180L);
        this.f57443e0 = a6.q(i7).k();
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
            MediaController.B().i0(MediaController.B().f22743v0, f10);
            p(true);
        }
    }

    public final void b() {
        this.f57437b.P();
        this.f57453y.e();
    }

    public final void c(boolean z10) {
        int i7;
        int i10;
        vy0 vy0Var = this.f57448n;
        if (vy0Var != null) {
            if (z10) {
                i10 = n6.wc;
            } else {
                i10 = n6.f29720ue;
            }
            vy0Var.n(n6.x0(null, i10, false));
        }
        this.f57452x.setColor(1711276032);
        vy0 vy0Var2 = this.f57451w;
        if (vy0Var2 != null) {
            vy0Var2.n(-1);
        }
        lz lzVar = this.O;
        if (lzVar != null) {
            if (z10) {
                i7 = n6.Gc;
            } else {
                i7 = n6.f29478hf;
            }
            lzVar.f25495m = i7;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.f57453y;
        if (!z11 && !this.X) {
            radialProgress2.g(n6.f29387cf, n6.f29404df, n6.f29423ef, n6.f29440ff);
            return;
        }
        vm0 vm0Var = this.L;
        if (z10) {
            int x02 = n6.x0(null, n6.f29584nc, false);
            int x03 = n6.x0(null, n6.f29602oc, false);
            int i11 = n6.f29642qc;
            vm0Var.g(x02, x03, n6.x0(null, i11, false), n6.x0(null, i11, false), n6.x0(null, n6.f29622pc, false));
            radialProgress2.g(n6.Ec, n6.Fc, n6.Gb, n6.Hb);
            return;
        }
        radialProgress2.g(n6.Ze, n6.f29347af, n6.f29550ld, n6.f29566md);
        int x04 = n6.x0(null, n6.le, false);
        int x05 = n6.x0(null, n6.f29567me, false);
        int i12 = n6.f29604oe;
        vm0Var.g(x04, x05, n6.x0(null, i12, false), n6.x0(null, i12, false), n6.x0(null, n6.ne, false));
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
        if (this.f57441d0 != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            e(false);
            boolean z10 = this.X;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f57453y;
            if (!z10 && !this.Y) {
                ImageReceiver imageReceiver = this.f57437b;
                imageReceiver.setAlpha(this.f57441d0 / 255.0f);
                imageReceiver.z0(bounds);
                imageReceiver.h(canvas, null);
                if (this.Z && (drawable = this.Q) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                    int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - lr.f37212k.getInterpolation(imageReceiver.f22644i1)) * g0.L(16.0f)));
                    this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f22644i1 * 5.0f) * 255.0f));
                    this.Q.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                    this.Q.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
                if (this.H && this.f57451w != null) {
                    canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.f57451w.f41482c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.f57452x);
                    this.f57451w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
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
                vy0 vy0Var = this.f57448n;
                if (vy0Var != null) {
                    vy0Var.e(canvas, g0.L(56.0f) + i13, g0.L(15.0f) + i15 + i10);
                }
                if (this.Y) {
                    float f10 = this.f57435a.f57657e;
                    if (this.f57449r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        this.f57449r.f41480a.setAlpha((int) (f11 * 255.0f));
                        this.f57449r.e(canvas, g0.L(56.0f) + i13, g0.L(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        vm0 vm0Var = this.L;
                        vm0Var.f40724t = f10;
                        vm0Var.i(n10.x(56.0f, i13, bounds.right), g0.L(30.0f));
                        canvas.save();
                        float L3 = g0.L(45.0f) + i13;
                        this.M = L3;
                        float L4 = g0.L(21.0f) + i15 + i10;
                        this.N = L4;
                        canvas.translate(L3, L4);
                        vm0Var.b(canvas);
                        canvas.restore();
                    }
                }
                vy0 vy0Var2 = this.f57450s;
                if (vy0Var2 != null) {
                    float L5 = g0.L(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.Y) {
                        i7 = 20;
                    } else {
                        i7 = 2;
                    }
                    vy0Var2.e(canvas, L5, g0.L(i7 + 34) + i17);
                }
                int L6 = g0.L(2.0f) + i13;
                this.f57438b0 = L6;
                int L7 = g0.L(5.0f) + i15;
                this.f57440c0 = L7;
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
                    if (aVar != null && aVar.f57419g) {
                        if (this.Y) {
                            m(3, true);
                        } else {
                            l(3);
                        }
                    } else if (this.Y) {
                        if (aVar != null && aVar.f57418f) {
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
        if (this.f57436a0 != L || z10) {
            this.f57436a0 = L;
            String str = this.f57442e;
            if (str != null) {
                if (this.f57448n == null) {
                    this.f57448n = new vy0(str, 15.0f, g0.o());
                }
                vy0 vy0Var = this.f57448n;
                vy0Var.q(TextUtils.ellipsize(this.f57442e, vy0Var.f41480a, L, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f57444f;
            if (str2 != null) {
                if (this.f57449r == null) {
                    this.f57449r = new vy0(str2, 14.0f, null);
                }
                vy0 vy0Var2 = this.f57449r;
                vy0Var2.q(TextUtils.ellipsize(this.f57444f, vy0Var2.f41480a, L, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f57450s == null) {
                    this.f57450s = new vy0(str3, 12.0f, null);
                }
                vy0 vy0Var3 = this.f57450s;
                vy0Var3.q(TextUtils.ellipsize(this.h, vy0Var3.f41480a, L, TextUtils.TruncateAt.END));
            }
            if (this.H && this.f57451w == null) {
                this.f57451w = new vy0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    public final int f() {
        boolean z10 = this.Y;
        if (z10 && this.f57435a.f57658f) {
            return !MediaController.B().H();
        }
        if (!this.H && !z10) {
            if (this.X) {
                a aVar = this.R;
                if (aVar != null && aVar.f57418f) {
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
            fj fjVar = MediaController.B().f22743v0;
            fjVar.f23928b0 = f10;
            fjVar.f23960i0 = (int) (fjVar.L0() * f10);
            p(true);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f57441d0;
    }

    @Override
    public final int getObserverTag() {
        return this.f57443e0;
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
        this.f57453y.p(true, min);
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
        if (this.Y && MediaController.B().I(this.I) && MediaController.B().f22743v0 != null && MediaController.B().f22743v0.m0 == this.E) {
            return true;
        }
        return false;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.Y || this.f57446g0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            int i10 = this.f57438b0 + L2;
            if (f10 >= i10 && f10 <= i10 + L) {
                int i11 = this.f57440c0 + L2;
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
                    TLRPC.Document document = aVar.f57415b;
                    int i12 = aVar.f57414a;
                    if (aVar.f57419g) {
                        w7.G(i12).f(document);
                        aVar.a();
                    } else if (!aVar.f57418f) {
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
        if (this.f57445f0 != i7) {
            this.f57445f0 = i7;
            this.f57453y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z10) {
        if (this.f57446g0 != i7) {
            this.f57446g0 = i7;
            this.f57453y.k(i7, true, z10);
        }
    }

    public final void n(org.telegram.messenger.fj r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.fj r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: sh.f.n(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.fj, int, java.lang.String, boolean):void");
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f57453y.p(true, min);
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
            fj fjVar = MediaController.B().f22743v0;
            boolean j3 = j();
            this.f57435a.a(j3, z10);
            if (fjVar != null && j3) {
                i7 = fjVar.f23960i0;
                vm0 vm0Var = this.L;
                if (!vm0Var.f40710e) {
                    vm0Var.h(fjVar.f23928b0);
                    vm0Var.f40721q = fjVar.f23951g0;
                }
                vm0Var.j(fjVar);
            } else {
                i7 = 0;
            }
            if (this.f57447h0 != i7) {
                this.f57447h0 = i7;
                this.h = g0.k0(i7, (int) this.J);
                e(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f57441d0 = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
