package pi;

import a8.lf;
import ag.h0;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import oi.r;
import org.telegram.ui.ActionBar.y6;
public final class e extends oi.e {
    public f E;
    public hh.c F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final RectF K;
    public final ri.a e;
    public final oi.c f46885f;
    public final lf h;
    public final lf f46886n;
    public lf f46887r;
    public boolean f46888s = true;
    public boolean v = true;
    public int f46889w = 1;
    public f f46890x;
    public f f46891y;

    public e(ri.a aVar) {
        oi.c cVar;
        lf aVar2;
        f fVar = f.f46892b;
        this.f46890x = fVar;
        this.f46891y = fVar;
        this.E = fVar;
        this.H = 255;
        this.J = 255;
        this.K = new RectF();
        this.e = aVar;
        if (aVar instanceof oi.c) {
            cVar = (oi.c) aVar;
        } else {
            cVar = null;
        }
        this.f46885f = cVar;
        if (aVar instanceof ri.b) {
            if (Build.VERSION.SDK_INT >= 29) {
                aVar2 = new b(this);
            } else {
                aVar2 = new a(this, false);
            }
            this.h = aVar2;
            this.f46886n = aVar2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.h = new d(this);
                this.f46886n = new b(this);
            } else if (i10 >= 31) {
                this.h = new c(this);
                this.f46886n = new b(this);
            } else {
                this.h = new a(this, true);
                this.f46886n = new a(this, false);
            }
        }
        g(this.f19460a);
    }

    public static float k(float f7, int i10, int i11) {
        float f10;
        float f11;
        return (((float) Math.floor((f7 - f10) / f11)) * i11) + i10;
    }

    public static LinearGradient l(e eVar, f fVar, float f7, float f10, int i10, int i11) {
        int i12;
        if (fVar == null) {
            i12 = -1;
        } else {
            i12 = fVar.f46893a;
        }
        boolean z10 = false;
        float f11 = 0;
        float f12 = f7 - f11;
        float f13 = 0.0f;
        float max = Math.max(0.0f, f12 - f10);
        if (i12 != -1) {
            max = Math.min(i12, max);
        }
        float f14 = 1.0f;
        float f15 = 1.0f / i11;
        int i13 = eVar.f46889w;
        if (i13 == 1 || i13 == 2) {
            z10 = true;
        }
        if (z10) {
            f11 = f12;
        }
        if (z10) {
            f13 = -0.0f;
        }
        float f16 = (f11 + f13) * f15;
        if (z10) {
            f14 = -1.0f;
        }
        float max2 = (Math.max(max * f15, 0.001f) * f14) + f16;
        int[] iArr = new int[8];
        h0.a(h0.f1292i, i10, iArr);
        int i14 = eVar.f46889w;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f46887r.b();
            return;
        }
        RectF rectF = this.K;
        rectF.set(bounds);
        rectF.offset(this.f19462c, this.d);
        this.f46887r.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: pi.e.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f46887r.d();
    }

    @Override
    public final void f(int i10) {
        this.f46887r.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(r rVar) {
        lf lfVar;
        boolean z10 = rVar.f19504a;
        lf lfVar2 = this.f46886n;
        if (z10) {
            lfVar = this.h;
        } else {
            lfVar = lfVar2;
        }
        lf lfVar3 = this.f46887r;
        if (lfVar3 != lfVar) {
            if (lfVar3 != null) {
                lfVar3.b();
            }
            this.f46887r = lfVar;
            lfVar.e(this.f19461b / 255.0f);
            if (this.f46887r == lfVar2) {
                this.v = true;
            } else {
                this.f46888s = true;
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
        lf lfVar = this.f46887r;
        lfVar.getClass();
        return !(lfVar instanceof a);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46888s = true;
        this.v = true;
    }

    @Override
    public final void updateColors() {
        hh.c cVar = this.F;
        if (cVar != null) {
            this.G = y6.o1(this.H / 255.0f, cVar.f12837b);
            this.I = y6.o1(this.J / 255.0f, this.F.f12837b);
        }
        this.f46888s = true;
        this.v = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
