package rh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import hi.t6;
import ji.j;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.j1;
import org.telegram.ui.Components.sz;
import org.telegram.ui.web.z0;
import r0.i1;
import r0.l1;
import te.k;
import te.l;
public class h implements f, e, c {
    public d E;
    public View F;
    public int G;
    public int H;
    public final te.c f56603a;
    public final k f56604b = new k(0.0f);
    public final l f56605c = new l();
    public final l d = new l();
    public final h2.f f56606e = new h2.f((int[]) null);
    public final sz f56607f;
    public final Runnable h;
    public boolean f56608n;
    public l1 f56609r;
    public int f56610s;
    public int f56611w;
    public int f56612x;
    public final g f56613y;

    public h(Runnable runnable) {
        t6 t6Var = new t6(this, 25);
        ?? obj = new Object();
        obj.f39868c = b.f56593a;
        obj.d = new z0(obj, 7);
        obj.f39867b = t6Var;
        Typeface typeface = g0.f24093a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.f26915b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.f39866a = f10 * 250.0f * 1.1f;
        this.f56607f = obj;
        this.f56610s = 1;
        this.f56613y = new g(this, 0);
        this.h = runnable;
        this.f56603a = new te.c(0, new j(this, runnable, false, 27), j1.f29019w, 250L);
    }

    @Override
    public final void O() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new g(this, 1));
        }
    }

    @Override
    public final View S() {
        return this.F;
    }

    public final void a() {
        boolean z10 = this.f56603a.h;
        boolean z11 = this.f56608n;
        h2.f fVar = this.f56606e;
        if (!z11 && z10) {
            this.f56608n = true;
            fVar.d();
        }
        if (this.f56608n && !z10) {
            this.f56608n = false;
            fVar.e();
        }
    }

    public final float c() {
        d dVar = this.E;
        l lVar = this.d;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f57683a);
        }
        return lVar.d.f57683a;
    }

    public final float d() {
        d dVar = this.E;
        l lVar = this.f56605c;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f57683a);
        }
        return lVar.d.f57683a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.f56611w));
        }
        return Math.max(f(527).d, this.f56611w);
    }

    public final i0.b f(int i7) {
        l1 l1Var = this.f56609r;
        if (l1Var != null) {
            return l1Var.f56258a.f(i7);
        }
        return i0.b.f15891e;
    }

    public final void g(int i7) {
        if (this.f56611w == i7 && this.f56610s == 0) {
            return;
        }
        g0.r(this.f56613y);
        this.f56612x = Math.max(this.f56611w, i7);
        this.f56611w = i7;
        this.f56610s = 0;
        j(this.f56609r);
    }

    public final void h(int i7) {
        if (i7 > 0) {
            g(i7 + g0.f24116n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        int i7;
        if (this.f56611w != 0) {
            g gVar = this.f56613y;
            g0.r(gVar);
            if (z10) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.f56610s = i7;
            j(this.f56609r);
            if (z10) {
                g0.h3(gVar, 1000L);
            }
        }
    }

    public final void j(l1 l1Var) {
        boolean z10;
        if (this.f56609r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(l1Var, z10);
    }

    public final void k(l1 l1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f10;
        int i7;
        te.c cVar;
        float f11;
        l1 b10 = b(l1Var);
        this.f56609r = b10;
        i0.b bVar3 = i0.b.f15891e;
        if (b10 != null) {
            i1 i1Var = b10.f56258a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f56258a.f(8);
        }
        sz szVar = this.f56607f;
        b bVar4 = (b) szVar.f39868c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f56593a;
            }
        } else if (z11) {
            bVar2 = b.f56595c;
        } else {
            bVar2 = b.f56594b;
        }
        if (bVar4 != bVar2) {
            szVar.a(bVar2, false);
        }
        int i10 = this.f56610s;
        if (i10 == 2) {
            this.f56611w = 0;
        }
        if (i10 == 3 && bVar3.d > 0) {
            this.f56611w = 0;
        }
        i0.b a10 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.f56611w));
        int i11 = a10.f15894c;
        int i12 = a10.f15893b;
        int i13 = a10.f15892a;
        int i14 = a10.d;
        i0.b a11 = i0.b.a(bVar, a10);
        int i15 = a11.d;
        int i16 = a11.f15894c;
        int i17 = a11.f15893b;
        int i18 = a11.f15892a;
        Runnable runnable = this.h;
        te.c cVar2 = this.f56603a;
        l lVar = this.d;
        l lVar2 = this.f56605c;
        k kVar = this.f56604b;
        if (z10) {
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
            kVar.f57685c = f11;
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
    public final void m(l1 l1Var) {
        int i7;
        l1 b10 = b(l1Var);
        if (b10 != null) {
            i7 = b10.f56258a.f(8).d;
        } else {
            i7 = 0;
        }
        this.G = i7;
        this.h.run();
    }

    @Override
    public final void w() {
        this.H++;
    }

    public l1 b(l1 l1Var) {
        return l1Var;
    }
}
