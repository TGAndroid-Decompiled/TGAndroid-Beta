package pi;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.cd;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.tj0;
public final class a {
    public final q f53523a;
    public final si.c f53524b;
    public final eh.c f53525c;
    public final eh.c d;
    public final si.d f53526e;
    public final eh.c f53527f;
    public final d f53528g;
    public final si.f h;
    public final si.f f53529i;
    public Runnable f53530j;
    public final si.a f53531k;
    public FrameLayout f53532l;
    public ViewGroup f53533m;
    public fh.a f53534n;

    public a(q qVar, org.telegram.ui.ActionBar.n nVar) {
        this.f53523a = qVar;
        qVar.f53602a = new e3(this, 7);
        qVar.d = new ri.b(g0.L(48.0f));
        si.c cVar = new si.c();
        this.f53524b = cVar;
        cVar.a(nVar.e());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31) {
            d dVar = new d();
            this.f53528g = dVar;
            si.f fVar = new si.f(cVar);
            fVar.f54756f = cVar;
            fVar.h = dVar.d(2);
            this.h = fVar;
            si.f fVar2 = new si.f(cVar);
            this.f53529i = fVar2;
            fVar2.f54756f = cVar;
            fVar2.h = dVar.d(3);
            eh.c cVar2 = new eh.c(fVar, fVar2, cVar);
            this.f53525c = cVar2;
            cVar2.f9987j = qVar;
            cVar2.f9988k = true;
            si.d dVar2 = new si.d(fVar, fVar2);
            this.f53526e = dVar2;
            eh.c cVar3 = new eh.c(fVar2, fVar2, cVar);
            this.f53527f = cVar3;
            cVar3.f9987j = qVar;
            eh.c cVar4 = new eh.c(dVar2, fVar2, cVar);
            this.d = cVar4;
            cVar4.f9987j = qVar;
            cVar4.f9988k = true;
            this.f53531k = dVar.d(1);
            return;
        }
        this.f53531k = si.e.f54751a;
        this.f53528g = null;
        this.h = null;
        this.f53529i = null;
        eh.c cVar5 = new eh.c(cVar, cVar, cVar);
        this.f53525c = cVar5;
        cVar5.f9987j = qVar;
        this.f53526e = null;
        this.d = cVar5;
        this.f53527f = cVar5;
    }

    public static int c(int i3) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i3);
    }

    public static int d(int i3) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i3 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i3, int i10, int i11, int i12) {
        int i13 = -c(i3);
        int i14 = -c(i10);
        g0.B3(viewGroup, 0, i13, 0, i14);
        viewGroup.setPadding(0, (i3 + i11) - i13, 0, (i10 + i12) - i14);
    }

    public final qi.f a(View view) {
        qi.f fVar = new qi.f(this.f53531k);
        qi.g gVar = new qi.g(g0.L(32.0f));
        qi.g gVar2 = new qi.g(g0.L(56.0f));
        qi.g gVar3 = new qi.g(g0.L(48.0f));
        if (fVar.f53979y != 1) {
            fVar.f53979y = 1;
            fVar.f53977w = true;
            fVar.f53978x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f53524b;
        fVar.f53977w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        si.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = k6.r1(160 / 255.0f, cVar.f54747b);
        }
        fVar.f53977w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f53977w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f53977w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        si.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = k6.r1(210 / 255.0f, cVar2.f54747b);
        }
        fVar.f53978x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f53978x = true;
        fVar.invalidateSelf();
        this.f53523a.f53604c.add(new p(view, fVar));
        return fVar;
    }

    public final qi.f b(View view) {
        qi.f fVar = new qi.f(this.f53531k);
        qi.g gVar = new qi.g(g0.L(28.0f));
        qi.g gVar2 = new qi.g(g0.L(40.0f));
        qi.g gVar3 = new qi.g(g0.L(30.0f));
        if (fVar.f53979y != 4) {
            fVar.f53979y = 4;
            fVar.f53977w = true;
            fVar.f53978x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f53524b;
        fVar.f53977w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        si.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = k6.r1(160 / 255.0f, cVar.f54747b);
        }
        fVar.f53977w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f53977w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f53977w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        si.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = k6.r1(210 / 255.0f, cVar2.f54747b);
        }
        fVar.f53978x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f53978x = true;
        fVar.invalidateSelf();
        this.f53523a.f53604c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, tj0 tj0Var, View view, e6 e6Var) {
        this.f53532l = frameLayout;
        this.f53533m = tj0Var;
        tj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f53534n = new ci.g(9, tj0Var, frameLayout);
        this.f53523a.b(tj0Var);
        tj0Var.setClipToPadding(false);
        g(frameLayout, view, e6Var);
    }

    public final void g(FrameLayout frameLayout, View view, e6 e6Var) {
        if (view != null) {
            g0.E2(view);
            frameLayout.addView(view, mf.e(-1, -2, 48));
            boolean z10 = view instanceof y4;
            eh.c cVar = this.f53525c;
            if (z10) {
                y4 y4Var = (y4) view;
                y4Var.setExtraHeight(g0.L(6.0f));
                hh.e m10 = cd.m(e6Var);
                y4Var.M = cVar;
                y4Var.N = m10;
                y4Var.m();
                y4Var.f28869o0 = this.d;
                y4Var.f28870p0 = this.f53526e;
            } else if (view instanceof org.telegram.ui.ActionBar.k) {
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
                kVar.setAddToContainer(false);
                kVar.setCenterTitleAndGlass(true);
                kVar.setExtraHeight(g0.L(6.0f));
                kVar.U0 = true;
                kVar.M(cVar, cd.m(e6Var), false);
            }
        }
    }
}
