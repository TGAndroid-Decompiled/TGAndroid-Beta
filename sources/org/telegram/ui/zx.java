package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zx implements org.telegram.ui.Components.io0, org.telegram.ui.Components.pl0, ci.bc, org.telegram.ui.Components.d20 {
    public final ty f40604a;

    public zx(ty tyVar) {
        this.f40604a = tyVar;
    }

    @Override
    public ci.fc a(long j3) {
        ai.a0 a0Var;
        hx hxVar = this.f40604a.E0;
        if (hxVar != null) {
            a0Var = hxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.fc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        ty tyVar = this.f40604a;
        if (tyVar.E0 != null) {
            tyVar.G4(false, true);
            tyVar.Q = true;
            tyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != tyVar.getUserConfig().getClientUserId()) {
                tyVar.E0.k(j3);
            } else {
                tyVar.E0.S.h1(0, 0);
            }
            tyVar.f37976e0[0].f37593a.getViewTreeObserver().addOnPreDrawListener(new em(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        ty tyVar = this.f40604a;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f20446n0) {
                tyVar.W4(i6Var.getDialogId(), view);
                return true;
            }
        }
        ay ayVar = tyVar.C0;
        ai.w0 w0Var = ayVar.W;
        return tyVar.x4(view, i10, f7, ayVar.f26496c0);
    }

    public void d(gg.q0 q0Var) {
        ty tyVar = this.f40604a;
        if (!tyVar.f38032p3) {
            return;
        }
        ay ayVar = tyVar.C0;
        if (ayVar != null) {
            ayVar.B0.remove(q0Var);
            ay ayVar2 = tyVar.C0;
            String obj = tyVar.f38002j0.getSearchField().getText().toString();
            View currentView = ayVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !ayVar2.f26499f0;
            if (!TextUtils.isEmpty(ayVar2.L0)) {
                z10 = z11;
            }
            ayVar2.L0 = obj;
            ayVar2.P(currentView, ayVar2.getCurrentPosition(), obj, z10);
        }
        tyVar.f5(true, null, null, false, true);
        tyVar.Y.f47144a.q(tyVar.X.f23850r);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40604a.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f40604a.Q4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40604a.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40604a.finishPreviewFragment();
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40604a.movePreviewFragment(f7);
        }
    }
}
