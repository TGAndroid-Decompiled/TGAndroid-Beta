package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class xg1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f45682a;
    public final rh1 f45683b;

    public xg1(rh1 rh1Var, int i10) {
        this.f45682a = i10;
        this.f45683b = rh1Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        rh1 rh1Var = this.f45683b;
        rh1Var.f43034r0 = g7;
        ((FrameLayout.LayoutParams) rh1Var.f43022j0.getLayoutParams()).bottomMargin = rh1Var.f43034r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) rh1Var.f43011e0.getLayoutParams()).bottomMargin = rh1Var.f43034r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) rh1Var.H.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) rh1Var.I.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) rh1Var.K.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) rh1Var.X.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) rh1Var.N.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) rh1Var.f43044y.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) rh1Var.O.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) rh1Var.R.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) rh1Var.Q.getLayoutParams()).topMargin = rh1Var.f43034r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) rh1Var.Z.getLayoutParams()).bottomMargin = rh1Var.f43034r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) rh1Var.M0.getLayoutParams()).bottomMargin = rh1Var.f43034r0.getSystemWindowInsetBottom();
        rh1Var.Y.setInsets(rh1Var.f43034r0);
        rh1Var.Z.setInsets(rh1Var.f43034r0);
        rh1Var.f43035s.requestLayout();
        kh1 kh1Var = rh1Var.f43030o0;
        if (kh1Var != null) {
            kh1Var.setBottomPadding(rh1Var.f43034r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f47152b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f45682a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    rh1 rh1Var = this.f45683b;
                    AndroidUtilities.cancelRunOnUIThread(rh1Var.S0);
                    rh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (rh1Var.f43041w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    rh1Var.f43032q0 = rh1Var.f43031p0;
                    rh1Var.G();
                    return;
                }
                return;
            default:
                rh1 rh1Var2 = this.f45683b;
                AndroidUtilities.cancelRunOnUIThread(rh1Var2.S0);
                rh1Var2.R0 = false;
                if (rh1Var2.f43003b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    rh1Var2.f43003b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    rh1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f45682a) {
            case 0:
                jh1 jh1Var = this.f45683b.f43038u0;
                if (jh1Var != null) {
                    jh1Var.b();
                    return;
                }
                return;
            default:
                this.f45683b.f43038u0.b();
                return;
        }
    }
}
