package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class sb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final int f49859a;
    public final ic1 f49860b;

    public sb1(ic1 ic1Var, int i7) {
        this.f49859a = i7;
        this.f49860b = ic1Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ic1 ic1Var = this.f49860b;
        ic1Var.f46603q0 = g10;
        ((FrameLayout.LayoutParams) ic1Var.f46592i0.getLayoutParams()).bottomMargin = ic1Var.f46603q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ic1Var.f46583e0.getLayoutParams()).bottomMargin = ic1Var.f46603q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ic1Var.H.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ic1Var.I.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ic1Var.K.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) ic1Var.X.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) ic1Var.N.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) ic1Var.D.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) ic1Var.O.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ic1Var.R.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) ic1Var.Q.getLayoutParams()).topMargin = ic1Var.f46603q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) ic1Var.Z.getLayoutParams()).bottomMargin = ic1Var.f46603q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ic1Var.L0.getLayoutParams()).bottomMargin = ic1Var.f46603q0.getSystemWindowInsetBottom();
        ic1Var.Y.setInsets(ic1Var.f46603q0);
        ic1Var.Z.setInsets(ic1Var.f46603q0);
        ic1Var.f46606s.requestLayout();
        cc1 cc1Var = ic1Var.f46600n0;
        if (cc1Var != null) {
            cc1Var.setBottomPadding(ic1Var.f46603q0.getSystemWindowInsetBottom());
        }
        return r0.k1.f54213b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7;
        int i10 = this.f49859a;
        ic1 ic1Var = this.f49860b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(ic1Var.R0);
                    ic1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (ic1Var.f46610v0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754729;
                        } else {
                            i7 = 2131754728;
                        }
                        a3Var.announceForAccessibility(org.telegram.messenger.id.M0(i7, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    ic1Var.f46602p0 = ic1Var.f46601o0;
                    ic1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(ic1Var.R0);
                ic1Var.Q0 = false;
                if (ic1Var.f46574b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    ic1Var.f46574b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    ic1Var.t();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f49860b.f46608t0.b();
    }
}
