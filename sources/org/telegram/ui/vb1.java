package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb1 extends AnimatorListenerAdapter {
    public final int f50633a;
    public final fc1 f50634b;

    public vb1(fc1 fc1Var, int i7) {
        this.f50633a = i7;
        this.f50634b = fc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.f50633a;
        fc1 fc1Var = this.f50634b;
        switch (i7) {
            case 0:
                fc1Var.f45559h1 = null;
                fc1Var.f45552e1 = 1.0f;
                fc1Var.X0 = 0.0f;
                fc1Var.Y0 = 0.0f;
                fc1Var.f45574s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.e2.d().f39171a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new ru0(this, 26), 200L);
                return;
            case 2:
                fc1Var.K0.e();
                fc1Var.Y.setCornerRadius(-1.0f);
                fc1Var.D0 = false;
                fc1Var.Y.f39398b0 = false;
                fc1Var.f45570p0 = fc1Var.f45569o0;
                fc1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.l9 l9Var : fc1Var.V) {
                    org.telegram.ui.Components.i5 i5Var = l9Var.f35603e;
                    if (i5Var != null && (z2Var = i5Var.f34541k) != null) {
                        z2Var.f21220t0 = true;
                        z2Var.P0(false);
                    }
                }
                return;
            case 4:
                fc1Var.s();
                for (org.telegram.ui.Components.l9 l9Var2 : fc1Var.V) {
                    org.telegram.ui.Components.i5 i5Var2 = l9Var2.f35603e;
                    if (i5Var2 != null && (z2Var2 = i5Var2.f34541k) != null) {
                        z2Var2.f21220t0 = false;
                        z2Var2.Q0();
                    }
                }
                fc1Var.R.setVisibility(8);
                return;
            case 5:
                fc1Var.E.setText(org.telegram.messenger.id.M0(2131743493, null));
                fc1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (fc1Var.Z.getTag() == null) {
                    fc1Var.Z.setVisibility(8);
                    return;
                }
                return;
            case 7:
                fc1Var.Y.setTranslationX(0.0f);
                fc1Var.Y.setTranslationY(0.0f);
                fc1Var.Y.setScaleY(1.0f);
                fc1Var.Y.setScaleX(1.0f);
                fc1Var.Y.setVisibility(8);
                return;
            case 8:
                fc1Var.D.setVisibility(8);
                return;
            default:
                fc1Var.f45551e0.setVisibility(8);
                return;
        }
    }
}
