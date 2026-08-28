package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class zy0 extends AnimatorListenerAdapter {
    public final int f45273a;
    public final boolean f45274b;
    public final ProfileActivity f45275c;

    public zy0(ProfileActivity profileActivity, boolean z10, int i9) {
        this.f45273a = i9;
        this.f45275c = profileActivity;
        this.f45274b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45273a) {
            case 1:
                this.f45275c.f35925b0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.f45273a) {
            case 0:
                ProfileActivity profileActivity = this.f45275c;
                boolean z10 = this.f45274b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.U.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                    if (w0Var.B.getWidth() != 0 && !w0Var.f23906e.isFocused()) {
                        w0Var.f23906e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.f23906e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.R1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Q4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i9);
                    profileActivity.L.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f45275c;
                if (profileActivity2.f35925b0 != null && (z3Var = profileActivity2.f35933c0) != null) {
                    if (!this.f45274b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f35925b0 = null;
                    return;
                }
                return;
        }
    }
}
