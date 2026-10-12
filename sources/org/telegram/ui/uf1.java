package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class uf1 extends AnimatorListenerAdapter {
    public final int f40672a;
    public final boolean f40673b;
    public final lg1 f40674c;

    public uf1(lg1 lg1Var, boolean z10, int i10) {
        this.f40672a = i10;
        this.f40674c = lg1Var;
        this.f40673b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f40672a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f40673b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                lg1 lg1Var = this.f40674c;
                lg1Var.S0(f7);
                if (z10) {
                    lg1Var.f37989q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = lg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) lg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                lg1Var.f37991r0.setVisibility(8);
                lg1Var.Q0(true);
                return;
            default:
                if (!this.f40673b) {
                    this.f40674c.f37987o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
