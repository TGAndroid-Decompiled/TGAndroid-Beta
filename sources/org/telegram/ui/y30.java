package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class y30 extends org.telegram.ui.Components.voip.m0 {
    public final g60 Q0;

    public y30(g60 g60Var, LaunchActivity launchActivity, m50 m50Var, u30 u30Var, ArrayList arrayList, ChatObject.Call call, g60 g60Var2) {
        super(launchActivity, m50Var, u30Var, arrayList, call, g60Var2);
        this.Q0 = g60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z10) {
        g60 g60Var = this.Q0;
        e60 e60Var = g60Var.B1;
        c50 c50Var = g60Var.O;
        m50 m50Var = g60Var.Q;
        org.telegram.ui.Components.v20 v20Var = g60Var.f33787p2;
        y30 y30Var = g60Var.a2;
        u30 u30Var = g60Var.f33774m2;
        g60Var.f33799s0 = z10;
        int i10 = 0;
        if (g60.G3) {
            if (!z10 && y30Var.f29404b) {
                g60Var.f33783o2.H(g60Var.f33779n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            g60Var.f33763j0[0].e(1, false);
            y30Var.K0[0].e(2, false);
            if (!y30Var.f29404b) {
                m50Var.setVisibility(0);
                c50Var.setVisibility(0);
                if (e60Var != null) {
                    e60Var.setVisibility(0);
                }
            }
            g60Var.N1(true, false);
            g60Var.e.requestLayout();
            if (u30Var.getVisibility() != 0) {
                u30Var.setVisibility(0);
                v20Var.F(u30Var, true);
                v20Var.G(u30Var, false);
            } else {
                v20Var.F(u30Var, true);
                g60Var.O0(true);
            }
        } else {
            if (!y30Var.f29404b) {
                u30Var.setVisibility(8);
                v20Var.F(u30Var, false);
            } else {
                c50Var.setVisibility(8);
                m50Var.setVisibility(8);
                if (e60Var != null) {
                    e60Var.setVisibility(8);
                }
            }
            if (u30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < u30Var.getChildCount(); i11++) {
                    View childAt = u30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.u20) childAt).setProgressToFullscreen(y30Var.f29406c);
                }
            }
        }
        View view = g60Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!g60Var.f33799s0) {
            g60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        g60 g60Var = this.Q0;
        float f10 = g60Var.U1;
        y30 y30Var = g60Var.a2;
        if (y30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = y30Var.f29406c;
        }
        ((org.telegram.ui.ActionBar.g3) g60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19175jg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19120gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
        viewGroup.invalidate();
        g60Var.B1(g60Var.U1);
    }
}
