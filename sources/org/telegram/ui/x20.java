package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class x20 extends org.telegram.ui.Components.voip.x {
    public final a50 Q0;

    public x20(a50 a50Var, LaunchActivity launchActivity, h40 h40Var, t20 t20Var, ArrayList arrayList, org.telegram.messenger.u3 u3Var, a50 a50Var2) {
        super(launchActivity, h40Var, t20Var, arrayList, u3Var, a50Var2);
        this.Q0 = a50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void i(boolean z10) {
        a50 a50Var = this.Q0;
        y40 y40Var = a50Var.f35659s3;
        x30 x30Var = a50Var.F1;
        h40 h40Var = a50Var.H1;
        org.telegram.ui.Components.z10 z10Var = a50Var.f35604g4;
        x20 x20Var = a50Var.R3;
        t20 t20Var = a50Var.f35592d4;
        a50Var.f35616j2 = z10;
        int i10 = 0;
        if (a50.f35576x5) {
            if (!z10 && x20Var.f31792b) {
                a50Var.f35600f4.H(a50Var.f35596e4, false, true);
                return;
            }
            return;
        }
        if (z10) {
            a50Var.a2[0].d(1, false);
            x20Var.K0[0].d(2, false);
            if (!x20Var.f31792b) {
                h40Var.setVisibility(0);
                x30Var.setVisibility(0);
                if (y40Var != null) {
                    y40Var.setVisibility(0);
                }
            }
            a50Var.Q1(true, false);
            a50Var.l1.requestLayout();
            if (t20Var.getVisibility() != 0) {
                t20Var.setVisibility(0);
                z10Var.F(t20Var, true);
                z10Var.G(t20Var, false);
            } else {
                z10Var.F(t20Var, true);
                a50Var.Q0(true);
            }
        } else {
            if (!x20Var.f31792b) {
                t20Var.setVisibility(8);
                z10Var.F(t20Var, false);
            } else {
                x30Var.setVisibility(8);
                h40Var.setVisibility(8);
                if (y40Var != null) {
                    y40Var.setVisibility(8);
                }
            }
            if (t20Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < t20Var.getChildCount(); i11++) {
                    View childAt = t20Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.y10) childAt).setProgressToFullscreen(x20Var.f31794c);
                }
            }
        }
        View view = a50Var.B4;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!a50Var.f35616j2) {
            a50Var.Q0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        invalidate();
        a50 a50Var = this.Q0;
        float f10 = a50Var.L3;
        x20 x20Var = a50Var.R3;
        if (x20Var == null) {
            f7 = 0.0f;
        } else {
            f7 = x20Var.f31794c;
        }
        a50Var.G0 = org.telegram.messenger.i0.S0(Math.max(f10, f7), 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
        a50Var.f21587b.invalidate();
        a50Var.D1(a50Var.L3);
    }
}
