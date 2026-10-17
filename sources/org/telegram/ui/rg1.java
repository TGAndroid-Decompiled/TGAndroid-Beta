package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class rg1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final int f40737a;
    public final jh1 f40738b;

    public rg1(jh1 jh1Var, int i10) {
        this.f40737a = i10;
        this.f40738b = jh1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        jh1 jh1Var = this.f40738b;
        jh1Var.f38206r0 = g10;
        ((FrameLayout.LayoutParams) jh1Var.f38194j0.getLayoutParams()).bottomMargin = jh1Var.f38206r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jh1Var.f38183e0.getLayoutParams()).bottomMargin = jh1Var.f38206r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jh1Var.H.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jh1Var.I.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jh1Var.K.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) jh1Var.X.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) jh1Var.N.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) jh1Var.f38216y.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) jh1Var.O.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jh1Var.R.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) jh1Var.Q.getLayoutParams()).topMargin = jh1Var.f38206r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) jh1Var.Z.getLayoutParams()).bottomMargin = jh1Var.f38206r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jh1Var.M0.getLayoutParams()).bottomMargin = jh1Var.f38206r0.getSystemWindowInsetBottom();
        jh1Var.Y.setInsets(jh1Var.f38206r0);
        jh1Var.Z.setInsets(jh1Var.f38206r0);
        jh1Var.f38207s.requestLayout();
        ch1 ch1Var = jh1Var.f38202o0;
        if (ch1Var != null) {
            ch1Var.setBottomPadding(jh1Var.f38206r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f44852b;
    }

    @Override
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        int i10;
        switch (this.f40737a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    jh1 jh1Var = this.f40738b;
                    AndroidUtilities.cancelRunOnUIThread(jh1Var.S0);
                    jh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (jh1Var.f38213w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        h3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    jh1Var.f38204q0 = jh1Var.f38203p0;
                    jh1Var.G();
                    return;
                }
                return;
            default:
                jh1 jh1Var2 = this.f40738b;
                AndroidUtilities.cancelRunOnUIThread(jh1Var2.S0);
                jh1Var2.R0 = false;
                if (jh1Var2.f38175b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    jh1Var2.f38175b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    jh1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40737a) {
            case 0:
                bh1 bh1Var = this.f40738b.f38210u0;
                if (bh1Var != null) {
                    bh1Var.b();
                    return;
                }
                return;
            default:
                this.f40738b.f38210u0.b();
                return;
        }
    }
}
