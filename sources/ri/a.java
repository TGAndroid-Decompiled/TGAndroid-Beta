package ri;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.i0;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
public final class a {
    public final q f56614a;
    public final ui.c f56615b;
    public final dh.c f56616c;
    public final dh.c d;
    public final ui.d f56617e;
    public final dh.c f56618f;
    public final d f56619g;
    public final ui.f h;
    public final ui.f f56620i;
    public Runnable f56621j;
    public final ui.a f56622k;
    public boolean f56623l;
    public FrameLayout f56624m;
    public ViewGroup f56625n;
    public eh.a f56626o;

    public a(q qVar, n nVar) {
        this.f56614a = qVar;
        qVar.f56694a = new org.telegram.ui.ActionBar.p(this, 20);
        qVar.d = new ti.b(g0.L(48.0f));
        ui.c cVar = new ui.c();
        this.f56615b = cVar;
        cVar.a(nVar.e());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31) {
            d dVar = new d();
            this.f56619g = dVar;
            ui.f fVar = new ui.f(cVar);
            fVar.f59007f = cVar;
            fVar.h = dVar.d(2);
            this.h = fVar;
            ui.f fVar2 = new ui.f(cVar);
            this.f56620i = fVar2;
            fVar2.f59007f = cVar;
            fVar2.h = dVar.d(3);
            dh.c cVar2 = new dh.c(fVar, fVar2, cVar);
            this.f56616c = cVar2;
            cVar2.f8381j = qVar;
            cVar2.f8382k = true;
            ui.d dVar2 = new ui.d(fVar, fVar2);
            this.f56617e = dVar2;
            dh.c cVar3 = new dh.c(fVar2, fVar2, cVar);
            this.f56618f = cVar3;
            cVar3.f8381j = qVar;
            dh.c cVar4 = new dh.c(dVar2, fVar2, cVar);
            this.d = cVar4;
            cVar4.f8381j = qVar;
            cVar4.f8382k = true;
            this.f56622k = dVar.d(1);
            return;
        }
        this.f56622k = ui.e.f59002a;
        this.f56619g = null;
        this.h = null;
        this.f56620i = null;
        dh.c cVar5 = new dh.c(cVar, cVar, cVar);
        this.f56616c = cVar5;
        cVar5.f8381j = qVar;
        this.f56617e = null;
        this.d = cVar5;
        this.f56618f = cVar5;
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
        si.f fVar = new si.f(this.f56622k);
        si.g gVar = new si.g(g0.L(32.0f));
        si.g gVar2 = new si.g(g0.L(56.0f));
        si.g gVar3 = new si.g(g0.L(48.0f));
        if (fVar.f57508y != 1) {
            fVar.f57508y = 1;
            fVar.f57506w = true;
            fVar.f57507x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f56615b;
        fVar.f57506w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = n6.r1(160 / 255.0f, cVar.f58998b);
        }
        fVar.f57506w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f57506w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f57506w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = n6.r1(210 / 255.0f, cVar2.f58998b);
        }
        fVar.f57507x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f57507x = true;
        fVar.invalidateSelf();
        this.f56614a.f56696c.add(new p(view, fVar));
        return fVar;
    }

    public final si.f b(View view) {
        si.f fVar = new si.f(this.f56622k);
        si.g gVar = new si.g(g0.L(28.0f));
        si.g gVar2 = new si.g(g0.L(40.0f));
        si.g gVar3 = new si.g(g0.L(30.0f));
        if (fVar.f57508y != 4) {
            fVar.f57508y = 4;
            fVar.f57506w = true;
            fVar.f57507x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f56615b;
        fVar.f57506w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = n6.r1(160 / 255.0f, cVar.f58998b);
        }
        fVar.f57506w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f57506w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f57506w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = n6.r1(210 / 255.0f, cVar2.f58998b);
        }
        fVar.f57507x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f57507x = true;
        fVar.invalidateSelf();
        this.f56614a.f56696c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, ck0 ck0Var, View view, i6 i6Var) {
        this.f56624m = frameLayout;
        this.f56625n = ck0Var;
        ck0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f56626o = new di.f(9, ck0Var, frameLayout);
        this.f56614a.b(ck0Var);
        ck0Var.setClipToPadding(false);
        g(frameLayout, view, i6Var);
    }

    public final void g(FrameLayout frameLayout, View view, i6 i6Var) {
        if (view != null) {
            g0.E2(view);
            frameLayout.addView(view, ma.e(-1, -2, 48));
            boolean z10 = view instanceof a5;
            dh.c cVar = this.f56616c;
            if (z10) {
                a5 a5Var = (a5) view;
                a5Var.setExtraHeight(g0.L(6.0f));
                gh.e m10 = i0.m(i6Var);
                a5Var.M = cVar;
                a5Var.N = m10;
                a5Var.r();
                a5Var.f28779o0 = this.d;
                a5Var.f28780p0 = this.f56617e;
            } else if (view instanceof org.telegram.ui.ActionBar.k) {
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
                kVar.setAddToContainer(false);
                kVar.setCenterTitleAndGlass(true);
                kVar.setExtraHeight(g0.L(6.0f));
                kVar.U0 = true;
                kVar.Q(cVar, i0.m(i6Var), false);
            }
        }
    }
}
