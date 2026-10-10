package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yx implements ah.j, org.telegram.ui.Components.ap0, org.telegram.ui.Components.im0, ci.cc, org.telegram.ui.Components.s20 {
    public final int f44468a;
    public final ty f44469b;

    public yx(ty tyVar, int i10) {
        this.f44468a = i10;
        this.f44469b = tyVar;
    }

    @Override
    public void B0(ah.a aVar) {
        fg1 fg1Var;
        fg1 fg1Var2;
        switch (this.f44468a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.i6.f20801d6;
                ty tyVar = this.f44469b;
                aVar.a(tyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar = tyVar.F3;
                    if (nxVar != null && (nxVar.getFragment() instanceof fg1)) {
                        fg1Var = (fg1) tyVar.F3.getFragment();
                    } else {
                        fg1Var = null;
                    }
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !tyVar.f42246j2) {
                        aVar.f536a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.i6.f20801d6;
                ty tyVar2 = this.f44469b;
                aVar.a(tyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar2 = tyVar2.F3;
                    if (nxVar2 != null && (nxVar2.getFragment() instanceof fg1)) {
                        fg1Var2 = (fg1) tyVar2.F3.getFragment();
                    } else {
                        fg1Var2 = null;
                    }
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !tyVar2.f42246j2) {
                        aVar.f536a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public ci.gc a(long j3) {
        ai.a0 a0Var;
        kx kxVar = this.f44469b.E0;
        if (kxVar != null) {
            a0Var = kxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.gc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        ty tyVar = this.f44469b;
        if (tyVar.E0 != null) {
            tyVar.u4(false, true);
            tyVar.Q = true;
            tyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != tyVar.getUserConfig().getClientUserId()) {
                tyVar.E0.k(j3);
            } else {
                tyVar.E0.S.h1(0, 0);
            }
            tyVar.f42218e0[0].f41834a.getViewTreeObserver().addOnPreDrawListener(new gm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        ty tyVar = this.f44469b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f22261n0) {
                tyVar.K4(i6Var.getDialogId(), view);
                return true;
            }
        }
        dy dyVar = tyVar.C0;
        ai.w0 w0Var = dyVar.V;
        return tyVar.l4(view, i10, f7, dyVar.f26127b0);
    }

    public void d(gg.p0 p0Var) {
        ty tyVar = this.f44469b;
        if (!tyVar.f42274p3) {
            return;
        }
        dy dyVar = tyVar.C0;
        if (dyVar != null) {
            dyVar.A0.remove(p0Var);
            dy dyVar2 = tyVar.C0;
            String obj = tyVar.f42244j0.getSearchField().getText().toString();
            View currentView = dyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !dyVar2.f26130e0;
            if (!TextUtils.isEmpty(dyVar2.K0)) {
                z10 = z11;
            }
            dyVar2.K0 = obj;
            dyVar2.O(currentView, dyVar2.getCurrentPosition(), obj, z10);
        }
        tyVar.T4(true, null, null, false, true);
        tyVar.Y.f52201a.q(tyVar.X.f30958r);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44469b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f44469b.E4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44469b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44469b.finishPreviewFragment();
        }
    }

    @Override
    public void l(Canvas canvas) {
        fg1 fg1Var;
        fh.d dVar;
        fg1 fg1Var2;
        fh.d dVar2;
        switch (this.f44468a) {
            case 0:
                ty tyVar = this.f44469b;
                int measuredWidth = tyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = tyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar = tyVar.F3;
                    if (nxVar != null && (nxVar.getFragment() instanceof fg1)) {
                        fg1Var = (fg1) tyVar.F3.getFragment();
                    } else {
                        fg1Var = null;
                    }
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !tyVar.f42246j2 && (dVar = fg1Var.f37620g1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var.getFragmentView().getTranslationX(), fg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    tyVar.f42252k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                ty tyVar2 = this.f44469b;
                int measuredWidth2 = tyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = tyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(tyVar2.getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar2 = tyVar2.F3;
                    if (nxVar2 != null && (nxVar2.getFragment() instanceof fg1)) {
                        fg1Var2 = (fg1) tyVar2.F3.getFragment();
                    } else {
                        fg1Var2 = null;
                    }
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !tyVar2.f42246j2 && (dVar2 = fg1Var2.f37622h1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var2.getFragmentView().getTranslationX(), fg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    tyVar2.f42252k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44469b.movePreviewFragment(f7);
        }
    }
}
