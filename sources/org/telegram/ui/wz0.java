package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class wz0 extends AnimatorListenerAdapter {
    public final int f42671a;
    public final boolean f42672b;
    public final ProfileActivity f42673c;

    public wz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f42671a = i10;
        this.f42673c = profileActivity;
        this.f42672b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42671a) {
            case 1:
                this.f42673c.f34247f0 = null;
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
        switch (this.f42671a) {
            case 0:
                ProfileActivity profileActivity = this.f42673c;
                boolean z10 = this.f42672b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.f21580e.isFocused()) {
                        v0Var.f21580e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f21580e);
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
                ProfileActivity profileActivity2 = this.f42673c;
                if (profileActivity2.f34247f0 != null && (z3Var = profileActivity2.f34254g0) != null) {
                    if (!this.f42672b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f34247f0 = null;
                    return;
                }
                return;
        }
    }
}
