package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class wz0 extends AnimatorListenerAdapter {
    public final int f42738a;
    public final boolean f42739b;
    public final ProfileActivity f42740c;

    public wz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f42738a = i10;
        this.f42740c = profileActivity;
        this.f42739b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42738a) {
            case 1:
                this.f42740c.f34260f0 = null;
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
        switch (this.f42738a) {
            case 0:
                ProfileActivity profileActivity = this.f42740c;
                boolean z10 = this.f42739b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.f21584e.isFocused()) {
                        v0Var.f21584e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f21584e);
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
                ProfileActivity profileActivity2 = this.f42740c;
                if (profileActivity2.f34260f0 != null && (z3Var = profileActivity2.f34267g0) != null) {
                    if (!this.f42739b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f34260f0 = null;
                    return;
                }
                return;
        }
    }
}
