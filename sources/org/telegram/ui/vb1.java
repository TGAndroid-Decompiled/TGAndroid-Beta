package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vb1 extends AnimatorListenerAdapter {
    public final int f52940a;
    public final fc1 f52941b;

    public vb1(fc1 fc1Var, int i7) {
        this.f52940a = i7;
        this.f52941b = fc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fi.s2 s2Var;
        fi.s2 s2Var2;
        int i7 = this.f52940a;
        fc1 fc1Var = this.f52941b;
        switch (i7) {
            case 0:
                fc1Var.f47774i1 = null;
                fc1Var.f47768f1 = 1.0f;
                fc1Var.Y0 = 0.0f;
                fc1Var.Z0 = 0.0f;
                fc1Var.f47787s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.i2.d().f40933a.setAlpha(1.0f);
                org.telegram.messenger.g0.h3(new qu0(this, 26), 200L);
                return;
            case 2:
                fc1Var.L0.e();
                fc1Var.Z.setCornerRadius(-1.0f);
                fc1Var.E0 = false;
                fc1Var.Z.f41176c0 = false;
                fc1Var.f47784q0 = fc1Var.f47783p0;
                fc1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : fc1Var.W) {
                    org.telegram.ui.Components.o5 o5Var = p9Var.f38432e;
                    if (o5Var != null && (s2Var = o5Var.f38028k) != null) {
                        s2Var.f22762u0 = true;
                        s2Var.Q0(false);
                    }
                }
                return;
            case 4:
                fc1Var.s();
                for (org.telegram.ui.Components.p9 p9Var2 : fc1Var.W) {
                    org.telegram.ui.Components.o5 o5Var2 = p9Var2.f38432e;
                    if (o5Var2 != null && (s2Var2 = o5Var2.f38028k) != null) {
                        s2Var2.f22762u0 = false;
                        s2Var2.R0();
                    }
                }
                fc1Var.S.setVisibility(8);
                return;
            case 5:
                fc1Var.F.setText(org.telegram.messenger.gd.N0(2131743240, null));
                fc1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (fc1Var.f47753a0.getTag() == null) {
                    fc1Var.f47753a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                fc1Var.Z.setTranslationX(0.0f);
                fc1Var.Z.setTranslationY(0.0f);
                fc1Var.Z.setScaleY(1.0f);
                fc1Var.Z.setScaleX(1.0f);
                fc1Var.Z.setVisibility(8);
                return;
            case 8:
                fc1Var.E.setVisibility(8);
                return;
            default:
                fc1Var.f47767f0.setVisibility(8);
                return;
        }
    }
}
