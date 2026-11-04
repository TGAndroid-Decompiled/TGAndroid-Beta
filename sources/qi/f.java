package qi;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import cg.b0;
import org.telegram.ui.ActionBar.k6;
import pi.r;
import v7.q;
public final class f extends pi.e {
    public g E;
    public g F;
    public g G;
    public si.c H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final RectF M;
    public final si.a f53973f;
    public final a h;
    public final q f53974n;
    public final q f53975r;
    public q f53976s;
    public boolean f53977w = true;
    public boolean f53978x = true;
    public int f53979y = 1;

    public f(si.a aVar) {
        a aVar2;
        q bVar;
        g gVar = g.f53980b;
        this.E = gVar;
        this.F = gVar;
        this.G = gVar;
        this.J = 255;
        this.L = 255;
        this.M = new RectF();
        this.f53973f = aVar;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
        } else {
            aVar2 = null;
        }
        this.h = aVar2;
        if (aVar instanceof si.e) {
            if (Build.VERSION.SDK_INT >= 29) {
                bVar = new c(this);
            } else {
                bVar = new b(this, false);
            }
            this.f53974n = bVar;
            this.f53975r = bVar;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                this.f53974n = new e(this);
                this.f53975r = new c(this);
            } else if (i3 >= 31) {
                this.f53974n = new d(this);
                this.f53975r = new c(this);
            } else {
                this.f53974n = new b(this, true);
                this.f53975r = new b(this, false);
            }
        }
        g(this.f53578b);
    }

    public static LinearGradient k(f fVar, g gVar, float f10, float f11, int i3, int i10) {
        int i11;
        if (gVar == null) {
            i11 = -1;
        } else {
            i11 = gVar.f53981a;
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
        int i12 = fVar.f53979y;
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
        b0.a(b0.f4619i, i3, iArr);
        int i13 = fVar.f53979y;
        if (i13 != 1 && i13 != 4) {
            return new LinearGradient(max2, 0.0f, f17, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f17, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static float l(float f10, int i3, int i10) {
        float f11;
        float f12;
        return (((float) Math.floor((f10 - f11) / f12)) * i10) + i3;
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f53976s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.f53580e);
        this.f53976s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: qi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f53976s.d();
    }

    @Override
    public final void f(int i3) {
        this.f53976s.e(i3 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(r rVar) {
        q qVar;
        boolean z10 = rVar.f53625a;
        q qVar2 = this.f53975r;
        if (z10) {
            qVar = this.f53974n;
        } else {
            qVar = qVar2;
        }
        q qVar3 = this.f53976s;
        if (qVar3 != qVar) {
            if (qVar3 != null) {
                qVar3.b();
            }
            this.f53976s = qVar;
            qVar.e(this.f53579c / 255.0f);
            if (this.f53976s == qVar2) {
                this.f53978x = true;
            } else {
                this.f53977w = true;
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
        q qVar = this.f53976s;
        qVar.getClass();
        return !(qVar instanceof b);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f53977w = true;
        this.f53978x = true;
    }

    @Override
    public final void updateColors() {
        si.c cVar = this.H;
        if (cVar != null) {
            this.I = k6.r1(this.J / 255.0f, cVar.f54747b);
            this.K = k6.r1(this.L / 255.0f, this.H.f54747b);
        }
        this.f53977w = true;
        this.f53978x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
