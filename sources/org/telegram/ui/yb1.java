package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yb1 extends AnimatorListenerAdapter {
    public final int f52075a;
    public final ic1 f52076b;

    public yb1(ic1 ic1Var, int i7) {
        this.f52075a = i7;
        this.f52076b = ic1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.f52075a;
        ic1 ic1Var = this.f52076b;
        switch (i7) {
            case 0:
                ic1Var.f46591h1 = null;
                ic1Var.f46584e1 = 1.0f;
                ic1Var.X0 = 0.0f;
                ic1Var.Y0 = 0.0f;
                ic1Var.f46606s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.e2.d().f39260a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new tu0(this, 26), 200L);
                return;
            case 2:
                ic1Var.K0.e();
                ic1Var.Y.setCornerRadius(-1.0f);
                ic1Var.D0 = false;
                ic1Var.Y.f39487b0 = false;
                ic1Var.f46602p0 = ic1Var.f46601o0;
                ic1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.l9 l9Var : ic1Var.V) {
                    org.telegram.ui.Components.i5 i5Var = l9Var.f35650e;
                    if (i5Var != null && (z2Var = i5Var.f34568k) != null) {
                        z2Var.f21220t0 = true;
                        z2Var.P0(false);
                    }
                }
                return;
            case 4:
                ic1Var.s();
                for (org.telegram.ui.Components.l9 l9Var2 : ic1Var.V) {
                    org.telegram.ui.Components.i5 i5Var2 = l9Var2.f35650e;
                    if (i5Var2 != null && (z2Var2 = i5Var2.f34568k) != null) {
                        z2Var2.f21220t0 = false;
                        z2Var2.Q0();
                    }
                }
                ic1Var.R.setVisibility(8);
                return;
            case 5:
                ic1Var.E.setText(org.telegram.messenger.id.M0(2131743490, null));
                ic1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (ic1Var.Z.getTag() == null) {
                    ic1Var.Z.setVisibility(8);
                    return;
                }
                return;
            case 7:
                ic1Var.Y.setTranslationX(0.0f);
                ic1Var.Y.setTranslationY(0.0f);
                ic1Var.Y.setScaleY(1.0f);
                ic1Var.Y.setScaleX(1.0f);
                ic1Var.Y.setVisibility(8);
                return;
            case 8:
                ic1Var.D.setVisibility(8);
                return;
            default:
                ic1Var.f46583e0.setVisibility(8);
                return;
        }
    }
}
