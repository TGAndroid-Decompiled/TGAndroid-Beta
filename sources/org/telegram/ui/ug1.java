package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ug1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final int f42428a;
    public final nh1 f42429b;

    public ug1(nh1 nh1Var, int i10) {
        this.f42428a = i10;
        this.f42429b = nh1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        nh1 nh1Var = this.f42429b;
        nh1Var.f39860r0 = g10;
        ((FrameLayout.LayoutParams) nh1Var.f39848j0.getLayoutParams()).bottomMargin = nh1Var.f39860r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) nh1Var.f39837e0.getLayoutParams()).bottomMargin = nh1Var.f39860r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) nh1Var.H.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) nh1Var.I.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) nh1Var.K.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) nh1Var.X.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) nh1Var.N.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) nh1Var.f39870y.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) nh1Var.O.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) nh1Var.R.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) nh1Var.Q.getLayoutParams()).topMargin = nh1Var.f39860r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) nh1Var.Z.getLayoutParams()).bottomMargin = nh1Var.f39860r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) nh1Var.M0.getLayoutParams()).bottomMargin = nh1Var.f39860r0.getSystemWindowInsetBottom();
        nh1Var.Y.setInsets(nh1Var.f39860r0);
        nh1Var.Z.setInsets(nh1Var.f39860r0);
        nh1Var.f39861s.requestLayout();
        gh1 gh1Var = nh1Var.f39856o0;
        if (gh1Var != null) {
            gh1Var.setBottomPadding(nh1Var.f39860r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f45249b;
    }

    @Override
    public void f(org.telegram.ui.Components.voip.h3 h3Var) {
        int i10;
        switch (this.f42428a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    nh1 nh1Var = this.f42429b;
                    AndroidUtilities.cancelRunOnUIThread(nh1Var.S0);
                    nh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (nh1Var.f39867w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        h3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    nh1Var.f39858q0 = nh1Var.f39857p0;
                    nh1Var.G();
                    return;
                }
                return;
            default:
                nh1 nh1Var2 = this.f42429b;
                AndroidUtilities.cancelRunOnUIThread(nh1Var2.S0);
                nh1Var2.R0 = false;
                if (nh1Var2.f39829b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    nh1Var2.f39829b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    nh1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f42428a) {
            case 0:
                fh1 fh1Var = this.f42429b.f39864u0;
                if (fh1Var != null) {
                    fh1Var.b();
                    return;
                }
                return;
            default:
                this.f42429b.f39864u0.b();
                return;
        }
    }
}
