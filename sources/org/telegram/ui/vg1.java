package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class vg1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f44804a;
    public final ph1 f44805b;

    public vg1(ph1 ph1Var, int i10) {
        this.f44804a = i10;
        this.f44805b = ph1Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        ph1 ph1Var = this.f44805b;
        ph1Var.f42541r0 = g7;
        ((FrameLayout.LayoutParams) ph1Var.f42529j0.getLayoutParams()).bottomMargin = ph1Var.f42541r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ph1Var.f42518e0.getLayoutParams()).bottomMargin = ph1Var.f42541r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ph1Var.H.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ph1Var.I.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ph1Var.K.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ph1Var.X.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ph1Var.N.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ph1Var.f42551y.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ph1Var.O.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ph1Var.R.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ph1Var.Q.getLayoutParams()).topMargin = ph1Var.f42541r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ph1Var.Z.getLayoutParams()).bottomMargin = ph1Var.f42541r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ph1Var.M0.getLayoutParams()).bottomMargin = ph1Var.f42541r0.getSystemWindowInsetBottom();
        ph1Var.Y.setInsets(ph1Var.f42541r0);
        ph1Var.Z.setInsets(ph1Var.f42541r0);
        ph1Var.f42542s.requestLayout();
        ih1 ih1Var = ph1Var.f42537o0;
        if (ih1Var != null) {
            ih1Var.setBottomPadding(ph1Var.f42541r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f47114b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f44804a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ph1 ph1Var = this.f44805b;
                    AndroidUtilities.cancelRunOnUIThread(ph1Var.S0);
                    ph1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ph1Var.f42548w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ph1Var.f42539q0 = ph1Var.f42538p0;
                    ph1Var.G();
                    return;
                }
                return;
            default:
                ph1 ph1Var2 = this.f44805b;
                AndroidUtilities.cancelRunOnUIThread(ph1Var2.S0);
                ph1Var2.R0 = false;
                if (ph1Var2.f42510b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    ph1Var2.f42510b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    ph1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44804a) {
            case 0:
                hh1 hh1Var = this.f44805b.f42545u0;
                if (hh1Var != null) {
                    hh1Var.b();
                    return;
                }
                return;
            default:
                this.f44805b.f42545u0.b();
                return;
        }
    }
}
