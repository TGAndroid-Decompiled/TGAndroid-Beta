package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class xg1 extends AnimatorListenerAdapter {
    public final int f43119a;
    public final jh1 f43120b;

    public xg1(jh1 jh1Var, int i10) {
        this.f43119a = i10;
        this.f43120b = jh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ci.f3 f3Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ci.f3 f3Var2;
        switch (this.f43119a) {
            case 0:
                jh1 jh1Var = this.f43120b;
                jh1Var.f38193i1 = null;
                jh1Var.f38187f1 = 1.0f;
                jh1Var.Y0 = 0.0f;
                jh1Var.Z0 = 0.0f;
                jh1Var.f38207s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f31536a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new sy0(this, 24), 200L);
                return;
            case 2:
                jh1 jh1Var2 = this.f43120b;
                jh1Var2.L0.unlock();
                jh1Var2.Y.setCornerRadius(-1.0f);
                jh1Var2.E0 = false;
                jh1Var2.Y.f31728b0 = false;
                jh1Var2.f38204q0 = jh1Var2.f38203p0;
                jh1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f43120b.V) {
                    org.telegram.ui.Components.r5 r5Var = w9Var.e;
                    if (r5Var != null && (f3Var = r5Var.f29842k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        w9Var.e.f29842k.startAnimation();
                    }
                }
                return;
            case 4:
                jh1 jh1Var3 = this.f43120b;
                jh1Var3.A();
                for (org.telegram.ui.Components.w9 w9Var2 : jh1Var3.V) {
                    org.telegram.ui.Components.r5 r5Var2 = w9Var2.e;
                    if (r5Var2 != null && (f3Var2 = r5Var2.f29842k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        w9Var2.e.f29842k.stopAnimation();
                    }
                }
                jh1Var3.R.setVisibility(8);
                return;
            case 5:
                jh1 jh1Var4 = this.f43120b;
                if (jh1Var4.Z.getTag() == null) {
                    jh1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                jh1 jh1Var5 = this.f43120b;
                jh1Var5.Y.setTranslationX(0.0f);
                jh1Var5.Y.setTranslationY(0.0f);
                jh1Var5.Y.setScaleY(1.0f);
                jh1Var5.Y.setScaleX(1.0f);
                jh1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f43120b.f38216y.setVisibility(8);
                return;
            default:
                this.f43120b.f38183e0.setVisibility(8);
                return;
        }
    }
}
