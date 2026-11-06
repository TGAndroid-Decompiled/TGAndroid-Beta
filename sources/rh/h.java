package rh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import m4.d0;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.hz;
import r0.h1;
import r0.k1;
import te.k;
import te.l;
public class h implements f, e, c {
    public d D;
    public View E;
    public int F;
    public int G;
    public final te.c f54429a;
    public final k f54430b = new k(0.0f);
    public final l f54431c = new l();
    public final l d = new l();
    public final h2.f f54432e = new h2.f((int[]) null);
    public final hz f54433f;
    public final Runnable h;
    public boolean f54434n;
    public k1 f54435r;
    public int f54436s;
    public int f54437w;
    public int f54438x;
    public final g f54439y;

    public h(Runnable runnable) {
        ii.c cVar = new ii.c(this, 19);
        ?? obj = new Object();
        obj.f34455c = b.f54419a;
        obj.d = new m5(obj, 24);
        obj.f34454b = cVar;
        Typeface typeface = g0.f22509a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.f25555b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.f34453a = f10 * 250.0f * 1.1f;
        this.f54433f = obj;
        this.f54436s = 1;
        this.f54439y = new g(this, 0);
        this.h = runnable;
        this.f54429a = new te.c(0, new d0(this, runnable, false), i1.f27540w, 250L);
    }

    @Override
    public final void P() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new g(this, 1));
        }
    }

    @Override
    public final View R() {
        return this.E;
    }

    public final void a() {
        boolean z9 = this.f54429a.h;
        boolean z10 = this.f54434n;
        h2.f fVar = this.f54432e;
        if (!z10 && z9) {
            this.f54434n = true;
            fVar.d();
        }
        if (this.f54434n && !z9) {
            this.f54434n = false;
            fVar.e();
        }
    }

    public final float c() {
        d dVar = this.D;
        l lVar = this.d;
        if (dVar != null && this.G > 0) {
            return Math.max(this.F, lVar.d.f55396a);
        }
        return lVar.d.f55396a;
    }

    public final float d() {
        d dVar = this.D;
        l lVar = this.f54431c;
        if (dVar != null && this.G > 0) {
            return Math.max(this.F, lVar.d.f55396a);
        }
        return lVar.d.f55396a;
    }

    public final int e() {
        if (this.D != null && this.G > 0) {
            return Math.max(this.F, Math.max(f(527).d, this.f54437w));
        }
        return Math.max(f(527).d, this.f54437w);
    }

    public final i0.b f(int i7) {
        k1 k1Var = this.f54435r;
        if (k1Var != null) {
            return k1Var.f54084a.f(i7);
        }
        return i0.b.f15116e;
    }

    public final void g(int i7) {
        if (this.f54437w == i7 && this.f54436s == 0) {
            return;
        }
        g0.r(this.f54439y);
        this.f54438x = Math.max(this.f54437w, i7);
        this.f54437w = i7;
        this.f54436s = 0;
        j(this.f54435r);
    }

    public final void h(int i7) {
        if (i7 > 0) {
            g(i7 + g0.f22532n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z9) {
        int i7;
        if (this.f54437w != 0) {
            g gVar = this.f54439y;
            g0.r(gVar);
            if (z9) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.f54436s = i7;
            j(this.f54435r);
            if (z9) {
                g0.i3(gVar, 1000L);
            }
        }
    }

    public final void j(k1 k1Var) {
        boolean z9;
        if (this.f54435r != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        k(k1Var, z9);
    }

    public final void k(k1 k1Var, boolean z9) {
        i0.b bVar;
        boolean z10;
        b bVar2;
        float f10;
        int i7;
        te.c cVar;
        float f11;
        k1 b10 = b(k1Var);
        this.f54435r = b10;
        i0.b bVar3 = i0.b.f15116e;
        if (b10 != null) {
            h1 h1Var = b10.f54084a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f54084a.f(8);
        }
        hz hzVar = this.f54433f;
        b bVar4 = (b) hzVar.f34455c;
        if (bVar3.d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9) {
            if (z10) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f54419a;
            }
        } else if (z10) {
            bVar2 = b.f54421c;
        } else {
            bVar2 = b.f54420b;
        }
        if (bVar4 != bVar2) {
            hzVar.a(bVar2, false);
        }
        int i10 = this.f54436s;
        if (i10 == 2) {
            this.f54437w = 0;
        }
        if (i10 == 3 && bVar3.d > 0) {
            this.f54437w = 0;
        }
        i0.b a10 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.f54437w));
        int i11 = a10.f15119c;
        int i12 = a10.f15118b;
        int i13 = a10.f15117a;
        int i14 = a10.d;
        i0.b a11 = i0.b.a(bVar, a10);
        int i15 = a11.d;
        int i16 = a11.f15119c;
        int i17 = a11.f15118b;
        int i18 = a11.f15117a;
        Runnable runnable = this.h;
        te.c cVar2 = this.f54429a;
        l lVar = this.d;
        l lVar2 = this.f54431c;
        k kVar = this.f54430b;
        if (z9) {
            if (i14 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!kVar.b(f10)) {
                cVar = cVar2;
                i7 = i16;
                if (!lVar2.b(i18, i17, i16, i15) && !lVar.b(i13, i12, i11, i14)) {
                    if (bVar4 != bVar2) {
                        runnable.run();
                    }
                }
            } else {
                i7 = i16;
                cVar = cVar2;
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            if (i14 > 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.f55398c = f11;
            lVar2.e(i18, i17, i7, i15);
            lVar.e(i13, i12, i11, i14);
            te.c cVar3 = cVar;
            cVar3.c(0.0f);
            cVar3.a(1.0f);
        } else {
            float f12 = 0.0f;
            cVar2.b();
            if (i14 > 0) {
                f12 = 1.0f;
            }
            kVar.d(f12);
            lVar2.d(i18, i17, i16, i15);
            lVar.d(i13, i12, i11, i14);
            runnable.run();
        }
        a();
    }

    @Override
    public final void m(k1 k1Var) {
        int i7;
        k1 b10 = b(k1Var);
        if (b10 != null) {
            i7 = b10.f54084a.f(8).d;
        } else {
            i7 = 0;
        }
        this.F = i7;
        this.h.run();
    }

    @Override
    public final void w() {
        this.G++;
    }

    public k1 b(k1 k1Var) {
        return k1Var;
    }
}
