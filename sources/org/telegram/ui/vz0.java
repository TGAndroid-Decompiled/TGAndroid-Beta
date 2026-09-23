package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class vz0 extends AnimatorListenerAdapter {
    public final int f38496a;
    public final boolean f38497b;
    public final ProfileActivity f38498c;

    public vz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f38496a = i10;
        this.f38498c = profileActivity;
        this.f38497b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38496a) {
            case 1:
                this.f38498c.f31247f0 = null;
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
        switch (this.f38496a) {
            case 0:
                ProfileActivity profileActivity = this.f38498c;
                boolean z10 = this.f38497b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.e.isFocused()) {
                        v0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f38498c;
                if (profileActivity2.f31247f0 != null && (z3Var = profileActivity2.f31254g0) != null) {
                    if (!this.f38497b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f31247f0 = null;
                    return;
                }
                return;
        }
    }
}
