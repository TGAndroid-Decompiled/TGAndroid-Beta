package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class tx implements ng.g, org.telegram.ui.Components.zn0, org.telegram.ui.Components.ll0, ph.u9, org.telegram.ui.Components.b20 {
    public final int f38771a;
    public final oy f38772b;

    public tx(oy oyVar, int i10) {
        this.f38771a = i10;
        this.f38772b = oyVar;
    }

    @Override
    public void Y(g.x xVar) {
        kf1 kf1Var;
        kf1 kf1Var2;
        switch (this.f38771a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
                oy oyVar = this.f38772b;
                xVar.a(oyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar = oyVar.C3;
                    if (jxVar != null && (jxVar.getFragment() instanceof kf1)) {
                        kf1Var = (kf1) oyVar.C3.getFragment();
                    } else {
                        kf1Var = null;
                    }
                    if (kf1Var != null && kf1Var.getFragmentView() != null && !oyVar.f37037g2) {
                        xVar.f6327b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
                oy oyVar2 = this.f38772b;
                xVar.a(oyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar2 = oyVar2.C3;
                    if (jxVar2 != null && (jxVar2.getFragment() instanceof kf1)) {
                        kf1Var2 = (kf1) oyVar2.C3.getFragment();
                    } else {
                        kf1Var2 = null;
                    }
                    if (kf1Var2 != null && kf1Var2.getFragmentView() != null && !oyVar2.f37037g2) {
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
        gx gxVar = this.f38772b.B0;
        if (gxVar != null) {
            pVar = gxVar.e(j10);
        } else {
            pVar = null;
        }
        return ph.y9.c(pVar);
    }

    @Override
    public void b(long j10, gg.y1 y1Var) {
        oy oyVar = this.f38772b;
        if (oyVar.B0 != null) {
            oyVar.x4(false, true);
            oyVar.N = true;
            oyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != oyVar.getUserConfig().getClientUserId()) {
                oyVar.B0.k(j10);
            } else {
                oyVar.B0.P.h1(0, 0);
            }
            oyVar.f37009b0[0].f36741a.getViewTreeObserver().addOnPreDrawListener(new hh.f(2, this, y1Var));
            return;
        }
        y1Var.run();
    }

    @Override
    public boolean mo18c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.h6;
        oy oyVar = this.f38772b;
        if (z4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f21147k0) {
                oyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        xx xxVar = oyVar.f37129z0;
        lh.e1 e1Var = xxVar.S;
        return oyVar.o4(view, i10, f10, xxVar.V);
    }

    public void d(tf.e0 e0Var) {
        oy oyVar = this.f38772b;
        if (!oyVar.f37066m3) {
            return;
        }
        xx xxVar = oyVar.f37129z0;
        if (xxVar != null) {
            xxVar.f24339x0.remove(e0Var);
            xx xxVar2 = oyVar.f37129z0;
            String obj = oyVar.f37035g0.getSearchField().getText().toString();
            View currentView = xxVar2.getCurrentView();
            boolean z4 = true;
            boolean z10 = !xxVar2.f24318b0;
            if (!TextUtils.isEmpty(xxVar2.H0)) {
                z4 = z10;
            }
            xxVar2.H0 = obj;
            xxVar2.O(currentView, xxVar2.getCurrentPosition(), obj, z4);
        }
        oyVar.W4(true, null, null, false, true);
        oyVar.V.f12043a.q(oyVar.U.f23815r);
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38772b.movePreviewFragment(f10);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f38772b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38772b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38772b.finishPreviewFragment();
        }
    }

    @Override
    public void k(Canvas canvas) {
        kf1 kf1Var;
        sg.d dVar;
        kf1 kf1Var2;
        sg.d dVar2;
        switch (this.f38771a) {
            case 0:
                oy oyVar = this.f38772b;
                int measuredWidth = oyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = oyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar = oyVar.C3;
                    if (jxVar != null && (jxVar.getFragment() instanceof kf1)) {
                        kf1Var = (kf1) oyVar.C3.getFragment();
                    } else {
                        kf1Var = null;
                    }
                    if (kf1Var != null && kf1Var.getFragmentView() != null && !oyVar.f37037g2 && (dVar = kf1Var.f35678d1) != null) {
                        canvas.save();
                        canvas.translate(kf1Var.getFragmentView().getTranslationX(), kf1Var.getFragmentView().getTranslationY());
                        dVar.X(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    oyVar.f37049i4.b(canvas, -3);
                    return;
                }
                return;
            default:
                oy oyVar2 = this.f38772b;
                int measuredWidth2 = oyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = oyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(oyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar2 = oyVar2.C3;
                    if (jxVar2 != null && (jxVar2.getFragment() instanceof kf1)) {
                        kf1Var2 = (kf1) oyVar2.C3.getFragment();
                    } else {
                        kf1Var2 = null;
                    }
                    if (kf1Var2 != null && kf1Var2.getFragmentView() != null && !oyVar2.f37037g2 && (dVar2 = kf1Var2.f35680e1) != null) {
                        canvas.save();
                        canvas.translate(kf1Var2.getFragmentView().getTranslationX(), kf1Var2.getFragmentView().getTranslationY());
                        dVar2.X(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    oyVar2.f37049i4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38772b.movePreviewFragment(f10);
        }
    }
}
