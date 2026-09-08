package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class zx implements bh.h, org.telegram.ui.Components.un0, org.telegram.ui.Components.cl0, di.gc, org.telegram.ui.Components.a20 {
    public final int f43596a;
    public final uy f43597b;

    public zx(uy uyVar, int i10) {
        this.f43596a = i10;
        this.f43597b = uyVar;
    }

    @Override
    public di.kc a(long j3) {
        bi.u uVar;
        lx lxVar = this.f43597b.E0;
        if (lxVar != null) {
            uVar = lxVar.e(j3);
        } else {
            uVar = null;
        }
        return di.kc.c(uVar);
    }

    @Override
    public void b(long j3, bi.g gVar) {
        uy uyVar = this.f43597b;
        if (uyVar.E0 != null) {
            uyVar.x4(false, true);
            uyVar.Q = true;
            uyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != uyVar.getUserConfig().getClientUserId()) {
                uyVar.E0.k(j3);
            } else {
                uyVar.E0.S.h1(0, 0);
            }
            uyVar.f41286e0[0].f40885a.getViewTreeObserver().addOnPreDrawListener(new im(1, this, gVar));
            return;
        }
        gVar.run();
    }

    public void c(hg.q0 q0Var) {
        uy uyVar = this.f43597b;
        if (!uyVar.f41342p3) {
            return;
        }
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.A0.remove(q0Var);
            ey eyVar2 = uyVar.C0;
            String obj = uyVar.f41312j0.getSearchField().getText().toString();
            View currentView = eyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !eyVar2.f32980e0;
            if (!TextUtils.isEmpty(eyVar2.K0)) {
                z10 = z11;
            }
            eyVar2.K0 = obj;
            eyVar2.O(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
        uyVar.W4(true, null, null, false, true);
        uyVar.Y.f50132a.q(uyVar.X.f24549r);
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        uy uyVar = this.f43597b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f22069n0) {
                uyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        ey eyVar = uyVar.C0;
        bi.o0 o0Var = eyVar.V;
        return uyVar.o4(view, i10, f7, eyVar.f32977b0);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f43597b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f43597b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f43597b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f43597b.finishPreviewFragment();
        }
    }

    @Override
    public void k(Canvas canvas) {
        eg1 eg1Var;
        gh.d dVar;
        eg1 eg1Var2;
        gh.d dVar2;
        switch (this.f43596a) {
            case 0:
                uy uyVar = this.f43597b;
                int measuredWidth = uyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = uyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof eg1)) {
                        eg1Var = (eg1) uyVar.F3.getFragment();
                    } else {
                        eg1Var = null;
                    }
                    if (eg1Var != null && eg1Var.getFragmentView() != null && !uyVar.f41314j2 && (dVar = eg1Var.f36070g1) != null) {
                        canvas.save();
                        canvas.translate(eg1Var.getFragmentView().getTranslationX(), eg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    uyVar.l4.b(canvas, -3);
                    return;
                }
                return;
            default:
                uy uyVar2 = this.f43597b;
                int measuredWidth2 = uyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = uyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof eg1)) {
                        eg1Var2 = (eg1) uyVar2.F3.getFragment();
                    } else {
                        eg1Var2 = null;
                    }
                    if (eg1Var2 != null && eg1Var2.getFragmentView() != null && !uyVar2.f41314j2 && (dVar2 = eg1Var2.f36072h1) != null) {
                        canvas.save();
                        canvas.translate(eg1Var2.getFragmentView().getTranslationX(), eg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    uyVar2.l4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f43597b.movePreviewFragment(f7);
        }
    }

    @Override
    public void v(bh.a aVar) {
        eg1 eg1Var;
        eg1 eg1Var2;
        switch (this.f43596a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f20690d6;
                uy uyVar = this.f43597b;
                aVar.a(uyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    if (oxVar != null && (oxVar.getFragment() instanceof eg1)) {
                        eg1Var = (eg1) uyVar.F3.getFragment();
                    } else {
                        eg1Var = null;
                    }
                    if (eg1Var != null && eg1Var.getFragmentView() != null && !uyVar.f41314j2) {
                        aVar.f2675a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f20690d6;
                uy uyVar2 = this.f43597b;
                aVar.a(uyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    if (oxVar2 != null && (oxVar2.getFragment() instanceof eg1)) {
                        eg1Var2 = (eg1) uyVar2.F3.getFragment();
                    } else {
                        eg1Var2 = null;
                    }
                    if (eg1Var2 != null && eg1Var2.getFragmentView() != null && !uyVar2.f41314j2) {
                        aVar.f2675a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
