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
    public static Path f50840c0 = new Path();
    public int D;
    public float E;
    public float G;
    public int H;
    public int I;
    public g L;
    public final e M;
    public ol N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public int T;
    public k8 U;
    public boolean V;
    public hi.a W;
    public boolean X;
    public final c Y;
    public a Z;
    public b f50841a0;
    public d f50842b0;
    public final hi.a f50843f;
    public wg.a f50844n;
    public int f50845r;
    public int f50846s;
    public int f50847w;
    public int f50848x;
    public int f50849y;
    public boolean h = true;
    public float F = -1.0f;
    public int J = a7.f20158b;
    public final k K = new k();

    public f(hi.a aVar) {
        e eVar = new e();
        this.M = eVar;
        this.R = 1.0f;
        this.T = r.G;
        this.V = true;
        this.Y = new c(this);
        this.f50843f = aVar;
        eVar.f50835i = i0.N(1.0f);
        eVar.f50836j = i0.N(0.6666667f);
        this.P = i0.N(1.0f);
        this.Q = i0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (o7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f50840c0;
        if (path == null) {
            f50840c0 = new Path();
        } else {
            path.rewind();
        }
        f50840c0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f50840c0);
    }

    public static hi.a u(hi.a aVar) {
        while (aVar instanceof hi.g) {
            aVar = ((hi.g) aVar).f7724a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        k8 n10 = n();
        d dVar = this.f50842b0;
        if (n10 == dVar && dVar != null) {
            dVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.M.f50839m);
    }

    @Override
    public final int c() {
        return this.H;
    }

    @Override
    public final int d() {
        return this.I;
    }

    @Override
    public final void draw(Canvas canvas) {
        hi.a aVar;
        int i10 = a7.f20158b;
        if (this.J != i10) {
            this.J = i10;
            try {
                updateColors();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        int i11 = r.G;
        if (this.T != i11) {
            this.T = i11;
            s f7 = r.f();
            if (!Objects.equals(this.f6648b, f7)) {
                this.f6648b = f7;
                g(f7);
            }
        }
        e eVar = this.M;
        if (eVar.f50839m.isEmpty()) {
            return;
        }
        k8 n10 = n();
        d dVar = this.f50842b0;
        hi.a aVar2 = this.f50843f;
        if (n10 == dVar && !canvas.isHardwareAccelerated()) {
            hi.a u10 = u(u(aVar2));
            if (Build.VERSION.SDK_INT >= 29 && (u10 instanceof hi.f) && (aVar = ((hi.f) u10).f7716a) != null) {
                u10 = u(aVar);
            }
            aVar2 = u10;
            n10 = k(aVar2);
        }
        n10.b(canvas, aVar2);
        float f10 = this.f6649c / 255.0f;
        Rect rect = eVar.f50839m;
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = rect.bottom;
        float[] fArr = eVar.f50831b;
        if (this.L == null) {
            this.L = new g(this.f50847w, eVar.f50835i, this.f50848x, eVar.f50836j, this.D, this.E);
        }
        this.K.a(canvas, f11, f12, f13, f14, fArr, this.L, f10);
    }

    @Override
    public final boolean e() {
        d dVar = this.f50842b0;
        if (dVar != null && !dVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i10) {
        d dVar = this.f50842b0;
        if (dVar != null) {
            dVar.f(i10 / 255.0f);
        }
    }

    @Override
    public final void g(s sVar) {
        this.V = true;
        invalidateSelf();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        e eVar = this.M;
        l(outline, eVar.f50839m, eVar.f50831b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        e eVar = this.M;
        int i10 = eVar.d;
        rect.set(i10, i10, i10, i10);
        return eVar.e;
    }

    @Override
    public final void h() {
        d dVar = this.f50842b0;
        if (dVar != null) {
            dVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        k8 n10 = n();
        d dVar = this.f50842b0;
        if (n10 == dVar && dVar != null) {
            return true;
        }
        return false;
    }

    public final k8 k(hi.a aVar) {
        hi.a u10 = u(aVar);
        if (Color.alpha(this.f50846s) != 255 && !(u10 instanceof hi.c)) {
            if (u10 instanceof hi.b) {
                if (this.Z == null) {
                    this.Z = new a(this);
                }
                return this.Z;
            }
            if (this.f50841a0 == null) {
                this.f50841a0 = new b(this);
            }
            return this.f50841a0;
        }
        return this.Y;
    }

    public final void m() {
        d dVar = this.f50842b0;
        if (dVar != null) {
            dVar.d();
        }
    }

    public final k8 n() {
        boolean z10;
        k8 k10;
        hi.a aVar = this.f50843f;
        hi.a u10 = u(aVar);
        boolean z11 = true;
        if (Color.alpha(this.f50846s) == 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.U == null || this.V || this.W != u10 || this.X != z10) {
            this.V = false;
            this.W = u10;
            this.X = z10;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && (aVar instanceof tg.a) && !(u10 instanceof hi.c) && !(u10 instanceof hi.b)) {
                if (this.f50842b0 == null) {
                    d dVar = new d(this);
                    dVar.g(this.h);
                    dVar.f(this.f6649c / 255.0f);
                    dVar.d();
                    this.f50842b0 = dVar;
                }
                k10 = this.f50842b0;
            } else {
                k10 = k(u10);
            }
            d dVar2 = this.f50842b0;
            if (dVar2 != null) {
                if (k10 != dVar2 || !this.S || !this.f6648b.f6693b || i10 < 33) {
                    z11 = false;
                }
                dVar2.h(z11);
            }
            k8 k8Var = this.U;
            if (k8Var != k10 && k8Var != null) {
                k8Var.a();
            }
            this.U = k10;
        }
        return this.U;
    }

    public final void o(wg.a aVar) {
        this.f50844n = aVar;
        if (this.F < 0.0f) {
            this.F = this.P;
            this.G = this.Q;
        }
        updateColors();
        if (aVar instanceof wg.d) {
            wg.d dVar = (wg.d) aVar;
            float f7 = dVar.f52848f;
            float f10 = dVar.h;
            e eVar = this.M;
            eVar.f50835i = f7;
            eVar.f50836j = f10;
            this.L = null;
            float c10 = dVar.c();
            float b10 = dVar.b();
            this.P = c10;
            this.Q = b10;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e eVar = this.M;
        eVar.f50830a.set(rect);
        eVar.a();
        m();
    }

    public final void p(int i10) {
        e eVar = this.M;
        if (eVar.d != i10) {
            eVar.d = i10;
            eVar.a();
            m();
        }
    }

    public final void q(float f7) {
        e eVar = this.M;
        Arrays.fill(eVar.f50831b, f7);
        Arrays.fill(eVar.f50832c, f7);
        eVar.a();
        m();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        e eVar = this.M;
        float[] fArr = eVar.f50831b;
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
        e eVar = this.M;
        float[] fArr = eVar.f50831b;
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
        float[] fArr2 = eVar.f50832c;
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
        this.M.f50833f = i10;
        m();
    }

    @Override
    public final void updateColors() {
        this.J = a7.f20158b;
        wg.a aVar = this.f50844n;
        if (aVar != null) {
            if (aVar instanceof wg.b) {
                ((wg.b) aVar).d();
            }
            this.f50846s = this.f50844n.n0();
            this.f50845r = this.f50844n.j0();
            this.f50847w = this.f50844n.u();
            this.f50848x = this.f50844n.E();
            this.f50849y = this.f50844n.h0();
            this.D = this.f50844n.w();
            this.E = this.f50844n.b0();
            wg.a aVar2 = this.f50844n;
            if (aVar2 instanceof wg.d) {
                wg.d dVar = (wg.d) aVar2;
                float c10 = dVar.c();
                float b10 = dVar.b();
                this.P = c10;
                this.Q = b10;
            } else if (aVar2.X() >= 0.0f) {
                float X = this.f50844n.X();
                float N = this.f50844n.N();
                this.P = X;
                this.Q = N;
            } else {
                float f7 = this.F;
                if (f7 >= 0.0f) {
                    float f10 = this.G;
                    this.P = f7;
                    this.Q = f10;
                }
            }
            this.L = null;
            d dVar2 = this.f50842b0;
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
