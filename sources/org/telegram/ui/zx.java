package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class zx implements ah.j, org.telegram.ui.Components.un0, org.telegram.ui.Components.cl0, ci.fc, org.telegram.ui.Components.a20 {
    public final int f40326a;
    public final uy f40327b;

    public zx(uy uyVar, int i10) {
        this.f40326a = i10;
        this.f40327b = uyVar;
    }

    @Override
    public ci.jc a(long j3) {
        ai.a0 a0Var;
        lx lxVar = this.f40327b.E0;
        if (lxVar != null) {
            a0Var = lxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.jc.c(a0Var);
    }

    @Override
    public void b(Canvas canvas) {
        dg1 dg1Var;
        fh.d dVar;
        dg1 dg1Var2;
        fh.d dVar2;
        switch (this.f40326a) {
            case 0:
                uy uyVar = this.f40327b;
                int measuredWidth = uyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = uyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof dg1)) {
                        dg1Var = (dg1) uyVar.F3.getFragment();
                    } else {
                        dg1Var = null;
                    }
                    if (dg1Var != null && dg1Var.getFragmentView() != null && !uyVar.f38235j2 && (dVar = dg1Var.f33029g1) != null) {
                        canvas.save();
                        canvas.translate(dg1Var.getFragmentView().getTranslationX(), dg1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    uyVar.l4.b(canvas, -3);
                    return;
                }
                return;
            default:
                uy uyVar2 = this.f40327b;
                int measuredWidth2 = uyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = uyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar2.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof dg1)) {
                        dg1Var2 = (dg1) uyVar2.F3.getFragment();
                    } else {
                        dg1Var2 = null;
                    }
                    if (dg1Var2 != null && dg1Var2.getFragmentView() != null && !uyVar2.f38235j2 && (dVar2 = dg1Var2.f33031h1) != null) {
                        canvas.save();
                        canvas.translate(dg1Var2.getFragmentView().getTranslationX(), dg1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    uyVar2.l4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        uy uyVar = this.f40327b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f20197n0) {
                uyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        ey eyVar = uyVar.C0;
        ai.w0 w0Var = eyVar.V;
        return uyVar.o4(view, i10, f7, eyVar.f30287b0);
    }

    @Override
    public void d(long j3, ai.j jVar) {
        uy uyVar = this.f40327b;
        if (uyVar.E0 != null) {
            uyVar.x4(false, true);
            uyVar.Q = true;
            uyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != uyVar.getUserConfig().getClientUserId()) {
                uyVar.E0.k(j3);
            } else {
                uyVar.E0.S.h1(0, 0);
            }
            uyVar.f38207e0[0].f37803a.getViewTreeObserver().addOnPreDrawListener(new hm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40327b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f40327b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40327b.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40327b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        uy uyVar = this.f40327b;
        if (!uyVar.f38263p3) {
            return;
        }
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.A0.remove(q0Var);
            ey eyVar2 = uyVar.C0;
            String obj = uyVar.f38233j0.getSearchField().getText().toString();
            View currentView = eyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !eyVar2.f30290e0;
            if (!TextUtils.isEmpty(eyVar2.K0)) {
                z10 = z11;
            }
            eyVar2.K0 = obj;
            eyVar2.O(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
        uyVar.W4(true, null, null, false, true);
        uyVar.Y.f46820a.q(uyVar.X.f22573r);
    }

    @Override
    public void m(ah.a aVar) {
        dg1 dg1Var;
        dg1 dg1Var2;
        switch (this.f40326a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.i6.f18836d6;
                uy uyVar = this.f40327b;
                aVar.a(uyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof dg1)) {
                        dg1Var = (dg1) uyVar.F3.getFragment();
                    } else {
                        dg1Var = null;
                    }
                    if (dg1Var != null && dg1Var.getFragmentView() != null && !uyVar.f38235j2) {
                        aVar.f415a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.i6.f18836d6;
                uy uyVar2 = this.f40327b;
                aVar.a(uyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof dg1)) {
                        dg1Var2 = (dg1) uyVar2.F3.getFragment();
                    } else {
                        dg1Var2 = null;
                    }
                    if (dg1Var2 != null && dg1Var2.getFragmentView() != null && !uyVar2.f38235j2) {
                        aVar.f415a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40327b.movePreviewFragment(f7);
        }
    }
}
