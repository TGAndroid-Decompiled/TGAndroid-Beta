package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ug1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.h3 {
    public final int f43257a;
    public final mh1 f43258b;

    public ug1(mh1 mh1Var, int i9) {
        this.f43257a = i9;
        this.f43258b = mh1Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        mh1 mh1Var = this.f43258b;
        mh1Var.f40455n0 = g10;
        ((FrameLayout.LayoutParams) mh1Var.f40443f0.getLayoutParams()).bottomMargin = mh1Var.f40455n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mh1Var.f40429a0.getLayoutParams()).bottomMargin = mh1Var.f40455n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mh1Var.D.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mh1Var.E.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mh1Var.G.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) mh1Var.T.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) mh1Var.J.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) mh1Var.f40470y.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) mh1Var.K.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mh1Var.N.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) mh1Var.M.getLayoutParams()).topMargin = mh1Var.f40455n0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) mh1Var.V.getLayoutParams()).bottomMargin = mh1Var.f40455n0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mh1Var.I0.getLayoutParams()).bottomMargin = mh1Var.f40455n0.getSystemWindowInsetBottom();
        mh1Var.U.setInsets(mh1Var.f40455n0);
        mh1Var.V.setInsets(mh1Var.f40455n0);
        mh1Var.f40461s.requestLayout();
        fh1 fh1Var = mh1Var.f40452k0;
        if (fh1Var != null) {
            fh1Var.setBottomPadding(mh1Var.f40455n0.getSystemWindowInsetBottom());
        }
        return r0.m1.f46928b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.i3 i3Var) {
        int i9;
        switch (this.f43257a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    mh1 mh1Var = this.f43258b;
                    AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
                    mh1Var.N0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (mh1Var.f40462s0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i9 = R.string.AccDescrVoipMicOff;
                        } else {
                            i9 = R.string.AccDescrVoipMicOn;
                        }
                        i3Var.announceForAccessibility(LocaleController.getString(i9));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    mh1Var.m0 = mh1Var.f40453l0;
                    mh1Var.H();
                    return;
                }
                return;
            default:
                mh1.i(this.f43258b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f43257a) {
            case 0:
                eh1 eh1Var = this.f43258b.f40458q0;
                if (eh1Var != null) {
                    eh1Var.b();
                    return;
                }
                return;
            default:
                this.f43258b.f40458q0.b();
                return;
        }
    }
}
