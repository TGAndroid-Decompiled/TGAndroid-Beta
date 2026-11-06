package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ub1 extends AnimatorListenerAdapter {
    public final int f50366a;
    public final ec1 f50367b;

    public ub1(ec1 ec1Var, int i7) {
        this.f50366a = i7;
        this.f50367b = ec1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.f50366a;
        ec1 ec1Var = this.f50367b;
        switch (i7) {
            case 0:
                ec1Var.f45262h1 = null;
                ec1Var.f45255e1 = 1.0f;
                ec1Var.X0 = 0.0f;
                ec1Var.Y0 = 0.0f;
                ec1Var.f45277s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.e2.d().f39118a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new qu0(this, 26), 200L);
                return;
            case 2:
                ec1Var.K0.e();
                ec1Var.Y.setCornerRadius(-1.0f);
                ec1Var.D0 = false;
                ec1Var.Y.f39345b0 = false;
                ec1Var.f45273p0 = ec1Var.f45272o0;
                ec1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.l9 l9Var : ec1Var.V) {
                    org.telegram.ui.Components.i5 i5Var = l9Var.f35560e;
                    if (i5Var != null && (z2Var = i5Var.f34505k) != null) {
                        z2Var.f21217t0 = true;
                        z2Var.P0(false);
                    }
                }
                return;
            case 4:
                ec1Var.s();
                for (org.telegram.ui.Components.l9 l9Var2 : ec1Var.V) {
                    org.telegram.ui.Components.i5 i5Var2 = l9Var2.f35560e;
                    if (i5Var2 != null && (z2Var2 = i5Var2.f34505k) != null) {
                        z2Var2.f21217t0 = false;
                        z2Var2.Q0();
                    }
                }
                ec1Var.R.setVisibility(8);
                return;
            case 5:
                ec1Var.E.setText(org.telegram.messenger.hd.M0(2131743491, null));
                ec1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (ec1Var.Z.getTag() == null) {
                    ec1Var.Z.setVisibility(8);
                    return;
                }
                return;
            case 7:
                ec1Var.Y.setTranslationX(0.0f);
                ec1Var.Y.setTranslationY(0.0f);
                ec1Var.Y.setScaleY(1.0f);
                ec1Var.Y.setScaleX(1.0f);
                ec1Var.Y.setVisibility(8);
                return;
            case 8:
                ec1Var.D.setVisibility(8);
                return;
            default:
                ec1Var.f45254e0.setVisibility(8);
                return;
        }
    }
}
