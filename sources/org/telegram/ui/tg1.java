package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

public final class tg1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.h3 {

    public final int f42939a;

    public final lh1 f42940b;

    public tg1(lh1 lh1Var, int i10) {
        this.f42939a = i10;
        this.f42940b = lh1Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets windowInsetsG = m1Var.g();
        lh1 lh1Var = this.f42940b;
        lh1Var.f40116n0 = windowInsetsG;
        ((FrameLayout.LayoutParams) lh1Var.f40104f0.getLayoutParams()).bottomMargin = lh1Var.f40116n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) lh1Var.f40090a0.getLayoutParams()).bottomMargin = lh1Var.f40116n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) lh1Var.D.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) lh1Var.E.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) lh1Var.G.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) lh1Var.T.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) lh1Var.J.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) lh1Var.f40131y.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) lh1Var.K.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) lh1Var.N.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) lh1Var.M.getLayoutParams()).topMargin = lh1Var.f40116n0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) lh1Var.V.getLayoutParams()).bottomMargin = lh1Var.f40116n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) lh1Var.I0.getLayoutParams()).bottomMargin = lh1Var.f40116n0.getSystemWindowInsetBottom();
        lh1Var.U.setInsets(lh1Var.f40116n0);
        lh1Var.V.setInsets(lh1Var.f40116n0);
        lh1Var.f40122s.requestLayout();
        eh1 eh1Var = lh1Var.f40113k0;
        if (eh1Var != null) {
            eh1Var.setBottomPadding(lh1Var.f40116n0.getSystemWindowInsetBottom());
        }
        return r0.m1.f46618b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        switch (this.f42939a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    lh1 lh1Var = this.f42940b;
                    AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
                    lh1Var.N0 = false;
                    boolean zIsMicMute = sharedInstance.isMicMute();
                    boolean z10 = !zIsMicMute;
                    if (lh1Var.f40123s0.isTouchExplorationEnabled()) {
                        i3Var.announceForAccessibility(LocaleController.getString(!zIsMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    lh1Var.m0 = lh1Var.f40114l0;
                    lh1Var.H();
                }
                break;
            default:
                lh1.i(this.f42940b);
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42939a) {
            case 0:
                dh1 dh1Var = this.f42940b.f40119q0;
                if (dh1Var != null) {
                    dh1Var.b();
                }
                break;
            default:
                this.f42940b.f40119q0.b();
                break;
        }
    }
}
