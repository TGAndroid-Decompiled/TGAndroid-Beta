package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends AnimatorListenerAdapter {
    public final int f37655a;
    public final boolean f37656b;
    public final ProfileActivity f37657c;

    public qz0(ProfileActivity profileActivity, boolean z4, int i10) {
        this.f37655a = i10;
        this.f37657c = profileActivity;
        this.f37656b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37655a) {
            case 1:
                this.f37657c.f32018c0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.x3 x3Var;
        switch (this.f37655a) {
            case 0:
                ProfileActivity profileActivity = this.f37657c;
                boolean z4 = this.f37656b;
                ProfileActivity.n1(profileActivity, z4);
                profileActivity.V.setClickable(true);
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    if (w0Var.C.getWidth() != 0 && !w0Var.e.isFocused()) {
                        w0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.e);
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
                ProfileActivity profileActivity2 = this.f37657c;
                if (profileActivity2.f32018c0 != null && (x3Var = profileActivity2.f32024d0) != null) {
                    if (!this.f37656b) {
                        x3Var.setVisibility(4);
                    }
                    profileActivity2.f32018c0 = null;
                    return;
                }
                return;
        }
    }
}
