package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class wg1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.s1, r0.o, org.telegram.ui.Components.voip.k3 {
    public final int f44307a;
    public final oh1 f44308b;

    public wg1(oh1 oh1Var, int i10) {
        this.f44307a = i10;
        this.f44308b = oh1Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        oh1 oh1Var = this.f44308b;
        oh1Var.f41163n0 = g10;
        ((FrameLayout.LayoutParams) oh1Var.f41151f0.getLayoutParams()).bottomMargin = oh1Var.f41163n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.f41137a0.getLayoutParams()).bottomMargin = oh1Var.f41163n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.D.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.E.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.G.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) oh1Var.T.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) oh1Var.J.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) oh1Var.f41178y.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) oh1Var.K.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.N.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) oh1Var.M.getLayoutParams()).topMargin = oh1Var.f41163n0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) oh1Var.V.getLayoutParams()).bottomMargin = oh1Var.f41163n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.I0.getLayoutParams()).bottomMargin = oh1Var.f41163n0.getSystemWindowInsetBottom();
        oh1Var.U.setInsets(oh1Var.f41163n0);
        oh1Var.V.setInsets(oh1Var.f41163n0);
        oh1Var.f41169s.requestLayout();
        hh1 hh1Var = oh1Var.f41160k0;
        if (hh1Var != null) {
            hh1Var.setBottomPadding(oh1Var.f41163n0.getSystemWindowInsetBottom());
        }
        return r0.m1.f46842b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.l3 l3Var) {
        int i10;
        switch (this.f44307a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    oh1 oh1Var = this.f44308b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
                    oh1Var.N0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (oh1Var.f41170s0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        l3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    oh1Var.m0 = oh1Var.f41161l0;
                    oh1Var.H();
                    return;
                }
                return;
            default:
                oh1.i(this.f44308b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44307a) {
            case 0:
                gh1 gh1Var = this.f44308b.f41166q0;
                if (gh1Var != null) {
                    gh1Var.b();
                    return;
                }
                return;
            default:
                this.f44308b.f41166q0.b();
                return;
        }
    }
}
