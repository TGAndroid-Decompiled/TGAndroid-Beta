package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class sh1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f37477a;
    public final ki1 f37478b;

    public sh1(ki1 ki1Var, int i10) {
        this.f37477a = i10;
        this.f37478b = ki1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ki1 ki1Var = this.f37478b;
        ki1Var.f35078r0 = g10;
        ((FrameLayout.LayoutParams) ki1Var.f35066j0.getLayoutParams()).bottomMargin = ki1Var.f35078r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ki1Var.f35055e0.getLayoutParams()).bottomMargin = ki1Var.f35078r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ki1Var.H.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ki1Var.I.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ki1Var.K.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ki1Var.X.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ki1Var.N.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ki1Var.f35088y.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ki1Var.O.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ki1Var.R.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ki1Var.Q.getLayoutParams()).topMargin = ki1Var.f35078r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ki1Var.Z.getLayoutParams()).bottomMargin = ki1Var.f35078r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ki1Var.M0.getLayoutParams()).bottomMargin = ki1Var.f35078r0.getSystemWindowInsetBottom();
        ki1Var.Y.setInsets(ki1Var.f35078r0);
        ki1Var.Z.setInsets(ki1Var.f35078r0);
        ki1Var.f35079s.requestLayout();
        di1 di1Var = ki1Var.f35074o0;
        if (di1Var != null) {
            di1Var.setBottomPadding(ki1Var.f35078r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f42184b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37477a) {
            case 0:
                ci1 ci1Var = this.f37478b.f35082u0;
                if (ci1Var != null) {
                    ci1Var.b();
                    return;
                }
                return;
            default:
                this.f37478b.f35082u0.b();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f37477a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ki1 ki1Var = this.f37478b;
                    AndroidUtilities.cancelRunOnUIThread(ki1Var.S0);
                    ki1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ki1Var.f35085w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ki1Var.f35076q0 = ki1Var.f35075p0;
                    ki1Var.H();
                    return;
                }
                return;
            default:
                ki1.i(this.f37478b);
                return;
        }
    }
}
