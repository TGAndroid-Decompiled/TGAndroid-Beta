package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class vg1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final int f42770a;
    public final oh1 f42771b;

    public vg1(oh1 oh1Var, int i10) {
        this.f42770a = i10;
        this.f42771b = oh1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        oh1 oh1Var = this.f42771b;
        oh1Var.f40197r0 = g10;
        ((FrameLayout.LayoutParams) oh1Var.f40185j0.getLayoutParams()).bottomMargin = oh1Var.f40197r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.f40174e0.getLayoutParams()).bottomMargin = oh1Var.f40197r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.H.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.I.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.K.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) oh1Var.X.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) oh1Var.N.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) oh1Var.f40207y.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) oh1Var.O.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) oh1Var.R.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) oh1Var.Q.getLayoutParams()).topMargin = oh1Var.f40197r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) oh1Var.Z.getLayoutParams()).bottomMargin = oh1Var.f40197r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) oh1Var.M0.getLayoutParams()).bottomMargin = oh1Var.f40197r0.getSystemWindowInsetBottom();
        oh1Var.Y.setInsets(oh1Var.f40197r0);
        oh1Var.Z.setInsets(oh1Var.f40197r0);
        oh1Var.f40198s.requestLayout();
        hh1 hh1Var = oh1Var.f40193o0;
        if (hh1Var != null) {
            hh1Var.setBottomPadding(oh1Var.f40197r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f45250b;
    }

    @Override
    public void f(org.telegram.ui.Components.voip.h3 h3Var) {
        int i10;
        switch (this.f42770a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    oh1 oh1Var = this.f42771b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.S0);
                    oh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (oh1Var.f40204w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        h3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    oh1Var.f40195q0 = oh1Var.f40194p0;
                    oh1Var.G();
                    return;
                }
                return;
            default:
                oh1 oh1Var2 = this.f42771b;
                AndroidUtilities.cancelRunOnUIThread(oh1Var2.S0);
                oh1Var2.R0 = false;
                if (oh1Var2.f40166b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    oh1Var2.f40166b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    oh1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f42770a) {
            case 0:
                gh1 gh1Var = this.f42771b.f40201u0;
                if (gh1Var != null) {
                    gh1Var.b();
                    return;
                }
                return;
            default:
                this.f42771b.f40201u0.b();
                return;
        }
    }
}
