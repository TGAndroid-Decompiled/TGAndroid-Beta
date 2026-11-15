package si;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import bg.c0;
import c8.hc;
import org.telegram.ui.ActionBar.j6;
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
    public final ui.a f56926f;
    public final a h;
    public final hc f56927n;
    public final hc f56928r;
    public hc f56929s;
    public boolean f56930w = true;
    public boolean f56931x = true;
    public int f56932y = 1;

    public f(ui.a aVar) {
        a aVar2;
        hc bVar;
        g gVar = g.f56933b;
        this.E = gVar;
        this.F = gVar;
        this.G = gVar;
        this.J = 255;
        this.L = 255;
        this.M = new RectF();
        this.f56926f = aVar;
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
            this.f56927n = bVar;
            this.f56928r = bVar;
        } else {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                this.f56927n = new e(this);
                this.f56928r = new c(this);
            } else if (i7 >= 31) {
                this.f56927n = new d(this);
                this.f56928r = new c(this);
            } else {
                this.f56927n = new b(this, true);
                this.f56928r = new b(this, false);
            }
        }
        g(this.f56096b);
    }

    public static LinearGradient k(f fVar, g gVar, float f10, float f11, int i7, int i10) {
        int i11;
        if (gVar == null) {
            i11 = -1;
        } else {
            i11 = gVar.f56934a;
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
        int i12 = fVar.f56932y;
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
        c0.a(c0.f3214i, i7, iArr);
        int i13 = fVar.f56932y;
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
            this.f56929s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.f56098e);
        this.f56929s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: si.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f56929s.d();
    }

    @Override
    public final void f(int i7) {
        this.f56929s.e(i7 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(r rVar) {
        hc hcVar;
        boolean z10 = rVar.f56143a;
        hc hcVar2 = this.f56928r;
        if (z10) {
            hcVar = this.f56927n;
        } else {
            hcVar = hcVar2;
        }
        hc hcVar3 = this.f56929s;
        if (hcVar3 != hcVar) {
            if (hcVar3 != null) {
                hcVar3.b();
            }
            this.f56929s = hcVar;
            hcVar.e(this.f56097c / 255.0f);
            if (this.f56929s == hcVar2) {
                this.f56931x = true;
            } else {
                this.f56930w = true;
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
        hc hcVar = this.f56929s;
        hcVar.getClass();
        return !(hcVar instanceof b);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f56930w = true;
        this.f56931x = true;
    }

    @Override
    public final void updateColors() {
        ui.c cVar = this.H;
        if (cVar != null) {
            this.I = j6.r1(this.J / 255.0f, cVar.f58431b);
            this.K = j6.r1(this.L / 255.0f, this.H.f58431b);
        }
        this.f56930w = true;
        this.f56931x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
