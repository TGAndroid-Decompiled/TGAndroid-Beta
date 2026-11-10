package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class qv0 extends AnimatorListenerAdapter {
    public final int f49162a;
    public final boolean f49163b;
    public final ProfileActivity f49164c;

    public qv0(ProfileActivity profileActivity, boolean z9, int i7) {
        this.f49162a = i7;
        this.f49164c = profileActivity;
        this.f49163b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f49162a) {
            case 1:
                this.f49164c.f41728f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        org.telegram.ui.Cells.b4 b4Var;
        switch (this.f49162a) {
            case 0:
                ProfileActivity profileActivity = this.f49164c;
                boolean z9 = this.f49163b;
                ProfileActivity.y1(profileActivity, z9);
                profileActivity.X.setClickable(true);
                if (z9) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
                    if (g5Var.F.getWidth() != 0 && !g5Var.f28435e.isFocused()) {
                        g5Var.f28435e.requestFocus();
                        org.telegram.messenger.g0.K3(g5Var.f28435e);
                    }
                }
                profileActivity.B4(true);
                profileActivity.U1 = null;
                profileActivity.fragmentView.invalidate();
                if (z9) {
                    profileActivity.U4 = true;
                    profileActivity.W4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                    profileActivity.O.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f49164c;
                if (profileActivity2.f41728f0 != null && (b4Var = profileActivity2.f41735g0) != null) {
                    if (!this.f49163b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f41728f0 = null;
                    return;
                }
                return;
        }
    }
}
