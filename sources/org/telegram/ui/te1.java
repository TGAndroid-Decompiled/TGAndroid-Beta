package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class te1 extends AnimatorListenerAdapter {
    public final int f38646a;
    public final boolean f38647b;
    public final kf1 f38648c;

    public te1(kf1 kf1Var, boolean z4, int i10) {
        this.f38646a = i10;
        this.f38648c = kf1Var;
        this.f38647b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        int i10;
        switch (this.f38646a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z4 = this.f38647b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                kf1 kf1Var = this.f38648c;
                kf1Var.S0(f10);
                if (z4) {
                    kf1Var.f35695n0.setVisibility(8);
                    return;
                }
                Activity parentActivity = kf1Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) kf1Var).classGuid;
                AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                kf1Var.f35696o0.setVisibility(8);
                kf1Var.Q0(true);
                return;
            default:
                if (!this.f38647b) {
                    this.f38648c.f35693l0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
