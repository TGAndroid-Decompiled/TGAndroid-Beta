package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class z10 extends org.telegram.ui.Components.voip.k0 {
    public final c40 Q0;

    public z10(c40 c40Var, LaunchActivity launchActivity, k30 k30Var, v10 v10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, c40 c40Var2) {
        super(launchActivity, k30Var, v10Var, arrayList, r3Var, c40Var2);
        this.Q0 = c40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z9) {
        c40 c40Var = this.Q0;
        a40 a40Var = c40Var.f44627s3;
        z20 z20Var = c40Var.F1;
        k30 k30Var = c40Var.H1;
        org.telegram.ui.Components.i10 i10Var = c40Var.f44573g4;
        z10 z10Var = c40Var.R3;
        v10 v10Var = c40Var.f44561d4;
        c40Var.f44585j2 = z9;
        int i7 = 0;
        if (c40.f44545x5) {
            if (!z9 && z10Var.f39293b) {
                c40Var.f44569f4.H(c40Var.f44565e4, false, true);
                return;
            }
            return;
        }
        if (z9) {
            c40Var.f44548a2[0].d(1, false);
            z10Var.K0[0].d(2, false);
            if (!z10Var.f39293b) {
                k30Var.setVisibility(0);
                z20Var.setVisibility(0);
                if (a40Var != null) {
                    a40Var.setVisibility(0);
                }
            }
            c40Var.T1(true, false);
            c40Var.l1.requestLayout();
            if (v10Var.getVisibility() != 0) {
                v10Var.setVisibility(0);
                i10Var.F(v10Var, true);
                i10Var.G(v10Var, false);
            } else {
                i10Var.F(v10Var, true);
                c40Var.Q0(true);
            }
        } else {
            if (!z10Var.f39293b) {
                v10Var.setVisibility(8);
                i10Var.F(v10Var, false);
            } else {
                z20Var.setVisibility(8);
                k30Var.setVisibility(8);
                if (a40Var != null) {
                    a40Var.setVisibility(8);
                }
            }
            if (v10Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < v10Var.getChildCount(); i10++) {
                    View childAt = v10Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.h10) childAt).setProgressToFullscreen(z10Var.f39295c);
                }
            }
        }
        View view = c40Var.B4;
        if (!z9) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (!c40Var.f44585j2) {
            c40Var.Q0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        c40 c40Var = this.Q0;
        float f11 = c40Var.L3;
        z10 z10Var = c40Var.R3;
        if (z10Var == null) {
            f10 = 0.0f;
        } else {
            f10 = z10Var.f39295c;
        }
        c40Var.G0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
        c40Var.f28619b.invalidate();
        c40Var.G1(c40Var.L3);
    }
}
