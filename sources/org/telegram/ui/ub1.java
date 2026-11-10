package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class ub1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final int f50455a;
    public final jc1 f50456b;

    public ub1(jc1 jc1Var, int i7) {
        this.f50455a = i7;
        this.f50456b = jc1Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        jc1 jc1Var = this.f50456b;
        jc1Var.f46939q0 = g10;
        ((FrameLayout.LayoutParams) jc1Var.f46928i0.getLayoutParams()).bottomMargin = jc1Var.f46939q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jc1Var.f46919e0.getLayoutParams()).bottomMargin = jc1Var.f46939q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jc1Var.H.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jc1Var.I.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jc1Var.K.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) jc1Var.X.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) jc1Var.N.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) jc1Var.D.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) jc1Var.O.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) jc1Var.R.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) jc1Var.Q.getLayoutParams()).topMargin = jc1Var.f46939q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) jc1Var.Z.getLayoutParams()).bottomMargin = jc1Var.f46939q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) jc1Var.L0.getLayoutParams()).bottomMargin = jc1Var.f46939q0.getSystemWindowInsetBottom();
        jc1Var.Y.setInsets(jc1Var.f46939q0);
        jc1Var.Z.setInsets(jc1Var.f46939q0);
        jc1Var.f46942s.requestLayout();
        dc1 dc1Var = jc1Var.f46936n0;
        if (dc1Var != null) {
            dc1Var.setBottomPadding(jc1Var.f46939q0.getSystemWindowInsetBottom());
        }
        return r0.k1.f54212b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7;
        int i10 = this.f50455a;
        jc1 jc1Var = this.f50456b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(jc1Var.R0);
                    jc1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (jc1Var.f46946v0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754729;
                        } else {
                            i7 = 2131754728;
                        }
                        a3Var.announceForAccessibility(org.telegram.messenger.id.M0(i7, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    jc1Var.f46938p0 = jc1Var.f46937o0;
                    jc1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(jc1Var.R0);
                jc1Var.Q0 = false;
                if (jc1Var.f46910b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    jc1Var.f46910b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    jc1Var.t();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f50456b.f46944t0.b();
    }
}
