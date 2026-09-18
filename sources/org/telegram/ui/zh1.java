package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class zh1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final int f40175a;
    public final si1 f40176b;

    public zh1(si1 si1Var, int i10) {
        this.f40175a = i10;
        this.f40176b = si1Var;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        si1 si1Var = this.f40176b;
        si1Var.f37329r0 = g10;
        ((FrameLayout.LayoutParams) si1Var.f37317j0.getLayoutParams()).bottomMargin = si1Var.f37329r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) si1Var.f37306e0.getLayoutParams()).bottomMargin = si1Var.f37329r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) si1Var.H.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) si1Var.I.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) si1Var.K.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) si1Var.X.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) si1Var.N.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) si1Var.f37339y.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) si1Var.O.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) si1Var.R.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) si1Var.Q.getLayoutParams()).topMargin = si1Var.f37329r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) si1Var.Z.getLayoutParams()).bottomMargin = si1Var.f37329r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) si1Var.M0.getLayoutParams()).bottomMargin = si1Var.f37329r0.getSystemWindowInsetBottom();
        si1Var.Y.setInsets(si1Var.f37329r0);
        si1Var.Z.setInsets(si1Var.f37329r0);
        si1Var.f37330s.requestLayout();
        li1 li1Var = si1Var.f37325o0;
        if (li1Var != null) {
            li1Var.setBottomPadding(si1Var.f37329r0.getSystemWindowInsetBottom());
        }
        return r0.m1.f42108b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40175a) {
            case 0:
                ki1 ki1Var = this.f40176b.f37333u0;
                if (ki1Var != null) {
                    ki1Var.b();
                    return;
                }
                return;
            default:
                this.f40176b.f37333u0.b();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f40175a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    si1 si1Var = this.f40176b;
                    AndroidUtilities.cancelRunOnUIThread(si1Var.S0);
                    si1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (si1Var.f37336w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    si1Var.f37327q0 = si1Var.f37326p0;
                    si1Var.H();
                    return;
                }
                return;
            default:
                si1.i(this.f40176b);
                return;
        }
    }
}
