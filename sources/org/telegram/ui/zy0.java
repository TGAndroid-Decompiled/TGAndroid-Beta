package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class zy0 extends AnimatorListenerAdapter {
    public final int f45354a;
    public final boolean f45355b;
    public final ProfileActivity f45356c;

    public zy0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f45354a = i10;
        this.f45356c = profileActivity;
        this.f45355b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45354a) {
            case 1:
                this.f45356c.f35992b0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.w3 w3Var;
        switch (this.f45354a) {
            case 0:
                ProfileActivity profileActivity = this.f45356c;
                boolean z10 = this.f45355b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.U.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                    if (w0Var.B.getWidth() != 0 && !w0Var.f23920e.isFocused()) {
                        w0Var.f23920e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.f23920e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.R1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Q4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.L.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f45356c;
                if (profileActivity2.f35992b0 != null && (w3Var = profileActivity2.f36000c0) != null) {
                    if (!this.f45355b) {
                        w3Var.setVisibility(4);
                    }
                    profileActivity2.f35992b0 = null;
                    return;
                }
                return;
        }
    }
}
