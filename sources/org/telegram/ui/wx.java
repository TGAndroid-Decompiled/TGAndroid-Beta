package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wx implements ah.j, org.telegram.ui.Components.un0, org.telegram.ui.Components.dl0, ci.cc, org.telegram.ui.Components.b20 {
    public final int f39122a;
    public final ry f39123b;

    public wx(ry ryVar, int i10) {
        this.f39122a = i10;
        this.f39123b = ryVar;
    }

    @Override
    public ci.gc a(long j3) {
        ai.a0 a0Var;
        ix ixVar = this.f39123b.E0;
        if (ixVar != null) {
            a0Var = ixVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.gc.c(a0Var);
    }

    @Override
    public void b(Canvas canvas) {
        wf1 wf1Var;
        fh.d dVar;
        wf1 wf1Var2;
        fh.d dVar2;
        switch (this.f39122a) {
            case 0:
                ry ryVar = this.f39123b;
                int measuredWidth = ryVar.fragmentView.getMeasuredWidth();
                int measuredHeight = ryVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = ryVar.F3;
                    if (lxVar != null && (lxVar.getFragment() instanceof wf1)) {
                        wf1Var = (wf1) ryVar.F3.getFragment();
                    } else {
                        wf1Var = null;
                    }
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !ryVar.f37006j2 && (dVar = wf1Var.f38953g1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var.getFragmentView().getTranslationX(), wf1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    ryVar.f37012k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                ry ryVar2 = this.f39123b;
                int measuredWidth2 = ryVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = ryVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(ryVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = ryVar2.F3;
                    if (lxVar2 != null && (lxVar2.getFragment() instanceof wf1)) {
                        wf1Var2 = (wf1) ryVar2.F3.getFragment();
                    } else {
                        wf1Var2 = null;
                    }
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !ryVar2.f37006j2 && (dVar2 = wf1Var2.f38955h1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var2.getFragmentView().getTranslationX(), wf1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    ryVar2.f37012k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        ry ryVar = this.f39123b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f20205n0) {
                ryVar.N4(i6Var.getDialogId(), view);
                return true;
            }
        }
        ay ayVar = ryVar.C0;
        ai.w0 w0Var = ayVar.V;
        return ryVar.o4(view, i10, f7, ayVar.f30335b0);
    }

    @Override
    public void d(long j3, ai.j jVar) {
        ry ryVar = this.f39123b;
        if (ryVar.E0 != null) {
            ryVar.x4(false, true);
            ryVar.Q = true;
            ryVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != ryVar.getUserConfig().getClientUserId()) {
                ryVar.E0.k(j3);
            } else {
                ryVar.E0.S.h1(0, 0);
            }
            ryVar.f36978e0[0].f36629a.getViewTreeObserver().addOnPreDrawListener(new em(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39123b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f39123b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39123b.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39123b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        ry ryVar = this.f39123b;
        if (!ryVar.f37034p3) {
            return;
        }
        ay ayVar = ryVar.C0;
        if (ayVar != null) {
            ayVar.A0.remove(q0Var);
            ay ayVar2 = ryVar.C0;
            String obj = ryVar.f37004j0.getSearchField().getText().toString();
            View currentView = ayVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !ayVar2.f30338e0;
            if (!TextUtils.isEmpty(ayVar2.K0)) {
                z10 = z11;
            }
            ayVar2.K0 = obj;
            ayVar2.O(currentView, ayVar2.getCurrentPosition(), obj, z10);
        }
        ryVar.W4(true, null, null, false, true);
        ryVar.Y.f46774a.q(ryVar.X.f22890r);
    }

    @Override
    public void m(ah.a aVar) {
        wf1 wf1Var;
        wf1 wf1Var2;
        switch (this.f39122a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.f18789d6;
                ry ryVar = this.f39123b;
                aVar.a(ryVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = ryVar.F3;
                    if (lxVar != null && (lxVar.getFragment() instanceof wf1)) {
                        wf1Var = (wf1) ryVar.F3.getFragment();
                    } else {
                        wf1Var = null;
                    }
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !ryVar.f37006j2) {
                        aVar.f417a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.f18789d6;
                ry ryVar2 = this.f39123b;
                aVar.a(ryVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = ryVar2.F3;
                    if (lxVar2 != null && (lxVar2.getFragment() instanceof wf1)) {
                        wf1Var2 = (wf1) ryVar2.F3.getFragment();
                    } else {
                        wf1Var2 = null;
                    }
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !ryVar2.f37006j2) {
                        aVar.f417a = true;
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
            this.f39123b.movePreviewFragment(f7);
        }
    }
}
