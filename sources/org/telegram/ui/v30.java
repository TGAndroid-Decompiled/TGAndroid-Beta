package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class v30 extends org.telegram.ui.Components.voip.m0 {
    public final d60 Q0;

    public v30(d60 d60Var, LaunchActivity launchActivity, j50 j50Var, r30 r30Var, ArrayList arrayList, ChatObject.Call call, d60 d60Var2) {
        super(launchActivity, j50Var, r30Var, arrayList, call, d60Var2);
        this.Q0 = d60Var;
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
        d60 d60Var = this.Q0;
        b60 b60Var = d60Var.B1;
        z40 z40Var = d60Var.O;
        j50 j50Var = d60Var.Q;
        org.telegram.ui.Components.t20 t20Var = d60Var.f32980p2;
        v30 v30Var = d60Var.a2;
        r30 r30Var = d60Var.f32967m2;
        d60Var.f32992s0 = z10;
        int i10 = 0;
        if (d60.G3) {
            if (!z10 && v30Var.f29452b) {
                d60Var.f32976o2.H(d60Var.f32972n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            d60Var.f32956j0[0].e(1, false);
            v30Var.K0[0].e(2, false);
            if (!v30Var.f29452b) {
                j50Var.setVisibility(0);
                z40Var.setVisibility(0);
                if (b60Var != null) {
                    b60Var.setVisibility(0);
                }
            }
            d60Var.N1(true, false);
            d60Var.e.requestLayout();
            if (r30Var.getVisibility() != 0) {
                r30Var.setVisibility(0);
                t20Var.F(r30Var, true);
                t20Var.G(r30Var, false);
            } else {
                t20Var.F(r30Var, true);
                d60Var.O0(true);
            }
        } else {
            if (!v30Var.f29452b) {
                r30Var.setVisibility(8);
                t20Var.F(r30Var, false);
            } else {
                z40Var.setVisibility(8);
                j50Var.setVisibility(8);
                if (b60Var != null) {
                    b60Var.setVisibility(8);
                }
            }
            if (r30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < r30Var.getChildCount(); i11++) {
                    View childAt = r30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.s20) childAt).setProgressToFullscreen(v30Var.f29454c);
                }
            }
        }
        View view = d60Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!d60Var.f32992s0) {
            d60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        d60 d60Var = this.Q0;
        float f10 = d60Var.U1;
        v30 v30Var = d60Var.a2;
        if (v30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = v30Var.f29454c;
        }
        ((org.telegram.ui.ActionBar.e3) d60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19162jg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19107gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
        d60Var.B1(d60Var.U1);
    }
}
