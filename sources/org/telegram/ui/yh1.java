package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class yh1 extends AnimatorListenerAdapter {
    public final int f43237a;
    public final ki1 f43238b;

    public yh1(ki1 ki1Var, int i10) {
        this.f43237a = i10;
        this.f43238b = ki1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        ai.l4 l4Var2;
        switch (this.f43237a) {
            case 0:
                ki1 ki1Var = this.f43238b;
                ki1Var.f38040i1 = null;
                ki1Var.f38034f1 = 1.0f;
                ki1Var.Y0 = 0.0f;
                ki1Var.Z0 = 0.0f;
                ki1Var.f38054s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f32094a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new hz0(this, 25), 200L);
                return;
            case 2:
                ki1 ki1Var2 = this.f43238b;
                ki1Var2.L0.unlock();
                ki1Var2.Y.setCornerRadius(-1.0f);
                ki1Var2.E0 = false;
                ki1Var2.Y.f32296b0 = false;
                ki1Var2.f38051q0 = ki1Var2.f38050p0;
                ki1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f43238b.V) {
                    org.telegram.ui.Components.q5 q5Var = w9Var.f32567e;
                    if (q5Var != null && (l4Var = q5Var.f29935k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        w9Var.f32567e.f29935k.startAnimation();
                    }
                }
                return;
            case 4:
                ki1 ki1Var3 = this.f43238b;
                ki1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : ki1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.f32567e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.f29935k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.f32567e.f29935k.stopAnimation();
                    }
                }
                ki1Var3.R.setVisibility(8);
                return;
            case 5:
                ki1 ki1Var4 = this.f43238b;
                if (ki1Var4.Z.getTag() == null) {
                    ki1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ki1 ki1Var5 = this.f43238b;
                ki1Var5.Y.setTranslationX(0.0f);
                ki1Var5.Y.setTranslationY(0.0f);
                ki1Var5.Y.setScaleY(1.0f);
                ki1Var5.Y.setScaleX(1.0f);
                ki1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f43238b.f38063y.setVisibility(8);
                return;
            default:
                this.f43238b.f38030e0.setVisibility(8);
                return;
        }
    }
}
