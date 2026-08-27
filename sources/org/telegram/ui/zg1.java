package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class zg1 extends AnimatorListenerAdapter {

    public final int f45181a;

    public final lh1 f45182b;

    public zg1(lh1 lh1Var, int i10) {
        this.f45181a = i10;
        this.f45182b = lh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jh.y2 y2Var;
        jh.y2 y2Var2;
        switch (this.f45181a) {
            case 0:
                lh1 lh1Var = this.f45182b;
                lh1Var.f40102e1 = null;
                lh1Var.f40094b1 = 1.0f;
                lh1Var.U0 = 0.0f;
                lh1Var.V0 = 0.0f;
                lh1Var.f40122s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.l2.k().f33702a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ky0(this, 25), 200L);
                break;
            case 2:
                lh1 lh1Var2 = this.f45182b;
                lh1Var2.H0.unlock();
                lh1Var2.U.setCornerRadius(-1.0f);
                lh1Var2.A0 = false;
                lh1Var2.U.U = false;
                lh1Var2.m0 = lh1Var2.f40114l0;
                lh1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.n9 n9Var : this.f45182b.R) {
                    org.telegram.ui.Components.k5 k5Var = n9Var.f30901e;
                    if (k5Var != null && (y2Var = k5Var.f29961k) != null) {
                        y2Var.setAllowStartAnimation(true);
                        n9Var.f30901e.f29961k.startAnimation();
                    }
                }
                break;
            case 4:
                lh1 lh1Var3 = this.f45182b;
                lh1Var3.B();
                for (org.telegram.ui.Components.n9 n9Var2 : lh1Var3.R) {
                    org.telegram.ui.Components.k5 k5Var2 = n9Var2.f30901e;
                    if (k5Var2 != null && (y2Var2 = k5Var2.f29961k) != null) {
                        y2Var2.setAllowStartAnimation(false);
                        n9Var2.f30901e.f29961k.stopAnimation();
                    }
                }
                lh1Var3.N.setVisibility(8);
                break;
            case 5:
                lh1 lh1Var4 = this.f45182b;
                if (lh1Var4.V.getTag() == null) {
                    lh1Var4.V.setVisibility(8);
                }
                break;
            case 6:
                lh1 lh1Var5 = this.f45182b;
                lh1Var5.U.setTranslationX(0.0f);
                lh1Var5.U.setTranslationY(0.0f);
                lh1Var5.U.setScaleY(1.0f);
                lh1Var5.U.setScaleX(1.0f);
                lh1Var5.U.setVisibility(8);
                break;
            case 7:
                this.f45182b.f40131y.setVisibility(8);
                break;
            default:
                this.f45182b.f40090a0.setVisibility(8);
                break;
        }
    }
}
