package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class w30 extends org.telegram.ui.Components.voip.l0 {
    public final d60 N0;

    public w30(d60 d60Var, LaunchActivity launchActivity, k50 k50Var, s30 s30Var, ArrayList arrayList, ChatObject.Call call, d60 d60Var2) {
        super(launchActivity, k50Var, s30Var, arrayList, call, d60Var2);
        this.N0 = d60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.N0.W2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void i(boolean z4) {
        d60 d60Var = this.N0;
        b60 b60Var = d60Var.f36114y1;
        a50 a50Var = d60Var.L;
        k50 k50Var = d60Var.N;
        org.telegram.ui.Components.u20 u20Var = d60Var.f36061m2;
        w30 w30Var = d60Var.X1;
        s30 s30Var = d60Var.f36051j2;
        d60Var.f36072p0 = z4;
        int i10 = 0;
        if (d60.D3) {
            if (!z4 && w30Var.f32140b) {
                d60Var.f36058l2.H(d60Var.f36055k2, false, true);
                return;
            }
            return;
        }
        if (z4) {
            d60Var.f36037g0[0].e(1, false);
            w30Var.H0[0].e(2, false);
            if (!w30Var.f32140b) {
                k50Var.setVisibility(0);
                a50Var.setVisibility(0);
                if (b60Var != null) {
                    b60Var.setVisibility(0);
                }
            }
            d60Var.N1(true, false);
            d60Var.f36027e.requestLayout();
            if (s30Var.getVisibility() != 0) {
                s30Var.setVisibility(0);
                u20Var.F(s30Var, true);
                u20Var.G(s30Var, false);
            } else {
                u20Var.F(s30Var, true);
                d60Var.O0(true);
            }
        } else {
            if (!w30Var.f32140b) {
                s30Var.setVisibility(8);
                u20Var.F(s30Var, false);
            } else {
                a50Var.setVisibility(8);
                k50Var.setVisibility(8);
                if (b60Var != null) {
                    b60Var.setVisibility(8);
                }
            }
            if (s30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < s30Var.getChildCount(); i11++) {
                    View childAt = s30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.t20) childAt).setProgressToFullscreen(w30Var.f32142c);
                }
            }
        }
        View view = d60Var.H2;
        if (!z4) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!d60Var.f36072p0) {
            d60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        ViewGroup viewGroup;
        invalidate();
        d60 d60Var = this.N0;
        float f11 = d60Var.R1;
        w30 w30Var = d60Var.X1;
        if (w30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = w30Var.f32142c;
        }
        ((org.telegram.ui.ActionBar.h3) d60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21776jg, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21724gg, false), Math.max(f11, f10), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
        d60Var.B1(d60Var.R1);
    }
}
