package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ub1 extends AnimatorListenerAdapter {
    public final int f51902a;
    public final ec1 f51903b;

    public ub1(ec1 ec1Var, int i7) {
        this.f51902a = i7;
        this.f51903b = ec1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fi.u2 u2Var;
        fi.u2 u2Var2;
        int i7 = this.f51902a;
        ec1 ec1Var = this.f51903b;
        switch (i7) {
            case 0:
                ec1Var.f46703i1 = null;
                ec1Var.f46697f1 = 1.0f;
                ec1Var.Y0 = 0.0f;
                ec1Var.Z0 = 0.0f;
                ec1Var.f46716s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.i2.d().f40654a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new pu0(this, 26), 200L);
                return;
            case 2:
                ec1Var.L0.e();
                ec1Var.Z.setCornerRadius(-1.0f);
                ec1Var.E0 = false;
                ec1Var.Z.f40899c0 = false;
                ec1Var.f46713q0 = ec1Var.f46712p0;
                ec1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.i9 i9Var : ec1Var.W) {
                    org.telegram.ui.Components.g5 g5Var = i9Var.f35511e;
                    if (g5Var != null && (u2Var = g5Var.f34809k) != null) {
                        u2Var.f22301u0 = true;
                        u2Var.P0(false);
                    }
                }
                return;
            case 4:
                ec1Var.s();
                for (org.telegram.ui.Components.i9 i9Var2 : ec1Var.W) {
                    org.telegram.ui.Components.g5 g5Var2 = i9Var2.f35511e;
                    if (g5Var2 != null && (u2Var2 = g5Var2.f34809k) != null) {
                        u2Var2.f22301u0 = false;
                        u2Var2.Q0();
                    }
                }
                ec1Var.S.setVisibility(8);
                return;
            case 5:
                ec1Var.F.setText(org.telegram.messenger.hd.M0(2131743490, null));
                ec1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (ec1Var.f46682a0.getTag() == null) {
                    ec1Var.f46682a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                ec1Var.Z.setTranslationX(0.0f);
                ec1Var.Z.setTranslationY(0.0f);
                ec1Var.Z.setScaleY(1.0f);
                ec1Var.Z.setScaleX(1.0f);
                ec1Var.Z.setVisibility(8);
                return;
            case 8:
                ec1Var.E.setVisibility(8);
                return;
            default:
                ec1Var.f46696f0.setVisibility(8);
                return;
        }
    }
}
