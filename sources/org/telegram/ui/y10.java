package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class y10 extends org.telegram.ui.Components.voip.l0 {
    public final c40 R0;

    public y10(c40 c40Var, LaunchActivity launchActivity, k30 k30Var, u10 u10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, c40 c40Var2) {
        super(launchActivity, k30Var, u10Var, arrayList, r3Var, c40Var2);
        this.R0 = c40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.R0.Y4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z10) {
        c40 c40Var = this.R0;
        a40 a40Var = c40Var.A3;
        a30 a30Var = c40Var.J1;
        k30 k30Var = c40Var.L1;
        org.telegram.ui.Components.l10 l10Var = c40Var.o4;
        y10 y10Var = c40Var.Z3;
        u10 u10Var = c40Var.f45940l4;
        c40Var.f45947n2 = z10;
        int i7 = 0;
        if (c40.F5) {
            if (!z10 && y10Var.f40724b) {
                c40Var.f45949n4.H(c40Var.f45945m4, false, true);
                return;
            }
            return;
        }
        if (z10) {
            c40Var.f45911e2[0].d(1, false);
            y10Var.L0[0].d(2, false);
            if (!y10Var.f40724b) {
                k30Var.setVisibility(0);
                a30Var.setVisibility(0);
                if (a40Var != null) {
                    a40Var.setVisibility(0);
                }
            }
            c40Var.V1(true, false);
            c40Var.f45955p1.requestLayout();
            if (u10Var.getVisibility() != 0) {
                u10Var.setVisibility(0);
                l10Var.F(u10Var, true);
                l10Var.G(u10Var, false);
            } else {
                l10Var.F(u10Var, true);
                c40Var.Q0(true);
            }
        } else {
            if (!y10Var.f40724b) {
                u10Var.setVisibility(8);
                l10Var.F(u10Var, false);
            } else {
                a30Var.setVisibility(8);
                k30Var.setVisibility(8);
                if (a40Var != null) {
                    a40Var.setVisibility(8);
                }
            }
            if (u10Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < u10Var.getChildCount(); i10++) {
                    View childAt = u10Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.k10) childAt).setProgressToFullscreen(y10Var.f40726c);
                }
            }
        }
        View view = c40Var.J4;
        if (!z10) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (!c40Var.f45947n2) {
            c40Var.Q0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        c40 c40Var = this.R0;
        float f11 = c40Var.T3;
        y10 y10Var = c40Var.Z3;
        if (y10Var == null) {
            f10 = 0.0f;
        } else {
            f10 = y10Var.f40726c;
        }
        c40Var.H0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28802ah, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
        c40Var.f29682b.invalidate();
        c40Var.G1(c40Var.T3);
    }
}
