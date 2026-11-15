package ri;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.uj0;
public final class a {
    public final q f56040a;
    public final ui.c f56041b;
    public final dh.c f56042c;
    public final dh.c d;
    public final ui.d f56043e;
    public final dh.c f56044f;
    public final d f56045g;
    public final ui.f h;
    public final ui.f f56046i;
    public Runnable f56047j;
    public final ui.a f56048k;
    public boolean f56049l;
    public FrameLayout f56050m;
    public ViewGroup f56051n;
    public eh.a f56052o;

    public a(q qVar, n nVar) {
        this.f56040a = qVar;
        qVar.f56120a = new z(this, 19);
        qVar.d = new ti.b(g0.L(48.0f));
        ui.c cVar = new ui.c();
        this.f56041b = cVar;
        cVar.a(nVar.e());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31) {
            d dVar = new d();
            this.f56045g = dVar;
            ui.f fVar = new ui.f(cVar);
            fVar.f58440f = cVar;
            fVar.h = dVar.d(2);
            this.h = fVar;
            ui.f fVar2 = new ui.f(cVar);
            this.f56046i = fVar2;
            fVar2.f58440f = cVar;
            fVar2.h = dVar.d(3);
            dh.c cVar2 = new dh.c(fVar, fVar2, cVar);
            this.f56042c = cVar2;
            cVar2.f8096j = qVar;
            cVar2.f8097k = true;
            ui.d dVar2 = new ui.d(fVar, fVar2);
            this.f56043e = dVar2;
            dh.c cVar3 = new dh.c(fVar2, fVar2, cVar);
            this.f56044f = cVar3;
            cVar3.f8096j = qVar;
            dh.c cVar4 = new dh.c(dVar2, fVar2, cVar);
            this.d = cVar4;
            cVar4.f8096j = qVar;
            cVar4.f8097k = true;
            this.f56048k = dVar.d(1);
            return;
        }
        this.f56048k = ui.e.f58435a;
        this.f56045g = null;
        this.h = null;
        this.f56046i = null;
        dh.c cVar5 = new dh.c(cVar, cVar, cVar);
        this.f56042c = cVar5;
        cVar5.f8096j = qVar;
        this.f56043e = null;
        this.d = cVar5;
        this.f56044f = cVar5;
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
        g0.A3(viewGroup, 0, i13, 0, i14);
        viewGroup.setPadding(0, (i7 + i11) - i13, 0, (i10 + i12) - i14);
    }

    public final si.f a(View view) {
        si.f fVar = new si.f(this.f56048k);
        si.g gVar = new si.g(g0.L(32.0f));
        si.g gVar2 = new si.g(g0.L(56.0f));
        si.g gVar3 = new si.g(g0.L(48.0f));
        if (fVar.f56932y != 1) {
            fVar.f56932y = 1;
            fVar.f56930w = true;
            fVar.f56931x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f56041b;
        fVar.f56930w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = j6.r1(160 / 255.0f, cVar.f58431b);
        }
        fVar.f56930w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f56930w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f56930w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = j6.r1(210 / 255.0f, cVar2.f58431b);
        }
        fVar.f56931x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f56931x = true;
        fVar.invalidateSelf();
        this.f56040a.f56122c.add(new p(view, fVar));
        return fVar;
    }

    public final si.f b(View view) {
        si.f fVar = new si.f(this.f56048k);
        si.g gVar = new si.g(g0.L(28.0f));
        si.g gVar2 = new si.g(g0.L(40.0f));
        si.g gVar3 = new si.g(g0.L(30.0f));
        if (fVar.f56932y != 4) {
            fVar.f56932y = 4;
            fVar.f56930w = true;
            fVar.f56931x = true;
            fVar.invalidateSelf();
        }
        fVar.H = this.f56041b;
        fVar.f56930w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.J = 160;
        ui.c cVar = fVar.H;
        if (cVar != null) {
            fVar.I = j6.r1(160 / 255.0f, cVar.f58431b);
        }
        fVar.f56930w = true;
        fVar.invalidateSelf();
        fVar.E = gVar;
        fVar.f56930w = true;
        fVar.invalidateSelf();
        fVar.F = gVar2;
        fVar.f56930w = true;
        fVar.invalidateSelf();
        fVar.L = 210;
        ui.c cVar2 = fVar.H;
        if (cVar2 != null) {
            fVar.K = j6.r1(210 / 255.0f, cVar2.f58431b);
        }
        fVar.f56931x = true;
        fVar.invalidateSelf();
        fVar.G = gVar3;
        fVar.f56931x = true;
        fVar.invalidateSelf();
        this.f56040a.f56122c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, uj0 uj0Var, View view, e6 e6Var) {
        this.f56050m = frameLayout;
        this.f56051n = uj0Var;
        uj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f56052o = new di.f(9, uj0Var, frameLayout);
        this.f56040a.b(uj0Var);
        uj0Var.setClipToPadding(false);
        g(frameLayout, view, e6Var);
    }

    public final void g(FrameLayout frameLayout, View view, e6 e6Var) {
        if (view != null) {
            g0.E2(view);
            frameLayout.addView(view, ja.e(-1, -2, 48));
            boolean z10 = view instanceof w4;
            dh.c cVar = this.f56042c;
            if (z10) {
                w4 w4Var = (w4) view;
                w4Var.setExtraHeight(g0.L(6.0f));
                gh.e l10 = c8.g0.l(e6Var);
                w4Var.M = cVar;
                w4Var.N = l10;
                w4Var.p();
                w4Var.f29825o0 = this.d;
                w4Var.f29826p0 = this.f56043e;
            } else if (view instanceof org.telegram.ui.ActionBar.k) {
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
                kVar.setAddToContainer(false);
                kVar.setCenterTitleAndGlass(true);
                kVar.setExtraHeight(g0.L(6.0f));
                kVar.U0 = true;
                kVar.P(cVar, c8.g0.l(e6Var), false);
            }
        }
    }
}
