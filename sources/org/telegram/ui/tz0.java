package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class tz0 extends AnimatorListenerAdapter {
    public final int f38258a;
    public final boolean f38259b;
    public final ProfileActivity f38260c;

    public tz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f38258a = i10;
        this.f38260c = profileActivity;
        this.f38259b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38258a) {
            case 1:
                this.f38260c.f31562f0 = null;
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
        switch (this.f38258a) {
            case 0:
                ProfileActivity profileActivity = this.f38260c;
                boolean z10 = this.f38259b;
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
                ProfileActivity profileActivity2 = this.f38260c;
                if (profileActivity2.f31562f0 != null && (z3Var = profileActivity2.f31569g0) != null) {
                    if (!this.f38259b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f31562f0 = null;
                    return;
                }
                return;
        }
    }
}
