package si;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import bg.d0;
import c8.lc;
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
    public final ui.a f57621f;
    public final a h;
    public final lc f57622n;
    public final lc f57623r;
    public lc f57624s;
    public boolean f57625w = true;
    public boolean f57626x = true;
    public int f57627y = 1;

    public f(ui.a aVar) {
        a aVar2;
        lc bVar;
        g gVar = g.f57628b;
        this.E = gVar;
        this.F = gVar;
        this.G = gVar;
        this.J = 255;
        this.L = 255;
        this.M = new RectF();
        this.f57621f = aVar;
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
            this.f57622n = bVar;
            this.f57623r = bVar;
        } else {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                this.f57622n = new e(this);
                this.f57623r = new c(this);
            } else if (i7 >= 31) {
                this.f57622n = new d(this);
                this.f57623r = new c(this);
            } else {
                this.f57622n = new b(this, true);
                this.f57623r = new b(this, false);
            }
        }
        g(this.f56793b);
    }

    public static LinearGradient k(f fVar, g gVar, float f10, float f11, int i7, int i10) {
        int i11;
        if (gVar == null) {
            i11 = -1;
        } else {
            i11 = gVar.f57629a;
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
        int i12 = fVar.f57627y;
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
        d0.a(d0.f3185i, i7, iArr);
        int i13 = fVar.f57627y;
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
            this.f57624s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.f56795e);
        this.f57624s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: si.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f57624s.d();
    }

    @Override
    public final void f(int i7) {
        this.f57624s.e(i7 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(r rVar) {
        lc lcVar;
        boolean z10 = rVar.f56840a;
        lc lcVar2 = this.f57623r;
        if (z10) {
            lcVar = this.f57622n;
        } else {
            lcVar = lcVar2;
        }
        lc lcVar3 = this.f57624s;
        if (lcVar3 != lcVar) {
            if (lcVar3 != null) {
                lcVar3.b();
            }
            this.f57624s = lcVar;
            lcVar.e(this.f56794c / 255.0f);
            if (this.f57624s == lcVar2) {
                this.f57626x = true;
            } else {
                this.f57625w = true;
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
        lc lcVar = this.f57624s;
        lcVar.getClass();
        return !(lcVar instanceof b);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f57625w = true;
        this.f57626x = true;
    }

    @Override
    public final void updateColors() {
        ui.c cVar = this.H;
        if (cVar != null) {
            this.I = n6.r1(this.J / 255.0f, cVar.f59123b);
            this.K = n6.r1(this.L / 255.0f, this.H.f59123b);
        }
        this.f57625w = true;
        this.f57626x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
