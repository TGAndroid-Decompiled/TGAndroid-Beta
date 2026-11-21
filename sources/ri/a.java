package ri;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.i0;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.tgnet.u;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ek0;
public final class a {
    public final q f56655a;
    public final ui.c f56656b;
    public final dh.c f56657c;
    public final dh.c d;
    public final ui.d f56658e;
    public final dh.c f56659f;
    public final d f56660g;
    public final ui.f h;
    public final ui.f f56661i;
    public Runnable f56662j;
    public final ui.a f56663k;
    public boolean f56664l;
    public FrameLayout f56665m;
    public ViewGroup f56666n;
    public eh.a f56667o;

    public a(q qVar, n nVar) {
        this.f56655a = qVar;
        qVar.f56735a = new u(this, 21);
        qVar.d = new ti.b(g0.L(48.0f));
        ui.c cVar = new ui.c();
        this.f56656b = cVar;
        cVar.a(nVar.e());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31) {
            d dVar = new d();
            this.f56660g = dVar;
            ui.f fVar = new ui.f(cVar);
            fVar.f59046f = cVar;
            fVar.h = dVar.d(2);
            this.h = fVar;
            ui.f fVar2 = new ui.f(cVar);
            this.f56661i = fVar2;
            fVar2.f59046f = cVar;
            fVar2.h = dVar.d(3);
            dh.c cVar2 = new dh.c(fVar, fVar2, cVar);
            this.f56657c = cVar2;
            cVar2.f8407j = qVar;
            cVar2.f8408k = true;
            ui.d dVar2 = new ui.d(fVar, fVar2);
            this.f56658e = dVar2;
            dh.c cVar3 = new dh.c(fVar2, fVar2, cVar);
            this.f56659f = cVar3;
            cVar3.f8407j = qVar;
            dh.c cVar4 = new dh.c(dVar2, fVar2, cVar);
            this.d = cVar4;
            cVar4.f8407j = qVar;
            cVar4.f8408k = true;
            this.f56663k = dVar.d(1);
            return;
        }
        this.f56663k = ui.e.f59041a;
        this.f56660g = null;
        this.h = null;
        this.f56661i = null;
        dh.c cVar5 = new dh.c(cVar, cVar, cVar);
        this.f56657c = cVar5;
        cVar5.f8407j = qVar;
        this.f56658e = null;
        this.d = cVar5;
        this.f56659f = cVar5;
    }

    public static int c(int i7) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i7);
    }

    public static int d(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i7 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i7, int i10, int i11, int i12) {
        int i13 = -c(i7);
        int i14 = -c(i10);
        g0.z3(viewGroup, 0, i13, 0, i14);
        viewGroup.setPadding(0, (i7 + i11) - i13, 0, (i10 + i12) - i14);
    }

    public final si.f a(View view) {
        si.f fVar = new si.f(this.f56663k);
        si.g gVar = new si.g(g0.L(32.0f));
        si.g gVar2 = new si.g(g0.L(56.0f));
        si.g gVar3 = new si.g(g0.L(48.0f));
        if (fVar.f57547y != 1) {
            fVar.f57547y = 1;
            fVar.f57545w = true;
            fVar.f57546x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f56656b;
        fVar.f57545w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = m6.r1(160 / 255.0f, cVar.f59037b);
        }
        fVar.f57545w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f57545w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f57545w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = m6.r1(210 / 255.0f, cVar2.f59037b);
        }
        fVar.f57546x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f57546x = true;
        fVar.invalidateSelf();
        this.f56655a.f56737c.add(new p(view, fVar));
        return fVar;
    }

    public final si.f b(View view) {
        si.f fVar = new si.f(this.f56663k);
        si.g gVar = new si.g(g0.L(28.0f));
        si.g gVar2 = new si.g(g0.L(40.0f));
        si.g gVar3 = new si.g(g0.L(30.0f));
        if (fVar.f57547y != 4) {
            fVar.f57547y = 4;
            fVar.f57545w = true;
            fVar.f57546x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f56656b;
        fVar.f57545w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = m6.r1(160 / 255.0f, cVar.f59037b);
        }
        fVar.f57545w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f57545w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f57545w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = m6.r1(210 / 255.0f, cVar2.f59037b);
        }
        fVar.f57546x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f57546x = true;
        fVar.invalidateSelf();
        this.f56655a.f56737c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, ek0 ek0Var, View view, h6 h6Var) {
        this.f56665m = frameLayout;
        this.f56666n = ek0Var;
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f56667o = new di.f(9, ek0Var, frameLayout);
        this.f56655a.b(ek0Var);
        ek0Var.setClipToPadding(false);
        g(frameLayout, view, h6Var);
    }

    public final void g(FrameLayout frameLayout, View view, h6 h6Var) {
        if (view != null) {
            g0.E2(view);
            frameLayout.addView(view, ma.e(-1, -2, 48));
            boolean z10 = view instanceof z4;
            dh.c cVar = this.f56657c;
            if (z10) {
                z4 z4Var = (z4) view;
                z4Var.setExtraHeight(g0.L(6.0f));
                gh.e m10 = i0.m(h6Var);
                z4Var.M = cVar;
                z4Var.N = m10;
                z4Var.r();
                z4Var.f30338o0 = this.d;
                z4Var.f30339p0 = this.f56658e;
            } else if (view instanceof org.telegram.ui.ActionBar.k) {
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
                kVar.setAddToContainer(false);
                kVar.setCenterTitleAndGlass(true);
                kVar.setExtraHeight(g0.L(6.0f));
                kVar.U0 = true;
                kVar.P(cVar, i0.m(h6Var), false);
            }
        }
    }
}
