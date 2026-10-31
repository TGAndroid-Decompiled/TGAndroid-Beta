package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class xw0 extends AnimatorListenerAdapter {
    public final int f43660a;
    public final boolean f43661b;
    public final ProfileActivity f43662c;

    public xw0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f43660a = i10;
        this.f43662c = profileActivity;
        this.f43661b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43660a) {
            case 1:
                this.f43662c.f33810f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.d4 d4Var;
        switch (this.f43660a) {
            case 0:
                ProfileActivity profileActivity = this.f43662c;
                boolean z10 = this.f43661b;
                ProfileActivity.x1(profileActivity, z10);
                profileActivity.X.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                    if (p5Var.F.getWidth() != 0 && !p5Var.e.isFocused()) {
                        p5Var.e.requestFocus();
                        org.telegram.messenger.i0.J3(p5Var.e);
                    }
                }
                profileActivity.x4(true);
                profileActivity.U1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.S4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).classGuid;
                    org.telegram.messenger.i0.Z2(parentActivity, i10);
                    profileActivity.O.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f43662c;
                if (profileActivity2.f33810f0 != null && (d4Var = profileActivity2.f33817g0) != null) {
                    if (!this.f43661b) {
                        d4Var.setVisibility(4);
                    }
                    profileActivity2.f33810f0 = null;
                    return;
                }
                return;
        }
    }
}
