package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class sb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.p1, r0.m, org.telegram.ui.Components.voip.c3 {
    public final int f51961a;
    public final hc1 f51962b;

    public sb1(hc1 hc1Var, int i7) {
        this.f51961a = i7;
        this.f51962b = hc1Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        hc1 hc1Var = this.f51962b;
        hc1Var.f48286r0 = g10;
        ((FrameLayout.LayoutParams) hc1Var.f48275j0.getLayoutParams()).bottomMargin = hc1Var.f48286r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hc1Var.f48267f0.getLayoutParams()).bottomMargin = hc1Var.f48286r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hc1Var.I.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hc1Var.J.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hc1Var.L.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) hc1Var.Y.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) hc1Var.O.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) hc1Var.E.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) hc1Var.P.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hc1Var.S.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) hc1Var.R.getLayoutParams()).topMargin = hc1Var.f48286r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) hc1Var.f48253a0.getLayoutParams()).bottomMargin = hc1Var.f48286r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hc1Var.M0.getLayoutParams()).bottomMargin = hc1Var.f48286r0.getSystemWindowInsetBottom();
        hc1Var.Z.setInsets(hc1Var.f48286r0);
        hc1Var.f48253a0.setInsets(hc1Var.f48286r0);
        hc1Var.f48287s.requestLayout();
        bc1 bc1Var = hc1Var.f48282o0;
        if (bc1Var != null) {
            bc1Var.setBottomPadding(hc1Var.f48286r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f56257b;
    }

    @Override
    public void g(org.telegram.ui.Components.voip.d3 d3Var) {
        int i7;
        int i10 = this.f51961a;
        hc1 hc1Var = this.f51962b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(hc1Var.S0);
                    hc1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (hc1Var.f48293w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754729;
                        } else {
                            i7 = 2131754728;
                        }
                        d3Var.announceForAccessibility(org.telegram.messenger.gd.M0(i7, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    hc1Var.f48284q0 = hc1Var.f48283p0;
                    hc1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(hc1Var.S0);
                hc1Var.R0 = false;
                if (hc1Var.f48255b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    hc1Var.f48255b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    hc1Var.t();
                    return;
                }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f51962b.f48290u0.b();
    }
}
