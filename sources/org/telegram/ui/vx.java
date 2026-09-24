package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class vx implements ah.j, org.telegram.ui.Components.ho0, org.telegram.ui.Components.nl0, ci.cc, org.telegram.ui.Components.b20 {
    public final int f38829a;
    public final qy f38830b;

    public vx(qy qyVar, int i10) {
        this.f38829a = i10;
        this.f38830b = qyVar;
    }

    @Override
    public void U(ah.a aVar) {
        wf1 wf1Var;
        wf1 wf1Var2;
        switch (this.f38829a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.f19045d6;
                qy qyVar = this.f38830b;
                aVar.a(qyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = qyVar.F3;
                    if (kxVar != null && (kxVar.getFragment() instanceof wf1)) {
                        wf1Var = (wf1) qyVar.F3.getFragment();
                    } else {
                        wf1Var = null;
                    }
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !qyVar.f37049j2) {
                        aVar.f417a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.f19045d6;
                qy qyVar2 = this.f38830b;
                aVar.a(qyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = qyVar2.F3;
                    if (kxVar2 != null && (kxVar2.getFragment() instanceof wf1)) {
                        wf1Var2 = (wf1) qyVar2.F3.getFragment();
                    } else {
                        wf1Var2 = null;
                    }
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !qyVar2.f37049j2) {
                        aVar.f417a = true;
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
        hx hxVar = this.f38830b.E0;
        if (hxVar != null) {
            a0Var = hxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.gc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        qy qyVar = this.f38830b;
        if (qyVar.E0 != null) {
            qyVar.x4(false, true);
            qyVar.Q = true;
            qyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != qyVar.getUserConfig().getClientUserId()) {
                qyVar.E0.k(j3);
            } else {
                qyVar.E0.S.h1(0, 0);
            }
            qyVar.f37021e0[0].f36679a.getViewTreeObserver().addOnPreDrawListener(new dm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        qy qyVar = this.f38830b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f20430n0) {
                qyVar.N4(i6Var.getDialogId(), view);
                return true;
            }
        }
        zx zxVar = qyVar.C0;
        ai.w0 w0Var = zxVar.V;
        return qyVar.o4(view, i10, f7, zxVar.f26144b0);
    }

    @Override
    public void d(Canvas canvas) {
        wf1 wf1Var;
        fh.d dVar;
        wf1 wf1Var2;
        fh.d dVar2;
        switch (this.f38829a) {
            case 0:
                qy qyVar = this.f38830b;
                int measuredWidth = qyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = qyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = qyVar.F3;
                    if (kxVar != null && (kxVar.getFragment() instanceof wf1)) {
                        wf1Var = (wf1) qyVar.F3.getFragment();
                    } else {
                        wf1Var = null;
                    }
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !qyVar.f37049j2 && (dVar = wf1Var.f39310g1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var.getFragmentView().getTranslationX(), wf1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    qyVar.f37055k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                qy qyVar2 = this.f38830b;
                int measuredWidth2 = qyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = qyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = qyVar2.F3;
                    if (kxVar2 != null && (kxVar2.getFragment() instanceof wf1)) {
                        wf1Var2 = (wf1) qyVar2.F3.getFragment();
                    } else {
                        wf1Var2 = null;
                    }
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !qyVar2.f37049j2 && (dVar2 = wf1Var2.f39312h1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var2.getFragmentView().getTranslationX(), wf1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    qyVar2.f37055k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38830b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f38830b.H4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38830b.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38830b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        qy qyVar = this.f38830b;
        if (!qyVar.f37077p3) {
            return;
        }
        zx zxVar = qyVar.C0;
        if (zxVar != null) {
            zxVar.A0.remove(q0Var);
            zx zxVar2 = qyVar.C0;
            String obj = qyVar.f37047j0.getSearchField().getText().toString();
            View currentView = zxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !zxVar2.f26147e0;
            if (!TextUtils.isEmpty(zxVar2.K0)) {
                z10 = z11;
            }
            zxVar2.K0 = obj;
            zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z10);
        }
        qyVar.W4(true, null, null, false, true);
        qyVar.Y.f47088a.q(qyVar.X.f23131r);
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38830b.movePreviewFragment(f7);
        }
    }
}
