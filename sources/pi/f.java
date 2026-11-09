package pi;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import bg.c0;
import c8.ob;
import oi.r;
import org.telegram.ui.ActionBar.l6;
public final class f extends oi.e {
    public g D;
    public g E;
    public g F;
    public ri.c G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final RectF L;
    public final ri.a f53681f;
    public final a h;
    public final ob f53682n;
    public final ob f53683r;
    public ob f53684s;
    public boolean f53685w = true;
    public boolean f53686x = true;
    public int f53687y = 1;

    public f(ri.a aVar) {
        a aVar2;
        ob bVar;
        g gVar = g.f53688b;
        this.D = gVar;
        this.E = gVar;
        this.F = gVar;
        this.I = 255;
        this.K = 255;
        this.L = new RectF();
        this.f53681f = aVar;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
        } else {
            aVar2 = null;
        }
        this.h = aVar2;
        if (aVar instanceof ri.e) {
            if (Build.VERSION.SDK_INT >= 29) {
                bVar = new c(this);
            } else {
                bVar = new b(this, false);
            }
            this.f53682n = bVar;
            this.f53683r = bVar;
        } else {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                this.f53682n = new e(this);
                this.f53683r = new c(this);
            } else if (i7 >= 31) {
                this.f53682n = new d(this);
                this.f53683r = new c(this);
            } else {
                this.f53682n = new b(this, true);
                this.f53683r = new b(this, false);
            }
        }
        g(this.f21075b);
    }

    public static LinearGradient k(f fVar, g gVar, float f10, float f11, int i7, int i10) {
        int i11;
        if (gVar == null) {
            i11 = -1;
        } else {
            i11 = gVar.f53689a;
        }
        boolean z9 = false;
        float f12 = 0;
        float f13 = f10 - f12;
        float f14 = 0.0f;
        float max = Math.max(0.0f, f13 - f11);
        if (i11 != -1) {
            max = Math.min(i11, max);
        }
        float f15 = 1.0f;
        float f16 = 1.0f / i10;
        int i12 = fVar.f53687y;
        if (i12 == 1 || i12 == 2) {
            z9 = true;
        }
        if (z9) {
            f12 = f13;
        }
        if (z9) {
            f14 = -0.0f;
        }
        float f17 = (f12 + f14) * f16;
        if (z9) {
            f15 = -1.0f;
        }
        float max2 = (Math.max(max * f16, 0.001f) * f15) + f17;
        int[] iArr = new int[8];
        c0.a(c0.f3259i, i7, iArr);
        int i13 = fVar.f53687y;
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
            this.f53684s.b();
            return;
        }
        RectF rectF = this.L;
        rectF.set(bounds);
        rectF.offset(this.d, this.f21077e);
        this.f53684s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: pi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f53684s.d();
    }

    @Override
    public final void f(int i7) {
        this.f53684s.e(i7 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(r rVar) {
        ob obVar;
        boolean z9 = rVar.f21122a;
        ob obVar2 = this.f53683r;
        if (z9) {
            obVar = this.f53682n;
        } else {
            obVar = obVar2;
        }
        ob obVar3 = this.f53684s;
        if (obVar3 != obVar) {
            if (obVar3 != null) {
                obVar3.b();
            }
            this.f53684s = obVar;
            obVar.e(this.f21076c / 255.0f);
            if (this.f53684s == obVar2) {
                this.f53686x = true;
            } else {
                this.f53685w = true;
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
        ob obVar = this.f53684s;
        obVar.getClass();
        return !(obVar instanceof b);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f53685w = true;
        this.f53686x = true;
    }

    @Override
    public final void updateColors() {
        ri.c cVar = this.G;
        if (cVar != null) {
            this.H = l6.r1(this.I / 255.0f, cVar.f54576b);
            this.J = l6.r1(this.K / 255.0f, this.G.f54576b);
        }
        this.f53685w = true;
        this.f53686x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
