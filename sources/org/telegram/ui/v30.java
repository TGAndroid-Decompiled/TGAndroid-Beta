package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class v30 extends org.telegram.ui.Components.voip.k0 {
    public final c60 N0;

    public v30(c60 c60Var, LaunchActivity launchActivity, j50 j50Var, r30 r30Var, ArrayList arrayList, ChatObject.Call call, c60 c60Var2) {
        super(launchActivity, j50Var, r30Var, arrayList, call, c60Var2);
        this.N0 = c60Var;
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
        c60 c60Var = this.N0;
        a60 a60Var = c60Var.f33200y1;
        z40 z40Var = c60Var.L;
        j50 j50Var = c60Var.N;
        org.telegram.ui.Components.t20 t20Var = c60Var.f33147m2;
        v30 v30Var = c60Var.X1;
        r30 r30Var = c60Var.f33137j2;
        c60Var.f33158p0 = z4;
        int i10 = 0;
        if (c60.D3) {
            if (!z4 && v30Var.f29713b) {
                c60Var.f33144l2.H(c60Var.f33141k2, false, true);
                return;
            }
            return;
        }
        if (z4) {
            c60Var.f33123g0[0].e(1, false);
            v30Var.H0[0].e(2, false);
            if (!v30Var.f29713b) {
                j50Var.setVisibility(0);
                z40Var.setVisibility(0);
                if (a60Var != null) {
                    a60Var.setVisibility(0);
                }
            }
            c60Var.N1(true, false);
            c60Var.e.requestLayout();
            if (r30Var.getVisibility() != 0) {
                r30Var.setVisibility(0);
                t20Var.F(r30Var, true);
                t20Var.G(r30Var, false);
            } else {
                t20Var.F(r30Var, true);
                c60Var.O0(true);
            }
        } else {
            if (!v30Var.f29713b) {
                r30Var.setVisibility(8);
                t20Var.F(r30Var, false);
            } else {
                z40Var.setVisibility(8);
                j50Var.setVisibility(8);
                if (a60Var != null) {
                    a60Var.setVisibility(8);
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
                    ((org.telegram.ui.Components.s20) childAt).setProgressToFullscreen(v30Var.f29715c);
                }
            }
        }
        View view = c60Var.H2;
        if (!z4) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!c60Var.f33158p0) {
            c60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        ViewGroup viewGroup;
        invalidate();
        c60 c60Var = this.N0;
        float f11 = c60Var.R1;
        v30 v30Var = c60Var.X1;
        if (v30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = v30Var.f29715c;
        }
        ((org.telegram.ui.ActionBar.g3) c60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20022jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970gg, false), Math.max(f11, f10), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
        c60Var.B1(c60Var.R1);
    }
}
