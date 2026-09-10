package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class rf1 extends AnimatorListenerAdapter {
    public final int f36358a;
    public final boolean f36359b;
    public final ig1 f36360c;

    public rf1(ig1 ig1Var, boolean z10, int i10) {
        this.f36358a = i10;
        this.f36360c = ig1Var;
        this.f36359b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f36358a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f36359b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ig1 ig1Var = this.f36360c;
                ig1Var.S0(f7);
                if (z10) {
                    ig1Var.f33713q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = ig1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                ig1Var.f33715r0.setVisibility(8);
                ig1Var.Q0(true);
                return;
            default:
                if (!this.f36359b) {
                    this.f36360c.f33711o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
