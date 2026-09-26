package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class tz0 extends AnimatorListenerAdapter {
    public final int f38257a;
    public final boolean f38258b;
    public final ProfileActivity f38259c;

    public tz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f38257a = i10;
        this.f38259c = profileActivity;
        this.f38258b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38257a) {
            case 1:
                this.f38259c.f31561f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.f38257a) {
            case 0:
                ProfileActivity profileActivity = this.f38259c;
                boolean z10 = this.f38258b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                        u0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(u0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f38259c;
                if (profileActivity2.f31561f0 != null && (z3Var = profileActivity2.f31568g0) != null) {
                    if (!this.f38258b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f31561f0 = null;
                    return;
                }
                return;
        }
    }
}
