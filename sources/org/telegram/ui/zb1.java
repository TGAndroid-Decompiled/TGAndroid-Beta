package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zb1 extends AnimatorListenerAdapter {
    public final int f52402a;
    public final jc1 f52403b;

    public zb1(jc1 jc1Var, int i7) {
        this.f52402a = i7;
        this.f52403b = jc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.f52402a;
        jc1 jc1Var = this.f52403b;
        switch (i7) {
            case 0:
                jc1Var.f46927h1 = null;
                jc1Var.f46920e1 = 1.0f;
                jc1Var.X0 = 0.0f;
                jc1Var.Y0 = 0.0f;
                jc1Var.f46942s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.e2.d().f39180a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new uu0(this, 26), 200L);
                return;
            case 2:
                jc1Var.K0.e();
                jc1Var.Y.setCornerRadius(-1.0f);
                jc1Var.D0 = false;
                jc1Var.Y.f39407b0 = false;
                jc1Var.f46938p0 = jc1Var.f46937o0;
                jc1Var.y();
                return;
            case 3:
                for (org.telegram.ui.Components.k9 k9Var : jc1Var.V) {
                    org.telegram.ui.Components.h5 h5Var = k9Var.f35252e;
                    if (h5Var != null && (z2Var = h5Var.f34176k) != null) {
                        z2Var.f21225t0 = true;
                        z2Var.P0(false);
                    }
                }
                return;
            case 4:
                jc1Var.s();
                for (org.telegram.ui.Components.k9 k9Var2 : jc1Var.V) {
                    org.telegram.ui.Components.h5 h5Var2 = k9Var2.f35252e;
                    if (h5Var2 != null && (z2Var2 = h5Var2.f34176k) != null) {
                        z2Var2.f21225t0 = false;
                        z2Var2.Q0();
                    }
                }
                jc1Var.R.setVisibility(8);
                return;
            case 5:
                jc1Var.E.setText(org.telegram.messenger.id.M0(2131743490, null));
                jc1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (jc1Var.Z.getTag() == null) {
                    jc1Var.Z.setVisibility(8);
                    return;
                }
                return;
            case 7:
                jc1Var.Y.setTranslationX(0.0f);
                jc1Var.Y.setTranslationY(0.0f);
                jc1Var.Y.setScaleY(1.0f);
                jc1Var.Y.setScaleX(1.0f);
                jc1Var.Y.setVisibility(8);
                return;
            case 8:
                jc1Var.D.setVisibility(8);
                return;
            default:
                jc1Var.f46919e0.setVisibility(8);
                return;
        }
    }
}
