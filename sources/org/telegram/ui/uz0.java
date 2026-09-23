package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class uz0 extends AnimatorListenerAdapter {
    public final int f38240a;
    public final ProfileActivity f38241b;

    public uz0(ProfileActivity profileActivity, int i10) {
        this.f38240a = i10;
        this.f38241b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38240a) {
            case 2:
                ProfileActivity profileActivity = this.f38241b;
                profileActivity.O1 = false;
                profileActivity.f31209a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38240a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f38241b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f38241b;
                AnimatorSet animatorSet = profileActivity.f31363w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31363w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f38241b;
                profileActivity2.O1 = false;
                profileActivity2.f31209a.N0 = true;
                profileActivity2.f31277j2.removeListener(this);
                profileActivity2.f31233d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31300n0.setVisibility(0);
                profileActivity2.f31300n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f38241b;
                profileActivity3.f31277j2.removeListener(this);
                profileActivity3.f31300n0.setVisibility(8);
                profileActivity3.f31300n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f38241b;
                profileActivity4.f31364w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38240a) {
            case 2:
                ProfileActivity profileActivity = this.f38241b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31300n0.setAnimatedFileMaybe(profileActivity.f31239e0.getImageReceiver().getAnimation());
                profileActivity.f31300n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
