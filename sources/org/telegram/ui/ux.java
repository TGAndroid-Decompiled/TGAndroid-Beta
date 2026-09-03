package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ux implements og.g, org.telegram.ui.Components.zn0, org.telegram.ui.Components.ll0, qh.r9, org.telegram.ui.Components.c20 {
    public final int f41949a;
    public final py f41950b;

    public ux(py pyVar, int i10) {
        this.f41949a = i10;
        this.f41950b = pyVar;
    }

    @Override
    public void P(g.x xVar) {
        sf1 sf1Var;
        sf1 sf1Var2;
        switch (this.f41949a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
                py pyVar = this.f41950b;
                xVar.a(pyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = pyVar.C3;
                    if (kxVar != null && (kxVar.getFragment() instanceof sf1)) {
                        sf1Var = (sf1) pyVar.C3.getFragment();
                    } else {
                        sf1Var = null;
                    }
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !pyVar.f40184g2) {
                        xVar.f6800b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
                py pyVar2 = this.f41950b;
                xVar.a(pyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = pyVar2.C3;
                    if (kxVar2 != null && (kxVar2.getFragment() instanceof sf1)) {
                        sf1Var2 = (sf1) pyVar2.C3.getFragment();
                    } else {
                        sf1Var2 = null;
                    }
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !pyVar2.f40184g2) {
                        xVar.f6800b = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public qh.w9 a(long j10) {
        oh.o oVar;
        hx hxVar = this.f41950b.B0;
        if (hxVar != null) {
            oVar = hxVar.e(j10);
        } else {
            oVar = null;
        }
        return qh.w9.c(oVar);
    }

    @Override
    public void b(long j10, hg.y1 y1Var) {
        py pyVar = this.f41950b;
        if (pyVar.B0 != null) {
            pyVar.x4(false, true);
            pyVar.N = true;
            pyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != pyVar.getUserConfig().getClientUserId()) {
                pyVar.B0.k(j10);
            } else {
                pyVar.B0.P.h1(0, 0);
            }
            pyVar.f40155b0[0].f39822a.getViewTreeObserver().addOnPreDrawListener(new ih.f(2, this, y1Var));
            return;
        }
        y1Var.run();
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.h6;
        py pyVar = this.f41950b;
        if (z4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f22904k0) {
                pyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        yx yxVar = pyVar.f40276z0;
        mh.d1 d1Var = yxVar.S;
        return pyVar.o4(view, i10, f10, yxVar.V);
    }

    public void d(uf.e0 e0Var) {
        py pyVar = this.f41950b;
        if (!pyVar.f40213m3) {
            return;
        }
        yx yxVar = pyVar.f40276z0;
        if (yxVar != null) {
            yxVar.f26342x0.remove(e0Var);
            yx yxVar2 = pyVar.f40276z0;
            String obj = pyVar.f40182g0.getSearchField().getText().toString();
            View currentView = yxVar2.getCurrentView();
            boolean z4 = true;
            boolean z10 = !yxVar2.f26321b0;
            if (!TextUtils.isEmpty(yxVar2.H0)) {
                z4 = z10;
            }
            yxVar2.H0 = obj;
            yxVar2.O(currentView, yxVar2.getCurrentPosition(), obj, z4);
        }
        pyVar.W4(true, null, null, false, true);
        pyVar.V.f12493a.q(pyVar.U.f26132r);
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41950b.movePreviewFragment(f10);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f41950b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41950b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41950b.finishPreviewFragment();
        }
    }

    @Override
    public void i(Canvas canvas) {
        sf1 sf1Var;
        tg.d dVar;
        sf1 sf1Var2;
        tg.d dVar2;
        switch (this.f41949a) {
            case 0:
                py pyVar = this.f41950b;
                int measuredWidth = pyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = pyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = pyVar.C3;
                    if (kxVar != null && (kxVar.getFragment() instanceof sf1)) {
                        sf1Var = (sf1) pyVar.C3.getFragment();
                    } else {
                        sf1Var = null;
                    }
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !pyVar.f40184g2 && (dVar = sf1Var.f41198d1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var.getFragmentView().getTranslationX(), sf1Var.getFragmentView().getTranslationY());
                        dVar.I(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    pyVar.f40196i4.b(canvas, -3);
                    return;
                }
                return;
            default:
                py pyVar2 = this.f41950b;
                int measuredWidth2 = pyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = pyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(pyVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = pyVar2.C3;
                    if (kxVar2 != null && (kxVar2.getFragment() instanceof sf1)) {
                        sf1Var2 = (sf1) pyVar2.C3.getFragment();
                    } else {
                        sf1Var2 = null;
                    }
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !pyVar2.f40184g2 && (dVar2 = sf1Var2.f41201e1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var2.getFragmentView().getTranslationX(), sf1Var2.getFragmentView().getTranslationY());
                        dVar2.I(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    pyVar2.f40196i4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41950b.movePreviewFragment(f10);
        }
    }
}
