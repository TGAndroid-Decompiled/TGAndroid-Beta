package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ux implements og.g, org.telegram.ui.Components.ao0, org.telegram.ui.Components.ml0, qh.s9, org.telegram.ui.Components.c20 {
    public final int f42058a;
    public final py f42059b;

    public ux(py pyVar, int i10) {
        this.f42058a = i10;
        this.f42059b = pyVar;
    }

    @Override
    public void P(g.x xVar) {
        mf1 mf1Var;
        mf1 mf1Var2;
        switch (this.f42058a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
                py pyVar = this.f42059b;
                xVar.a(pyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = pyVar.C3;
                    if (kxVar != null && (kxVar.getFragment() instanceof mf1)) {
                        mf1Var = (mf1) pyVar.C3.getFragment();
                    } else {
                        mf1Var = null;
                    }
                    if (mf1Var != null && mf1Var.getFragmentView() != null && !pyVar.f40214g2) {
                        xVar.f6800b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
                py pyVar2 = this.f42059b;
                xVar.a(pyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = pyVar2.C3;
                    if (kxVar2 != null && (kxVar2.getFragment() instanceof mf1)) {
                        mf1Var2 = (mf1) pyVar2.C3.getFragment();
                    } else {
                        mf1Var2 = null;
                    }
                    if (mf1Var2 != null && mf1Var2.getFragmentView() != null && !pyVar2.f40214g2) {
                        xVar.f6800b = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public qh.x9 a(long j10) {
        oh.o oVar;
        hx hxVar = this.f42059b.B0;
        if (hxVar != null) {
            oVar = hxVar.e(j10);
        } else {
            oVar = null;
        }
        return qh.x9.c(oVar);
    }

    @Override
    public void b(long j10, hg.y1 y1Var) {
        py pyVar = this.f42059b;
        if (pyVar.B0 != null) {
            pyVar.x4(false, true);
            pyVar.N = true;
            pyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != pyVar.getUserConfig().getClientUserId()) {
                pyVar.B0.k(j10);
            } else {
                pyVar.B0.P.h1(0, 0);
            }
            pyVar.f40185b0[0].f39866a.getViewTreeObserver().addOnPreDrawListener(new ih.f(2, this, y1Var));
            return;
        }
        y1Var.run();
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.h6;
        py pyVar = this.f42059b;
        if (z4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f22902k0) {
                pyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        yx yxVar = pyVar.f40306z0;
        mh.d1 d1Var = yxVar.S;
        return pyVar.o4(view, i10, f10, yxVar.V);
    }

    public void d(uf.e0 e0Var) {
        py pyVar = this.f42059b;
        if (!pyVar.f40243m3) {
            return;
        }
        yx yxVar = pyVar.f40306z0;
        if (yxVar != null) {
            yxVar.f26619x0.remove(e0Var);
            yx yxVar2 = pyVar.f40306z0;
            String obj = pyVar.f40212g0.getSearchField().getText().toString();
            View currentView = yxVar2.getCurrentView();
            boolean z4 = true;
            boolean z10 = !yxVar2.f26598b0;
            if (!TextUtils.isEmpty(yxVar2.H0)) {
                z4 = z10;
            }
            yxVar2.H0 = obj;
            yxVar2.O(currentView, yxVar2.getCurrentPosition(), obj, z4);
        }
        pyVar.W4(true, null, null, false, true);
        pyVar.V.f12493a.q(pyVar.U.f26172r);
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f42059b.movePreviewFragment(f10);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f42059b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f42059b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f42059b.finishPreviewFragment();
        }
    }

    @Override
    public void i(Canvas canvas) {
        mf1 mf1Var;
        tg.d dVar;
        mf1 mf1Var2;
        tg.d dVar2;
        switch (this.f42058a) {
            case 0:
                py pyVar = this.f42059b;
                int measuredWidth = pyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = pyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = pyVar.C3;
                    if (kxVar != null && (kxVar.getFragment() instanceof mf1)) {
                        mf1Var = (mf1) pyVar.C3.getFragment();
                    } else {
                        mf1Var = null;
                    }
                    if (mf1Var != null && mf1Var.getFragmentView() != null && !pyVar.f40214g2 && (dVar = mf1Var.f39112d1) != null) {
                        canvas.save();
                        canvas.translate(mf1Var.getFragmentView().getTranslationX(), mf1Var.getFragmentView().getTranslationY());
                        dVar.I(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    pyVar.f40226i4.b(canvas, -3);
                    return;
                }
                return;
            default:
                py pyVar2 = this.f42059b;
                int measuredWidth2 = pyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = pyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(pyVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = pyVar2.C3;
                    if (kxVar2 != null && (kxVar2.getFragment() instanceof mf1)) {
                        mf1Var2 = (mf1) pyVar2.C3.getFragment();
                    } else {
                        mf1Var2 = null;
                    }
                    if (mf1Var2 != null && mf1Var2.getFragmentView() != null && !pyVar2.f40214g2 && (dVar2 = mf1Var2.f39115e1) != null) {
                        canvas.save();
                        canvas.translate(mf1Var2.getFragmentView().getTranslationX(), mf1Var2.getFragmentView().getTranslationY());
                        dVar2.I(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    pyVar2.f40226i4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f42059b.movePreviewFragment(f10);
        }
    }
}
