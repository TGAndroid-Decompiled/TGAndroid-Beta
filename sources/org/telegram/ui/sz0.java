package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f37896a;
    public final ProfileActivity f37897b;

    public sz0(ProfileActivity profileActivity, int i10) {
        this.f37896a = i10;
        this.f37897b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37896a) {
            case 2:
                ProfileActivity profileActivity = this.f37897b;
                profileActivity.O1 = false;
                profileActivity.f31523a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37896a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37897b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37897b;
                AnimatorSet animatorSet = profileActivity.f31677w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31677w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37897b;
                profileActivity2.O1 = false;
                profileActivity2.f31523a.N0 = true;
                profileActivity2.f31591j2.removeListener(this);
                profileActivity2.f31547d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31614n0.setVisibility(0);
                profileActivity2.f31614n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37897b;
                profileActivity3.f31591j2.removeListener(this);
                profileActivity3.f31614n0.setVisibility(8);
                profileActivity3.f31614n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37897b;
                profileActivity4.f31678w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37896a) {
            case 2:
                ProfileActivity profileActivity = this.f37897b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31614n0.setAnimatedFileMaybe(profileActivity.f31553e0.getImageReceiver().getAnimation());
                profileActivity.f31614n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
