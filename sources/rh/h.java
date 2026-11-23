package rh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import hi.t6;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.web.i1;
import r0.l1;
import te.k;
import te.l;
public class h implements f, e, c {
    public d E;
    public View F;
    public int G;
    public int H;
    public final te.c f56613a;
    public final k f56614b = new k(0.0f);
    public final l f56615c = new l();
    public final l d = new l();
    public final h2.f f56616e = new h2.f((int[]) null);
    public final uz f56617f;
    public final Runnable h;
    public boolean f56618n;
    public l1 f56619r;
    public int f56620s;
    public int f56621w;
    public int f56622x;
    public final g f56623y;

    public h(Runnable runnable) {
        t6 t6Var = new t6(this, 25);
        ?? obj = new Object();
        obj.f40562c = b.f56603a;
        obj.d = new i1(obj, 6);
        obj.f40561b = t6Var;
        Typeface typeface = g0.f23982a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.f26895b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.f40560a = f10 * 250.0f * 1.1f;
        this.f56617f = obj;
        this.f56620s = 1;
        this.f56623y = new g(this, 0);
        this.h = runnable;
        this.f56613a = new te.c(0, new ji.k(this, runnable, false, 27), org.telegram.ui.ActionBar.i1.f28971w, 250L);
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
        boolean z10 = this.f56613a.h;
        boolean z11 = this.f56618n;
        h2.f fVar = this.f56616e;
        if (!z11 && z10) {
            this.f56618n = true;
            fVar.d();
        }
        if (this.f56618n && !z10) {
            this.f56618n = false;
            fVar.e();
        }
    }

    public final float c() {
        d dVar = this.E;
        l lVar = this.d;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f57691a);
        }
        return lVar.d.f57691a;
    }

    public final float d() {
        d dVar = this.E;
        l lVar = this.f56615c;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f57691a);
        }
        return lVar.d.f57691a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.f56621w));
        }
        return Math.max(f(527).d, this.f56621w);
    }

    public final i0.b f(int i7) {
        l1 l1Var = this.f56619r;
        if (l1Var != null) {
            return l1Var.f56268a.f(i7);
        }
        return i0.b.f15882e;
    }

    public final void g(int i7) {
        if (this.f56621w == i7 && this.f56620s == 0) {
            return;
        }
        g0.r(this.f56623y);
        this.f56622x = Math.max(this.f56621w, i7);
        this.f56621w = i7;
        this.f56620s = 0;
        j(this.f56619r);
    }

    public final void h(int i7) {
        if (i7 > 0) {
            g(i7 + g0.f24005n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        int i7;
        if (this.f56621w != 0) {
            g gVar = this.f56623y;
            g0.r(gVar);
            if (z10) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.f56620s = i7;
            j(this.f56619r);
            if (z10) {
                g0.h3(gVar, 1000L);
            }
        }
    }

    public final void j(l1 l1Var) {
        boolean z10;
        if (this.f56619r != null) {
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
        this.f56619r = b10;
        i0.b bVar3 = i0.b.f15882e;
        if (b10 != null) {
            r0.i1 i1Var = b10.f56268a;
            bVar = i0.b.a(i1Var.f(647), i1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f56268a.f(8);
        }
        uz uzVar = this.f56617f;
        b bVar4 = (b) uzVar.f40562c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f56603a;
            }
        } else if (z11) {
            bVar2 = b.f56605c;
        } else {
            bVar2 = b.f56604b;
        }
        if (bVar4 != bVar2) {
            uzVar.a(bVar2, false);
        }
        int i10 = this.f56620s;
        if (i10 == 2) {
            this.f56621w = 0;
        }
        if (i10 == 3 && bVar3.d > 0) {
            this.f56621w = 0;
        }
        i0.b a10 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.f56621w));
        int i11 = a10.f15885c;
        int i12 = a10.f15884b;
        int i13 = a10.f15883a;
        int i14 = a10.d;
        i0.b a11 = i0.b.a(bVar, a10);
        int i15 = a11.d;
        int i16 = a11.f15885c;
        int i17 = a11.f15884b;
        int i18 = a11.f15883a;
        Runnable runnable = this.h;
        te.c cVar2 = this.f56613a;
        l lVar = this.d;
        l lVar2 = this.f56615c;
        k kVar = this.f56614b;
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
            kVar.f57693c = f11;
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
            i7 = b10.f56268a.f(8).d;
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
