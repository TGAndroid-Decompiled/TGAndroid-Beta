package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class xx implements ah.j, org.telegram.ui.Components.bp0, org.telegram.ui.Components.jm0, ci.cc, org.telegram.ui.Components.s20 {
    public final int f44197a;
    public final sy f44198b;

    public xx(sy syVar, int i10) {
        this.f44197a = i10;
        this.f44198b = syVar;
    }

    @Override
    public void B0(ah.a aVar) {
        eg1 eg1Var;
        eg1 eg1Var2;
        switch (this.f44197a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.f20786d6;
                sy syVar = this.f44198b;
                aVar.a(syVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    mx mxVar = syVar.F3;
                    if (mxVar != null && (mxVar.getFragment() instanceof eg1)) {
                        eg1Var = (eg1) syVar.F3.getFragment();
                    } else {
                        eg1Var = null;
                    }
                    if (eg1Var != null && eg1Var.getFragmentView() != null && !syVar.f41935j2) {
                        aVar.f536a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.f20786d6;
                sy syVar2 = this.f44198b;
                aVar.a(syVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    mx mxVar2 = syVar2.F3;
                    if (mxVar2 != null && (mxVar2.getFragment() instanceof eg1)) {
                        eg1Var2 = (eg1) syVar2.F3.getFragment();
                    } else {
                        eg1Var2 = null;
                    }
                    if (eg1Var2 != null && eg1Var2.getFragmentView() != null && !syVar2.f41935j2) {
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
        jx jxVar = this.f44198b.E0;
        if (jxVar != null) {
            a0Var = jxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.gc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        sy syVar = this.f44198b;
        if (syVar.E0 != null) {
            syVar.u4(false, true);
            syVar.Q = true;
            syVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != syVar.getUserConfig().getClientUserId()) {
                syVar.E0.k(j3);
            } else {
                syVar.E0.S.h1(0, 0);
            }
            syVar.f41907e0[0].f41530a.getViewTreeObserver().addOnPreDrawListener(new gm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        sy syVar = this.f44198b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f22249n0) {
                syVar.K4(i6Var.getDialogId(), view);
                return true;
            }
        }
        cy cyVar = syVar.C0;
        ai.w0 w0Var = cyVar.V;
        return syVar.l4(view, i10, f7, cyVar.f26437b0);
    }

    public void d(gg.p0 p0Var) {
        sy syVar = this.f44198b;
        if (!syVar.f41963p3) {
            return;
        }
        cy cyVar = syVar.C0;
        if (cyVar != null) {
            cyVar.A0.remove(p0Var);
            cy cyVar2 = syVar.C0;
            String obj = syVar.f41933j0.getSearchField().getText().toString();
            View currentView = cyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !cyVar2.f26440e0;
            if (!TextUtils.isEmpty(cyVar2.K0)) {
                z10 = z11;
            }
            cyVar2.K0 = obj;
            cyVar2.O(currentView, cyVar2.getCurrentPosition(), obj, z10);
        }
        syVar.T4(true, null, null, false, true);
        syVar.Y.f52244a.q(syVar.X.f30964r);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44198b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f44198b.E4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44198b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44198b.finishPreviewFragment();
        }
    }

    @Override
    public void l(Canvas canvas) {
        eg1 eg1Var;
        fh.d dVar;
        eg1 eg1Var2;
        fh.d dVar2;
        switch (this.f44197a) {
            case 0:
                sy syVar = this.f44198b;
                int measuredWidth = syVar.fragmentView.getMeasuredWidth();
                int measuredHeight = syVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(syVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                if (SharedConfig.chatBlurEnabled()) {
                    mx mxVar = syVar.F3;
                    if (mxVar != null && (mxVar.getFragment() instanceof eg1)) {
                        eg1Var = (eg1) syVar.F3.getFragment();
                    } else {
                        eg1Var = null;
                    }
                    if (eg1Var != null && eg1Var.getFragmentView() != null && !syVar.f41935j2 && (dVar = eg1Var.f37329g1) != null) {
                        canvas.save();
                        canvas.translate(eg1Var.getFragmentView().getTranslationX(), eg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    syVar.f41941k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                sy syVar2 = this.f44198b;
                int measuredWidth2 = syVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = syVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(syVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                if (SharedConfig.chatBlurEnabled()) {
                    mx mxVar2 = syVar2.F3;
                    if (mxVar2 != null && (mxVar2.getFragment() instanceof eg1)) {
                        eg1Var2 = (eg1) syVar2.F3.getFragment();
                    } else {
                        eg1Var2 = null;
                    }
                    if (eg1Var2 != null && eg1Var2.getFragmentView() != null && !syVar2.f41935j2 && (dVar2 = eg1Var2.f37331h1) != null) {
                        canvas.save();
                        canvas.translate(eg1Var2.getFragmentView().getTranslationX(), eg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    syVar2.f41941k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f44198b.movePreviewFragment(f7);
        }
    }
}
