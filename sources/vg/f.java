package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import ei.r;
import ei.s;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ol;
import w7.k8;
import w7.o7;
public final class f extends ei.f implements k6 {
    public static Path f50855f0 = new Path();
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float J;
    public int K;
    public int L;
    public g O;
    public final e P;
    public ol Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public int W;
    public k8 X;
    public boolean Y;
    public hi.a Z;
    public boolean f50856a0;
    public final c f50857b0;
    public a f50858c0;
    public b f50859d0;
    public d f50860e0;
    public final hi.a f50861f;
    public final hi.a h;
    public final hi.a f50862n;
    public hi.a f50863r;
    public wg.a f50865w;
    public int f50866x;
    public int f50867y;
    public boolean f50864s = true;
    public float I = -1.0f;
    public int M = a7.f20159b;
    public final k N = new k();

    public f(hi.a aVar, hi.a aVar2, hi.a aVar3) {
        e eVar = new e();
        this.P = eVar;
        this.U = 1.0f;
        this.W = r.G;
        this.Y = true;
        this.f50857b0 = new c(this);
        this.f50861f = aVar;
        this.h = aVar2;
        this.f50862n = aVar3;
        s sVar = this.f6649b;
        if (!sVar.f6693a) {
            aVar = aVar3;
        } else if (!this.V || !sVar.f6694b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.f50863r = aVar;
        eVar.f50850i = i0.N(1.0f);
        eVar.f50851j = i0.N(0.6666667f);
        this.S = i0.N(1.0f);
        this.T = i0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (o7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f50855f0;
        if (path == null) {
            f50855f0 = new Path();
        } else {
            path.rewind();
        }
        f50855f0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f50855f0);
    }

    public static hi.a u(hi.a aVar) {
        while (aVar instanceof hi.g) {
            aVar = ((hi.g) aVar).f7725a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        k8 n10 = n();
        d dVar = this.f50860e0;
        if (n10 == dVar && dVar != null) {
            dVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.P.f50854m);
    }

    @Override
    public final int c() {
        return this.K;
    }

    @Override
    public final int d() {
        return this.L;
    }

    @Override
    public final void draw(Canvas canvas) {
        hi.a aVar;
        int i10 = a7.f20159b;
        if (this.M != i10) {
            this.M = i10;
            try {
                updateColors();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        int i11 = r.G;
        if (this.W != i11) {
            this.W = i11;
            s f7 = r.f();
            if (!Objects.equals(this.f6649b, f7)) {
                this.f6649b = f7;
                g(f7);
            }
        }
        e eVar = this.P;
        if (eVar.f50854m.isEmpty()) {
            return;
        }
        k8 n10 = n();
        hi.a aVar2 = this.f50863r;
        if (n10 == this.f50860e0 && !canvas.isHardwareAccelerated()) {
            hi.a u10 = u(u(this.f50863r));
            if (Build.VERSION.SDK_INT >= 29 && (u10 instanceof hi.f) && (aVar = ((hi.f) u10).f7717a) != null) {
                u10 = u(aVar);
            }
            aVar2 = u10;
            n10 = k(aVar2);
        }
        n10.b(canvas, aVar2);
        float f10 = this.f6650c / 255.0f;
        Rect rect = eVar.f50854m;
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = rect.bottom;
        float[] fArr = eVar.f50846b;
        if (this.O == null) {
            this.O = new g(this.D, eVar.f50850i, this.E, eVar.f50851j, this.G, this.H);
        }
        this.N.a(canvas, f11, f12, f13, f14, fArr, this.O, f10);
    }

    @Override
    public final boolean e() {
        k8 n10 = n();
        d dVar = this.f50860e0;
        if (n10 == dVar && dVar != null && !dVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i10) {
        d dVar = this.f50860e0;
        if (dVar != null) {
            dVar.f(i10 / 255.0f);
        }
    }

    @Override
    public final void g(s sVar) {
        this.Y = true;
        updateColors();
        invalidateSelf();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        e eVar = this.P;
        l(outline, eVar.f50854m, eVar.f50846b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        e eVar = this.P;
        int i10 = eVar.d;
        rect.set(i10, i10, i10, i10);
        return eVar.e;
    }

    @Override
    public final void h() {
        d dVar = this.f50860e0;
        if (dVar != null) {
            dVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        k8 n10 = n();
        d dVar = this.f50860e0;
        if (n10 == dVar && dVar != null) {
            return true;
        }
        return false;
    }

    public final k8 k(hi.a aVar) {
        hi.a u10 = u(aVar);
        if (Color.alpha(this.f50867y) != 255 && !(u10 instanceof hi.c)) {
            if (u10 instanceof hi.b) {
                if (this.f50858c0 == null) {
                    this.f50858c0 = new a(this);
                }
                return this.f50858c0;
            }
            if (this.f50859d0 == null) {
                this.f50859d0 = new b(this);
            }
            return this.f50859d0;
        }
        return this.f50857b0;
    }

    public final void m() {
        d dVar = this.f50860e0;
        if (dVar != null) {
            dVar.d();
        }
    }

    public final k8 n() {
        boolean z10;
        k8 k10;
        hi.a aVar;
        boolean z11 = true;
        if (this.Y) {
            s sVar = this.f6649b;
            if (!sVar.f6693a) {
                aVar = this.f50862n;
            } else if (this.V && sVar.f6694b && Build.VERSION.SDK_INT >= 33) {
                aVar = this.f50861f;
            } else {
                aVar = this.h;
            }
            if (this.f50863r != aVar) {
                this.f50863r = aVar;
                d dVar = this.f50860e0;
                if (dVar != null) {
                    dVar.h = true;
                }
            }
        }
        hi.a u10 = u(this.f50863r);
        if (Color.alpha(this.f50867y) == 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X == null || this.Y || this.Z != u10 || this.f50856a0 != z10) {
            this.Y = false;
            this.Z = u10;
            this.f50856a0 = z10;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && (this.f50863r instanceof tg.a) && !(u10 instanceof hi.c) && !(u10 instanceof hi.b)) {
                if (this.f50860e0 == null) {
                    d dVar2 = new d(this);
                    dVar2.g(this.f50864s);
                    dVar2.f(this.f6650c / 255.0f);
                    dVar2.d();
                    this.f50860e0 = dVar2;
                }
                k10 = this.f50860e0;
            } else {
                k10 = k(u10);
            }
            d dVar3 = this.f50860e0;
            if (dVar3 != null) {
                if (k10 != dVar3 || !this.V || !this.f6649b.f6694b || i10 < 33) {
                    z11 = false;
                }
                dVar3.h(z11);
            }
            k8 k8Var = this.X;
            if (k8Var != k10 && k8Var != null) {
                k8Var.a();
            }
            this.X = k10;
        }
        return this.X;
    }

    public final void o(wg.a aVar) {
        this.f50865w = aVar;
        if (this.I < 0.0f) {
            this.I = this.S;
            this.J = this.T;
        }
        updateColors();
        if (aVar instanceof wg.d) {
            wg.d dVar = (wg.d) aVar;
            float f7 = dVar.f52866f;
            float f10 = dVar.h;
            e eVar = this.P;
            eVar.f50850i = f7;
            eVar.f50851j = f10;
            this.O = null;
            float c10 = dVar.c();
            float b10 = dVar.b();
            this.S = c10;
            this.T = b10;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e eVar = this.P;
        eVar.f50845a.set(rect);
        eVar.a();
        m();
    }

    public final void p(int i10) {
        e eVar = this.P;
        if (eVar.d != i10) {
            eVar.d = i10;
            eVar.a();
            m();
        }
    }

    public final void q(float f7) {
        e eVar = this.P;
        Arrays.fill(eVar.f50846b, f7);
        Arrays.fill(eVar.f50847c, f7);
        eVar.a();
        m();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        e eVar = this.P;
        float[] fArr = eVar.f50846b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        eVar.a();
        m();
    }

    public final void s(float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        e eVar = this.P;
        float[] fArr = eVar.f50846b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        float f14 = 0.0f;
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = f11;
        }
        fArr[5] = f13;
        fArr[4] = f13;
        if (!z10) {
            f14 = f12;
        }
        fArr[7] = f14;
        fArr[6] = f14;
        float[] fArr2 = eVar.f50847c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        eVar.a();
        m();
    }

    public final void t(int i10) {
        this.P.f50848f = i10;
        m();
    }

    @Override
    public final void updateColors() {
        this.M = a7.f20159b;
        wg.a aVar = this.f50865w;
        if (aVar != null) {
            if (aVar instanceof wg.b) {
                ((wg.b) aVar).d();
            }
            this.f50867y = this.f50865w.n0();
            this.f50866x = this.f50865w.j0();
            this.D = this.f50865w.u();
            this.E = this.f50865w.E();
            this.F = this.f50865w.h0();
            this.G = this.f50865w.w();
            this.H = this.f50865w.b0();
            wg.a aVar2 = this.f50865w;
            if (aVar2 instanceof wg.d) {
                wg.d dVar = (wg.d) aVar2;
                float c10 = dVar.c();
                float b10 = dVar.b();
                this.S = c10;
                this.T = b10;
            } else if (aVar2.X() >= 0.0f) {
                float X = this.f50865w.X();
                float N = this.f50865w.N();
                this.S = X;
                this.T = N;
            } else {
                float f7 = this.I;
                if (f7 >= 0.0f) {
                    float f10 = this.J;
                    this.S = f7;
                    this.T = f10;
                }
            }
            this.O = null;
            d dVar2 = this.f50860e0;
            if (dVar2 != null) {
                dVar2.h = true;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
