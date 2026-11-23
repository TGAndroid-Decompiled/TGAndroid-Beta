package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xb1 extends AnimatorListenerAdapter {
    public final int f53824a;
    public final hc1 f53825b;

    public xb1(hc1 hc1Var, int i7) {
        this.f53824a = i7;
        this.f53825b = hc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fi.s2 s2Var;
        fi.s2 s2Var2;
        int i7 = this.f53824a;
        hc1 hc1Var = this.f53825b;
        switch (i7) {
            case 0:
                hc1Var.f48352i1 = null;
                hc1Var.f48346f1 = 1.0f;
                hc1Var.Y0 = 0.0f;
                hc1Var.Z0 = 0.0f;
                hc1Var.f48365s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.h2.d().f41039a.setAlpha(1.0f);
                org.telegram.messenger.g0.h3(new ru0(this, 26), 200L);
                return;
            case 2:
                hc1Var.L0.e();
                hc1Var.Z.setCornerRadius(-1.0f);
                hc1Var.E0 = false;
                hc1Var.Z.f41281c0 = false;
                hc1Var.f48362q0 = hc1Var.f48361p0;
                hc1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.q9 q9Var : hc1Var.W) {
                    org.telegram.ui.Components.p5 p5Var = q9Var.f38839e;
                    if (p5Var != null && (s2Var = p5Var.f38500k) != null) {
                        s2Var.f22695u0 = true;
                        s2Var.P0(false);
                    }
                }
                return;
            case 4:
                hc1Var.s();
                for (org.telegram.ui.Components.q9 q9Var2 : hc1Var.W) {
                    org.telegram.ui.Components.p5 p5Var2 = q9Var2.f38839e;
                    if (p5Var2 != null && (s2Var2 = p5Var2.f38500k) != null) {
                        s2Var2.f22695u0 = false;
                        s2Var2.Q0();
                    }
                }
                hc1Var.S.setVisibility(8);
                return;
            case 5:
                hc1Var.F.setText(org.telegram.messenger.hd.N0(2131743245, null));
                hc1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (hc1Var.f48331a0.getTag() == null) {
                    hc1Var.f48331a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                hc1Var.Z.setTranslationX(0.0f);
                hc1Var.Z.setTranslationY(0.0f);
                hc1Var.Z.setScaleY(1.0f);
                hc1Var.Z.setScaleX(1.0f);
                hc1Var.Z.setVisibility(8);
                return;
            case 8:
                hc1Var.E.setVisibility(8);
                return;
            default:
                hc1Var.f48345f0.setVisibility(8);
                return;
        }
    }
}
