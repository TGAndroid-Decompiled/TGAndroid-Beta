package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class yh1 extends AnimatorListenerAdapter {
    public final int f40217a;
    public final ki1 f40218b;

    public yh1(ki1 ki1Var, int i10) {
        this.f40217a = i10;
        this.f40218b = ki1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ai.l4 l4Var2;
        switch (this.f40217a) {
            case 0:
                ki1 ki1Var = this.f40218b;
                ki1Var.f35065i1 = null;
                ki1Var.f35059f1 = 1.0f;
                ki1Var.Y0 = 0.0f;
                ki1Var.Z0 = 0.0f;
                ki1Var.f35079s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f29447a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new xz0(this, 23), 200L);
                return;
            case 2:
                ki1 ki1Var2 = this.f40218b;
                ki1Var2.L0.unlock();
                ki1Var2.Y.setCornerRadius(-1.0f);
                ki1Var2.E0 = false;
                ki1Var2.Y.f29635b0 = false;
                ki1Var2.f35076q0 = ki1Var2.f35075p0;
                ki1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f40218b.V) {
                    org.telegram.ui.Components.q5 q5Var = w9Var.e;
                    if (q5Var != null && (l4Var = q5Var.f27595k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        w9Var.e.f27595k.startAnimation();
                    }
                }
                return;
            case 4:
                ki1 ki1Var3 = this.f40218b;
                ki1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : ki1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.f27595k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.e.f27595k.stopAnimation();
                    }
                }
                ki1Var3.R.setVisibility(8);
                return;
            case 5:
                ki1 ki1Var4 = this.f40218b;
                if (ki1Var4.Z.getTag() == null) {
                    ki1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ki1 ki1Var5 = this.f40218b;
                ki1Var5.Y.setTranslationX(0.0f);
                ki1Var5.Y.setTranslationY(0.0f);
                ki1Var5.Y.setScaleY(1.0f);
                ki1Var5.Y.setScaleX(1.0f);
                ki1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f40218b.f35088y.setVisibility(8);
                return;
            default:
                this.f40218b.f35055e0.setVisibility(8);
                return;
        }
    }
}
