package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class zx implements ah.k, org.telegram.ui.Components.ho0, org.telegram.ui.Components.nl0, ci.fc, org.telegram.ui.Components.a20 {
    public final int f40582a;
    public final uy f40583b;

    public zx(uy uyVar, int i10) {
        this.f40582a = i10;
        this.f40583b = uyVar;
    }

    @Override
    public void U(ah.a aVar) {
        dg1 dg1Var;
        dg1 dg1Var2;
        switch (this.f40582a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f19062d6;
                uy uyVar = this.f40583b;
                aVar.a(uyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof dg1)) {
                        dg1Var = (dg1) uyVar.F3.getFragment();
                    } else {
                        dg1Var = null;
                    }
                    if (dg1Var != null && dg1Var.getFragmentView() != null && !uyVar.f38177j2) {
                        aVar.f417a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f19062d6;
                uy uyVar2 = this.f40583b;
                aVar.a(uyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof dg1)) {
                        dg1Var2 = (dg1) uyVar2.F3.getFragment();
                    } else {
                        dg1Var2 = null;
                    }
                    if (dg1Var2 != null && dg1Var2.getFragmentView() != null && !uyVar2.f38177j2) {
                        aVar.f417a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public ci.jc a(long j3) {
        ai.a0 a0Var;
        lx lxVar = this.f40583b.E0;
        if (lxVar != null) {
            a0Var = lxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.jc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        uy uyVar = this.f40583b;
        if (uyVar.E0 != null) {
            uyVar.x4(false, true);
            uyVar.Q = true;
            uyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != uyVar.getUserConfig().getClientUserId()) {
                uyVar.E0.k(j3);
            } else {
                uyVar.E0.S.h1(0, 0);
            }
            uyVar.f38149e0[0].f37826a.getViewTreeObserver().addOnPreDrawListener(new fm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        uy uyVar = this.f40583b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f20408n0) {
                uyVar.N4(i6Var.getDialogId(), view);
                return true;
            }
        }
        ey eyVar = uyVar.C0;
        ai.w0 w0Var = eyVar.W;
        return uyVar.o4(view, i10, f7, eyVar.f26207c0);
    }

    @Override
    public void d(Canvas canvas) {
        dg1 dg1Var;
        fh.d dVar;
        dg1 dg1Var2;
        fh.d dVar2;
        switch (this.f40582a) {
            case 0:
                uy uyVar = this.f40583b;
                int measuredWidth = uyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = uyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof dg1)) {
                        dg1Var = (dg1) uyVar.F3.getFragment();
                    } else {
                        dg1Var = null;
                    }
                    if (dg1Var != null && dg1Var.getFragmentView() != null && !uyVar.f38177j2 && (dVar = dg1Var.f32987g1) != null) {
                        canvas.save();
                        canvas.translate(dg1Var.getFragmentView().getTranslationX(), dg1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    uyVar.f38183k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                uy uyVar2 = this.f40583b;
                int measuredWidth2 = uyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = uyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof dg1)) {
                        dg1Var2 = (dg1) uyVar2.F3.getFragment();
                    } else {
                        dg1Var2 = null;
                    }
                    if (dg1Var2 != null && dg1Var2.getFragmentView() != null && !uyVar2.f38177j2 && (dVar2 = dg1Var2.f32989h1) != null) {
                        canvas.save();
                        canvas.translate(dg1Var2.getFragmentView().getTranslationX(), dg1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    uyVar2.f38183k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40583b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f40583b.H4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40583b.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40583b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        uy uyVar = this.f40583b;
        if (!uyVar.f38205p3) {
            return;
        }
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.B0.remove(q0Var);
            ey eyVar2 = uyVar.C0;
            String obj = uyVar.f38175j0.getSearchField().getText().toString();
            View currentView = eyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !eyVar2.f26210f0;
            if (!TextUtils.isEmpty(eyVar2.L0)) {
                z10 = z11;
            }
            eyVar2.L0 = obj;
            eyVar2.P(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
        uyVar.W4(true, null, null, false, true);
        uyVar.Y.f47084a.q(uyVar.X.f22787r);
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40583b.movePreviewFragment(f7);
        }
    }
}
