package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class zx implements ah.k, org.telegram.ui.Components.jo0, org.telegram.ui.Components.pl0, ci.fc, org.telegram.ui.Components.a20 {
    public final int f40647a;
    public final uy f40648b;

    public zx(uy uyVar, int i10) {
        this.f40647a = i10;
        this.f40648b = uyVar;
    }

    @Override
    public ci.jc a(long j3) {
        ai.a0 a0Var;
        lx lxVar = this.f40648b.E0;
        if (lxVar != null) {
            a0Var = lxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.jc.c(a0Var);
    }

    @Override
    public void b(Canvas canvas) {
        fg1 fg1Var;
        fh.d dVar;
        fg1 fg1Var2;
        fh.d dVar2;
        switch (this.f40647a) {
            case 0:
                uy uyVar = this.f40648b;
                int measuredWidth = uyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = uyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof fg1)) {
                        fg1Var = (fg1) uyVar.F3.getFragment();
                    } else {
                        fg1Var = null;
                    }
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !uyVar.f38305j2 && (dVar = fg1Var.f33638g1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var.getFragmentView().getTranslationX(), fg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    uyVar.f38311k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                uy uyVar2 = this.f40648b;
                int measuredWidth2 = uyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = uyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof fg1)) {
                        fg1Var2 = (fg1) uyVar2.F3.getFragment();
                    } else {
                        fg1Var2 = null;
                    }
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !uyVar2.f38305j2 && (dVar2 = fg1Var2.f33640h1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var2.getFragmentView().getTranslationX(), fg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    uyVar2.f38311k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.j6;
        uy uyVar = this.f40648b;
        if (z10) {
            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
            if (j6Var.f20501n0) {
                uyVar.N4(j6Var.getDialogId(), view);
                return true;
            }
        }
        ey eyVar = uyVar.C0;
        ai.w0 w0Var = eyVar.W;
        return uyVar.o4(view, i10, f7, eyVar.f26838c0);
    }

    @Override
    public void d(long j3, ai.j jVar) {
        uy uyVar = this.f40648b;
        if (uyVar.E0 != null) {
            uyVar.x4(false, true);
            uyVar.Q = true;
            uyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != uyVar.getUserConfig().getClientUserId()) {
                uyVar.E0.k(j3);
            } else {
                uyVar.E0.S.h1(0, 0);
            }
            uyVar.f38277e0[0].f37905a.getViewTreeObserver().addOnPreDrawListener(new fm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40648b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f40648b.H4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40648b.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40648b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        uy uyVar = this.f40648b;
        if (!uyVar.f38333p3) {
            return;
        }
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.B0.remove(q0Var);
            ey eyVar2 = uyVar.C0;
            String obj = uyVar.f38303j0.getSearchField().getText().toString();
            View currentView = eyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !eyVar2.f26841f0;
            if (!TextUtils.isEmpty(eyVar2.L0)) {
                z10 = z11;
            }
            eyVar2.L0 = obj;
            eyVar2.P(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
        uyVar.W4(true, null, null, false, true);
        uyVar.Y.f47143a.q(uyVar.X.f22811r);
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40648b.movePreviewFragment(f7);
        }
    }

    @Override
    public void y(ah.a aVar) {
        fg1 fg1Var;
        fg1 fg1Var2;
        switch (this.f40647a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f19109d6;
                uy uyVar = this.f40648b;
                aVar.a(uyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof fg1)) {
                        fg1Var = (fg1) uyVar.F3.getFragment();
                    } else {
                        fg1Var = null;
                    }
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !uyVar.f38305j2) {
                        aVar.f414a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f19109d6;
                uy uyVar2 = this.f40648b;
                aVar.a(uyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof fg1)) {
                        fg1Var2 = (fg1) uyVar2.F3.getFragment();
                    } else {
                        fg1Var2 = null;
                    }
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !uyVar2.f38305j2) {
                        aVar.f414a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
