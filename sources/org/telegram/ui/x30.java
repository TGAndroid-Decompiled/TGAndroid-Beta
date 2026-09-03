package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class x30 extends org.telegram.ui.Components.voip.k0 {
    public final e60 N0;

    public x30(e60 e60Var, LaunchActivity launchActivity, l50 l50Var, t30 t30Var, ArrayList arrayList, ChatObject.Call call, e60 e60Var2) {
        super(launchActivity, l50Var, t30Var, arrayList, call, e60Var2);
        this.N0 = e60Var;
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
        e60 e60Var = this.N0;
        c60 c60Var = e60Var.f33719y1;
        b50 b50Var = e60Var.L;
        l50 l50Var = e60Var.N;
        org.telegram.ui.Components.u20 u20Var = e60Var.f33666m2;
        x30 x30Var = e60Var.X1;
        t30 t30Var = e60Var.f33656j2;
        e60Var.f33677p0 = z4;
        int i10 = 0;
        if (e60.D3) {
            if (!z4 && x30Var.f29685b) {
                e60Var.f33663l2.H(e60Var.f33660k2, false, true);
                return;
            }
            return;
        }
        if (z4) {
            e60Var.f33642g0[0].e(1, false);
            x30Var.H0[0].e(2, false);
            if (!x30Var.f29685b) {
                l50Var.setVisibility(0);
                b50Var.setVisibility(0);
                if (c60Var != null) {
                    c60Var.setVisibility(0);
                }
            }
            e60Var.N1(true, false);
            e60Var.e.requestLayout();
            if (t30Var.getVisibility() != 0) {
                t30Var.setVisibility(0);
                u20Var.F(t30Var, true);
                u20Var.G(t30Var, false);
            } else {
                u20Var.F(t30Var, true);
                e60Var.O0(true);
            }
        } else {
            if (!x30Var.f29685b) {
                t30Var.setVisibility(8);
                u20Var.F(t30Var, false);
            } else {
                b50Var.setVisibility(8);
                l50Var.setVisibility(8);
                if (c60Var != null) {
                    c60Var.setVisibility(8);
                }
            }
            if (t30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < t30Var.getChildCount(); i11++) {
                    View childAt = t30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.t20) childAt).setProgressToFullscreen(x30Var.f29687c);
                }
            }
        }
        View view = e60Var.H2;
        if (!z4) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!e60Var.f33677p0) {
            e60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        ViewGroup viewGroup;
        invalidate();
        e60 e60Var = this.N0;
        float f11 = e60Var.R1;
        x30 x30Var = e60Var.X1;
        if (x30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = x30Var.f29687c;
        }
        ((org.telegram.ui.ActionBar.g3) e60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19997jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19945gg, false), Math.max(f11, f10), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
        e60Var.B1(e60Var.R1);
    }
}
