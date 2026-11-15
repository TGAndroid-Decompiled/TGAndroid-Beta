package rh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import hi.g7;
import ji.j;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.Components.lz;
import r0.h1;
import r0.k1;
import te.k;
import te.l;
public class h implements f, e, c {
    public d E;
    public View F;
    public int G;
    public int H;
    public final te.c f56029a;
    public final k f56030b = new k(0.0f);
    public final l f56031c = new l();
    public final l d = new l();
    public final h2.f f56032e = new h2.f((int[]) null);
    public final lz f56033f;
    public final Runnable h;
    public boolean f56034n;
    public k1 f56035r;
    public int f56036s;
    public int f56037w;
    public int f56038x;
    public final g f56039y;

    public h(Runnable runnable) {
        g7 g7Var = new g7(this, 24);
        ?? obj = new Object();
        obj.f37017c = b.f56019a;
        obj.d = new q2.d(obj, 4);
        obj.f37016b = g7Var;
        Typeface typeface = g0.f23583a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.f26609b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.f37015a = f10 * 250.0f * 1.1f;
        this.f56033f = obj;
        this.f56036s = 1;
        this.f56039y = new g(this, 0);
        this.h = runnable;
        this.f56029a = new te.c(0, new j(this, runnable, false, 27), i1.f28644w, 250L);
    }

    @Override
    public final void Q() {
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
        boolean z10 = this.f56029a.h;
        boolean z11 = this.f56034n;
        h2.f fVar = this.f56032e;
        if (!z11 && z10) {
            this.f56034n = true;
            fVar.d();
        }
        if (this.f56034n && !z10) {
            this.f56034n = false;
            fVar.e();
        }
    }

    public final float c() {
        d dVar = this.E;
        l lVar = this.d;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f57111a);
        }
        return lVar.d.f57111a;
    }

    public final float d() {
        d dVar = this.E;
        l lVar = this.f56031c;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f57111a);
        }
        return lVar.d.f57111a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.f56037w));
        }
        return Math.max(f(527).d, this.f56037w);
    }

    public final i0.c f(int i7) {
        k1 k1Var = this.f56035r;
        if (k1Var != null) {
            return k1Var.f55682a.f(i7);
        }
        return i0.c.f15573e;
    }

    public final void g(int i7) {
        if (this.f56037w == i7 && this.f56036s == 0) {
            return;
        }
        g0.r(this.f56039y);
        this.f56038x = Math.max(this.f56037w, i7);
        this.f56037w = i7;
        this.f56036s = 0;
        j(this.f56035r);
    }

    public final void h(int i7) {
        if (i7 > 0) {
            g(i7 + g0.f23606n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        int i7;
        if (this.f56037w != 0) {
            g gVar = this.f56039y;
            g0.r(gVar);
            if (z10) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            this.f56036s = i7;
            j(this.f56035r);
            if (z10) {
                g0.i3(gVar, 1000L);
            }
        }
    }

    public final void j(k1 k1Var) {
        boolean z10;
        if (this.f56035r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(k1Var, z10);
    }

    public final void k(k1 k1Var, boolean z10) {
        i0.c cVar;
        boolean z11;
        b bVar;
        float f10;
        int i7;
        te.c cVar2;
        float f11;
        k1 b10 = b(k1Var);
        this.f56035r = b10;
        i0.c cVar3 = i0.c.f15573e;
        if (b10 != null) {
            h1 h1Var = b10.f55682a;
            cVar = i0.c.a(h1Var.f(647), h1Var.g(647));
        } else {
            cVar = cVar3;
        }
        if (b10 != null) {
            cVar3 = b10.f55682a.f(8);
        }
        lz lzVar = this.f56033f;
        b bVar2 = (b) lzVar.f37017c;
        if (cVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar = b.d;
            } else {
                bVar = b.f56019a;
            }
        } else if (z11) {
            bVar = b.f56021c;
        } else {
            bVar = b.f56020b;
        }
        if (bVar2 != bVar) {
            lzVar.a(bVar, false);
        }
        int i10 = this.f56036s;
        if (i10 == 2) {
            this.f56037w = 0;
        }
        if (i10 == 3 && cVar3.d > 0) {
            this.f56037w = 0;
        }
        i0.c a10 = i0.c.a(cVar3, i0.c.b(0, 0, 0, this.f56037w));
        int i11 = a10.f15576c;
        int i12 = a10.f15575b;
        int i13 = a10.f15574a;
        int i14 = a10.d;
        i0.c a11 = i0.c.a(cVar, a10);
        int i15 = a11.d;
        int i16 = a11.f15576c;
        int i17 = a11.f15575b;
        int i18 = a11.f15574a;
        Runnable runnable = this.h;
        te.c cVar4 = this.f56029a;
        l lVar = this.d;
        l lVar2 = this.f56031c;
        k kVar = this.f56030b;
        if (z10) {
            if (i14 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!kVar.b(f10)) {
                cVar2 = cVar4;
                i7 = i16;
                if (!lVar2.b(i18, i17, i16, i15) && !lVar.b(i13, i12, i11, i14)) {
                    if (bVar2 != bVar) {
                        runnable.run();
                    }
                }
            } else {
                i7 = i16;
                cVar2 = cVar4;
            }
            cVar2.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            if (i14 > 0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            kVar.f57113c = f11;
            lVar2.e(i18, i17, i7, i15);
            lVar.e(i13, i12, i11, i14);
            te.c cVar5 = cVar2;
            cVar5.c(0.0f);
            cVar5.a(1.0f);
        } else {
            float f12 = 0.0f;
            cVar4.b();
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
            i7 = b10.f55682a.f(8).d;
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

    public k1 b(k1 k1Var) {
        return k1Var;
    }
}
