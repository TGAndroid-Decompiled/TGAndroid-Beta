package si;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import bg.d0;
import c8.kc;
import org.telegram.ui.ActionBar.n6;
import ri.r;
public final class f extends ri.e {
    public g E;
    public g F;
    public g G;
    public ui.c H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final RectF M;
    public final ui.a f57502f;
    public final a h;
    public final kc f57503n;
    public final kc f57504r;
    public kc f57505s;
    public boolean f57506w = true;
    public boolean f57507x = true;
    public int f57508y = 1;

    public f(ui.a aVar) {
        a aVar2;
        kc bVar;
        g gVar = g.f57509b;
        this.E = gVar;
        this.F = gVar;
        this.G = gVar;
        this.J = 255;
        this.L = 255;
        this.M = new RectF();
        this.f57502f = aVar;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
        } else {
            aVar2 = null;
        }
        this.h = aVar2;
        if (aVar instanceof ui.e) {
            if (Build.VERSION.SDK_INT >= 29) {
                bVar = new c(this);
            } else {
                bVar = new b(this, false);
            }
            this.f57503n = bVar;
            this.f57504r = bVar;
        } else {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                this.f57503n = new e(this);
                this.f57504r = new c(this);
            } else if (i7 >= 31) {
                this.f57503n = new d(this);
                this.f57504r = new c(this);
            } else {
                this.f57503n = new b(this, true);
                this.f57504r = new b(this, false);
            }
        }
        g(this.f56670b);
    }

    public static LinearGradient k(f fVar, g gVar, float f10, float f11, int i7, int i10) {
        int i11;
        if (gVar == null) {
            i11 = -1;
        } else {
            i11 = gVar.f57510a;
        }
        boolean z10 = false;
        float f12 = 0;
        float f13 = f10 - f12;
        float f14 = 0.0f;
        float max = Math.max(0.0f, f13 - f11);
        if (i11 != -1) {
            max = Math.min(i11, max);
        }
        float f15 = 1.0f;
        float f16 = 1.0f / i10;
        int i12 = fVar.f57508y;
        if (i12 == 1 || i12 == 2) {
            z10 = true;
        }
        if (z10) {
            f12 = f13;
        }
        if (z10) {
            f14 = -0.0f;
        }
        float f17 = (f12 + f14) * f16;
        if (z10) {
            f15 = -1.0f;
        }
        float max2 = (Math.max(max * f16, 0.001f) * f15) + f17;
        int[] iArr = new int[8];
        d0.a(d0.f3214i, i7, iArr);
        int i13 = fVar.f57508y;
        if (i13 != 1 && i13 != 4) {
            return new LinearGradient(max2, 0.0f, f17, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f17, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static float l(float f10, int i7, int i10) {
        float f11;
        float f12;
        return (((float) Math.floor((f10 - f11) / f12)) * i10) + i7;
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f57505s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.f56672e);
        this.f57505s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: si.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f57505s.d();
    }

    @Override
    public final void f(int i7) {
        this.f57505s.e(i7 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(r rVar) {
        kc kcVar;
        boolean z10 = rVar.f56717a;
        kc kcVar2 = this.f57504r;
        if (z10) {
            kcVar = this.f57503n;
        } else {
            kcVar = kcVar2;
        }
        kc kcVar3 = this.f57505s;
        if (kcVar3 != kcVar) {
            if (kcVar3 != null) {
                kcVar3.b();
            }
            this.f57505s = kcVar;
            kcVar.e(this.f56671c / 255.0f);
            if (this.f57505s == kcVar2) {
                this.f57507x = true;
            } else {
                this.f57506w = true;
            }
            invalidateSelf();
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final boolean j() {
        kc kcVar = this.f57505s;
        kcVar.getClass();
        return !(kcVar instanceof b);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f57506w = true;
        this.f57507x = true;
    }

    @Override
    public final void updateColors() {
        ui.c cVar = this.H;
        if (cVar != null) {
            this.I = n6.r1(this.J / 255.0f, cVar.f58998b);
            this.K = n6.r1(this.L / 255.0f, this.H.f58998b);
        }
        this.f57506w = true;
        this.f57507x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
