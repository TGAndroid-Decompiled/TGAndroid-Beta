package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class uh1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f38464a;
    public final mi1 f38465b;

    public uh1(mi1 mi1Var, int i10) {
        this.f38464a = i10;
        this.f38465b = mi1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        mi1 mi1Var = this.f38465b;
        mi1Var.f35589r0 = g10;
        ((FrameLayout.LayoutParams) mi1Var.f35577j0.getLayoutParams()).bottomMargin = mi1Var.f35589r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mi1Var.f35566e0.getLayoutParams()).bottomMargin = mi1Var.f35589r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mi1Var.H.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mi1Var.I.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mi1Var.K.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) mi1Var.X.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) mi1Var.N.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) mi1Var.f35599y.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) mi1Var.O.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mi1Var.R.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) mi1Var.Q.getLayoutParams()).topMargin = mi1Var.f35589r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) mi1Var.Z.getLayoutParams()).bottomMargin = mi1Var.f35589r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mi1Var.M0.getLayoutParams()).bottomMargin = mi1Var.f35589r0.getSystemWindowInsetBottom();
        mi1Var.Y.setInsets(mi1Var.f35589r0);
        mi1Var.Z.setInsets(mi1Var.f35589r0);
        mi1Var.f35590s.requestLayout();
        fi1 fi1Var = mi1Var.f35585o0;
        if (fi1Var != null) {
            fi1Var.setBottomPadding(mi1Var.f35589r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f42125b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38464a) {
            case 0:
                ei1 ei1Var = this.f38465b.f35593u0;
                if (ei1Var != null) {
                    ei1Var.b();
                    return;
                }
                return;
            default:
                this.f38465b.f35593u0.b();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f38464a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    mi1 mi1Var = this.f38465b;
                    AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
                    mi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (mi1Var.f35596w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    mi1Var.f35587q0 = mi1Var.f35586p0;
                    mi1Var.H();
                    return;
                }
                return;
            default:
                mi1.i(this.f38465b);
                return;
        }
    }
}
