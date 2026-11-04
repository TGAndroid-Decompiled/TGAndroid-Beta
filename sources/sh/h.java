package sh;

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import gi.j8;
import m2.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.Components.ez;
import qe.k;
import qe.l;
import r0.k1;
import r4.u;
public class h implements f, e, c {
    public d E;
    public View F;
    public int G;
    public int H;
    public final qe.c f54729a;
    public final k f54730b = new k(0.0f);
    public final l f54731c = new l();
    public final l d = new l();
    public final g2.g f54732e = new g2.g((int[]) null);
    public final ez f54733f;
    public final Runnable h;
    public boolean f54734n;
    public k1 f54735r;
    public int f54736s;
    public int f54737w;
    public int f54738x;
    public final g f54739y;

    public h(Runnable runnable) {
        j8 j8Var = new j8(this, 22);
        ?? obj = new Object();
        obj.f33611c = b.f54719a;
        obj.d = new u(obj, 2);
        obj.f33610b = j8Var;
        Typeface typeface = g0.f22580a;
        float f10 = 1.0f;
        try {
            f10 = Settings.Global.getFloat(t0.f25457b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        obj.f33609a = f10 * 250.0f * 1.1f;
        this.f54733f = obj;
        this.f54736s = 1;
        this.f54739y = new g(this, 0);
        this.h = runnable;
        this.f54729a = new qe.c(0, new t(25, this, runnable), h1.f27551w, 250L);
    }

    @Override
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new g(this, 1));
        }
    }

    @Override
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z10 = this.f54729a.h;
        boolean z11 = this.f54734n;
        g2.g gVar = this.f54732e;
        if (!z11 && z10) {
            this.f54734n = true;
            gVar.d();
        }
        if (this.f54734n && !z10) {
            this.f54734n = false;
            gVar.e();
        }
    }

    public final float c() {
        d dVar = this.E;
        l lVar = this.d;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f53866a);
        }
        return lVar.d.f53866a;
    }

    public final float d() {
        d dVar = this.E;
        l lVar = this.f54731c;
        if (dVar != null && this.H > 0) {
            return Math.max(this.G, lVar.d.f53866a);
        }
        return lVar.d.f53866a;
    }

    public final int e() {
        if (this.E != null && this.H > 0) {
            return Math.max(this.G, Math.max(f(527).d, this.f54737w));
        }
        return Math.max(f(527).d, this.f54737w);
    }

    public final i0.b f(int i3) {
        k1 k1Var = this.f54735r;
        if (k1Var != null) {
            return k1Var.f54026a.f(i3);
        }
        return i0.b.f14494e;
    }

    public final void g(int i3) {
        if (this.f54737w == i3 && this.f54736s == 0) {
            return;
        }
        g0.r(this.f54739y);
        this.f54738x = Math.max(this.f54737w, i3);
        this.f54737w = i3;
        this.f54736s = 0;
        j(this.f54735r);
    }

    public final void h(int i3) {
        if (i3 > 0) {
            g(i3 + g0.f22603n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        int i3;
        if (this.f54737w != 0) {
            g gVar = this.f54739y;
            g0.r(gVar);
            if (z10) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            this.f54736s = i3;
            j(this.f54735r);
            if (z10) {
                g0.i3(gVar, 1000L);
            }
        }
    }

    public final void j(k1 k1Var) {
        boolean z10;
        if (this.f54735r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(k1Var, z10);
    }

    public final void k(k1 k1Var, boolean z10) {
        i0.b bVar;
        boolean z11;
        b bVar2;
        float f10;
        int i3;
        qe.c cVar;
        float f11;
        k1 b10 = b(k1Var);
        this.f54735r = b10;
        i0.b bVar3 = i0.b.f14494e;
        if (b10 != null) {
            r0.h1 h1Var = b10.f54026a;
            bVar = i0.b.a(h1Var.f(647), h1Var.g(647));
        } else {
            bVar = bVar3;
        }
        if (b10 != null) {
            bVar3 = b10.f54026a.f(8);
        }
        ez ezVar = this.f54733f;
        b bVar4 = (b) ezVar.f33611c;
        if (bVar3.d > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (z11) {
                bVar2 = b.d;
            } else {
                bVar2 = b.f54719a;
            }
        } else if (z11) {
            bVar2 = b.f54721c;
        } else {
            bVar2 = b.f54720b;
        }
        if (bVar4 != bVar2) {
            ezVar.a(bVar2, false);
        }
        int i10 = this.f54736s;
        if (i10 == 2) {
            this.f54737w = 0;
        }
        if (i10 == 3 && bVar3.d > 0) {
            this.f54737w = 0;
        }
        i0.b a10 = i0.b.a(bVar3, i0.b.b(0, 0, 0, this.f54737w));
        int i11 = a10.f14497c;
        int i12 = a10.f14496b;
        int i13 = a10.f14495a;
        int i14 = a10.d;
        i0.b a11 = i0.b.a(bVar, a10);
        int i15 = a11.d;
        int i16 = a11.f14497c;
        int i17 = a11.f14496b;
        int i18 = a11.f14495a;
        Runnable runnable = this.h;
        qe.c cVar2 = this.f54729a;
        l lVar = this.d;
        l lVar2 = this.f54731c;
        k kVar = this.f54730b;
        if (z10) {
            if (i14 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!kVar.b(f10)) {
                cVar = cVar2;
                i3 = i16;
                if (!lVar2.b(i18, i17, i16, i15) && !lVar.b(i13, i12, i11, i14)) {
                    if (bVar4 != bVar2) {
                        runnable.run();
                    }
                }
            } else {
                i3 = i16;
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
            kVar.f53868c = f11;
            lVar2.e(i18, i17, i3, i15);
            lVar.e(i13, i12, i11, i14);
            qe.c cVar3 = cVar;
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
        int i3;
        k1 b10 = b(k1Var);
        if (b10 != null) {
            i3 = b10.f54026a.f(8).d;
        } else {
            i3 = 0;
        }
        this.G = i3;
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
