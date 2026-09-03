package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class vx implements ng.g, org.telegram.ui.Components.yn0, org.telegram.ui.Components.kl0, ph.u9, org.telegram.ui.Components.c20 {
    public final int f39215a;
    public final qy f39216b;

    public vx(qy qyVar, int i10) {
        this.f39215a = i10;
        this.f39216b = qyVar;
    }

    @Override
    public void D(Canvas canvas) {
        sf1 sf1Var;
        sg.d dVar;
        sf1 sf1Var2;
        sg.d dVar2;
        switch (this.f39215a) {
            case 0:
                qy qyVar = this.f39216b;
                int measuredWidth = qyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = qyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = qyVar.C3;
                    if (lxVar != null && (lxVar.getFragment() instanceof sf1)) {
                        sf1Var = (sf1) qyVar.C3.getFragment();
                    } else {
                        sf1Var = null;
                    }
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !qyVar.f37555g2 && (dVar = sf1Var.f38185d1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var.getFragmentView().getTranslationX(), sf1Var.getFragmentView().getTranslationY());
                        dVar.H(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    qyVar.f37567i4.b(canvas, -3);
                    return;
                }
                return;
            default:
                qy qyVar2 = this.f39216b;
                int measuredWidth2 = qyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = qyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = qyVar2.C3;
                    if (lxVar2 != null && (lxVar2.getFragment() instanceof sf1)) {
                        sf1Var2 = (sf1) qyVar2.C3.getFragment();
                    } else {
                        sf1Var2 = null;
                    }
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !qyVar2.f37555g2 && (dVar2 = sf1Var2.f38187e1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var2.getFragmentView().getTranslationX(), sf1Var2.getFragmentView().getTranslationY());
                        dVar2.H(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    qyVar2.f37567i4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void D1(g.x xVar) {
        sf1 sf1Var;
        sf1 sf1Var2;
        switch (this.f39215a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
                qy qyVar = this.f39216b;
                xVar.a(qyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = qyVar.C3;
                    if (lxVar != null && (lxVar.getFragment() instanceof sf1)) {
                        sf1Var = (sf1) qyVar.C3.getFragment();
                    } else {
                        sf1Var = null;
                    }
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !qyVar.f37555g2) {
                        xVar.f6327b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
                qy qyVar2 = this.f39216b;
                xVar.a(qyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = qyVar2.C3;
                    if (lxVar2 != null && (lxVar2.getFragment() instanceof sf1)) {
                        sf1Var2 = (sf1) qyVar2.C3.getFragment();
                    } else {
                        sf1Var2 = null;
                    }
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !qyVar2.f37555g2) {
                        xVar.f6327b = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public ph.y9 a(long j10) {
        nh.p pVar;
        ix ixVar = this.f39216b.B0;
        if (ixVar != null) {
            pVar = ixVar.e(j10);
        } else {
            pVar = null;
        }
        return ph.y9.c(pVar);
    }

    @Override
    public void b(long j10, gg.y1 y1Var) {
        qy qyVar = this.f39216b;
        if (qyVar.B0 != null) {
            qyVar.x4(false, true);
            qyVar.N = true;
            qyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != qyVar.getUserConfig().getClientUserId()) {
                qyVar.B0.k(j10);
            } else {
                qyVar.B0.P.h1(0, 0);
            }
            qyVar.f37527b0[0].f37246a.getViewTreeObserver().addOnPreDrawListener(new hh.f(2, this, y1Var));
            return;
        }
        y1Var.run();
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.g6;
        qy qyVar = this.f39216b;
        if (z4) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.f21072k0) {
                qyVar.N4(g6Var.getDialogId(), view);
                return true;
            }
        }
        zx zxVar = qyVar.f37647z0;
        lh.e1 e1Var = zxVar.S;
        return qyVar.o4(view, i10, f10, zxVar.V);
    }

    public void d(tf.e0 e0Var) {
        qy qyVar = this.f39216b;
        if (!qyVar.f37584m3) {
            return;
        }
        zx zxVar = qyVar.f37647z0;
        if (zxVar != null) {
            zxVar.f24005x0.remove(e0Var);
            zx zxVar2 = qyVar.f37647z0;
            String obj = qyVar.f37553g0.getSearchField().getText().toString();
            View currentView = zxVar2.getCurrentView();
            boolean z4 = true;
            boolean z10 = !zxVar2.f23984b0;
            if (!TextUtils.isEmpty(zxVar2.H0)) {
                z4 = z10;
            }
            zxVar2.H0 = obj;
            zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z4);
        }
        qyVar.W4(true, null, null, false, true);
        qyVar.V.f10485a.q(qyVar.U.f24117r);
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39216b.movePreviewFragment(f10);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.q2 q2Var) {
        this.f39216b.H4(q2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39216b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39216b.finishPreviewFragment();
        }
    }

    @Override
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39216b.movePreviewFragment(f10);
        }
    }
}
