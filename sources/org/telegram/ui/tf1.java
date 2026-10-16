package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class tf1 extends AnimatorListenerAdapter {
    public final int f40102a;
    public final boolean f40103b;
    public final kg1 f40104c;

    public tf1(kg1 kg1Var, boolean z10, int i10) {
        this.f40102a = i10;
        this.f40104c = kg1Var;
        this.f40103b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        switch (this.f40102a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.f40103b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                kg1 kg1Var = this.f40104c;
                kg1Var.S0(f7);
                if (z10) {
                    kg1Var.f37412q0.setVisibility(8);
                    return;
                }
                Activity parentActivity = kg1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) kg1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                kg1Var.f37414r0.setVisibility(8);
                kg1Var.Q0(true);
                return;
            default:
                if (!this.f40103b) {
                    this.f40104c.f37410o0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
