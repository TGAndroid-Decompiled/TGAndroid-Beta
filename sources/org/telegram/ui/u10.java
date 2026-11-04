package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class u10 extends org.telegram.ui.Components.voip.x {
    public final x30 R0;

    public u10(x30 x30Var, LaunchActivity launchActivity, f30 f30Var, q10 q10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, x30 x30Var2) {
        super(launchActivity, f30Var, q10Var, arrayList, r3Var, x30Var2);
        this.R0 = x30Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.R0.R4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void i(boolean z10) {
        x30 x30Var = this.R0;
        v30 v30Var = x30Var.f51798t3;
        u20 u20Var = x30Var.G1;
        f30 f30Var = x30Var.I1;
        org.telegram.ui.Components.e10 e10Var = x30Var.f51745h4;
        u10 u10Var = x30Var.S3;
        q10 q10Var = x30Var.f51733e4;
        x30Var.f51755k2 = z10;
        int i3 = 0;
        if (x30.f51714y5) {
            if (!z10 && u10Var.f39670b) {
                x30Var.f51741g4.H(x30Var.f51737f4, false, true);
                return;
            }
            return;
        }
        if (z10) {
            x30Var.f51720b2[0].d(1, false);
            u10Var.L0[0].d(2, false);
            if (!u10Var.f39670b) {
                f30Var.setVisibility(0);
                u20Var.setVisibility(0);
                if (v30Var != null) {
                    v30Var.setVisibility(0);
                }
            }
            x30Var.Q1(true, false);
            x30Var.m1.requestLayout();
            if (q10Var.getVisibility() != 0) {
                q10Var.setVisibility(0);
                e10Var.F(q10Var, true);
                e10Var.G(q10Var, false);
            } else {
                e10Var.F(q10Var, true);
                x30Var.Q0(true);
            }
        } else {
            if (!u10Var.f39670b) {
                q10Var.setVisibility(8);
                e10Var.F(q10Var, false);
            } else {
                u20Var.setVisibility(8);
                f30Var.setVisibility(8);
                if (v30Var != null) {
                    v30Var.setVisibility(8);
                }
            }
            if (q10Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < q10Var.getChildCount(); i10++) {
                    View childAt = q10Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.d10) childAt).setProgressToFullscreen(u10Var.f39672c);
                }
            }
        }
        View view = x30Var.C4;
        if (!z10) {
            i3 = 8;
        }
        view.setVisibility(i3);
        if (!x30Var.f51755k2) {
            x30Var.Q0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        x30 x30Var = this.R0;
        float f11 = x30Var.M3;
        u10 u10Var = x30Var.S3;
        if (u10Var == null) {
            f10 = 0.0f;
        } else {
            f10 = u10Var.f39672c;
        }
        x30Var.H0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
        x30Var.f28586b.invalidate();
        x30Var.D1(x30Var.M3);
    }
}
