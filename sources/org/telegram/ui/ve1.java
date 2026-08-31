package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class ve1 extends AnimatorListenerAdapter {
    public final int f42217a;
    public final boolean f42218b;
    public final mf1 f42219c;

    public ve1(mf1 mf1Var, boolean z4, int i10) {
        this.f42217a = i10;
        this.f42219c = mf1Var;
        this.f42218b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        switch (this.f42217a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z4 = this.f42218b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mf1 mf1Var = this.f42219c;
                mf1Var.S0(f10);
                if (z4) {
                    mf1Var.f39130n0.setVisibility(8);
                    return;
                }
                Activity parentActivity = mf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) mf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                mf1Var.f39131o0.setVisibility(8);
                mf1Var.Q0(true);
                return;
            default:
                if (!this.f42218b) {
                    this.f42219c.f39128l0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
