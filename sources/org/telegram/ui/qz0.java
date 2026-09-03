package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends AnimatorListenerAdapter {
    public final int f40719a;
    public final boolean f40720b;
    public final ProfileActivity f40721c;

    public qz0(ProfileActivity profileActivity, boolean z4, int i10) {
        this.f40719a = i10;
        this.f40721c = profileActivity;
        this.f40720b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40719a) {
            case 1:
                this.f40721c.f34576c0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.f40719a) {
            case 0:
                ProfileActivity profileActivity = this.f40721c;
                boolean z4 = this.f40720b;
                ProfileActivity.n1(profileActivity, z4);
                profileActivity.V.setClickable(true);
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    if (w0Var.C.getWidth() != 0 && !w0Var.f22351e.isFocused()) {
                        w0Var.f22351e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.f22351e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.S1 = null;
                profileActivity.fragmentView.invalidate();
                if (z4) {
                    profileActivity.R4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.M.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f40721c;
                if (profileActivity2.f34576c0 != null && (y3Var = profileActivity2.f34582d0) != null) {
                    if (!this.f40720b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f34576c0 = null;
                    return;
                }
                return;
        }
    }
}
