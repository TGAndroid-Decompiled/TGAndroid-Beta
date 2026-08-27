package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class zy0 extends AnimatorListenerAdapter {

    public final int f45278a;

    public final boolean f45279b;

    public final ProfileActivity f45280c;

    public zy0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f45278a = i10;
        this.f45280c = profileActivity;
        this.f45279b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45278a) {
            case 1:
                this.f45280c.f35928b0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Cells.w3 w3Var;
        switch (this.f45278a) {
            case 0:
                ProfileActivity profileActivity = this.f45280c;
                boolean z10 = this.f45279b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.U.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                    if (v0Var.B.getWidth() != 0 && !v0Var.f23859e.isFocused()) {
                        v0Var.f23859e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f23859e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.R1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Q4 = true;
                    profileActivity.F4();
                    AndroidUtilities.requestAdjustResize(profileActivity.getParentActivity(), ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid);
                    profileActivity.L.setPreventMoving(false);
                }
                break;
            default:
                ProfileActivity profileActivity2 = this.f45280c;
                if (profileActivity2.f35928b0 != null && (w3Var = profileActivity2.f35936c0) != null) {
                    if (!this.f45279b) {
                        w3Var.setVisibility(4);
                    }
                    profileActivity2.f35928b0 = null;
                    break;
                }
                break;
        }
    }
}
