package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class yy0 extends AnimatorListenerAdapter {
    public final int f44979a;
    public final ProfileActivity f44980b;

    public yy0(ProfileActivity profileActivity, int i9) {
        this.f44979a = i9;
        this.f44980b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44979a) {
            case 2:
                ProfileActivity profileActivity = this.f44980b;
                profileActivity.K1 = false;
                profileActivity.f35918a.J0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44979a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f44980b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f44980b;
                AnimatorSet animatorSet = profileActivity.f36069w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f36069w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f44980b;
                profileActivity2.K1 = false;
                profileActivity2.f35918a.J0 = true;
                profileActivity2.f35958f2.removeListener(this);
                profileActivity2.Z0.setBackgroundColor(-16777216);
                profileActivity2.U.setVisibility(8);
                profileActivity2.f35984j0.setVisibility(0);
                profileActivity2.f35984j0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f44980b;
                profileActivity3.f35958f2.removeListener(this);
                profileActivity3.f35984j0.setVisibility(8);
                profileActivity3.f35984j0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f44980b;
                profileActivity4.f36046s0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44979a) {
            case 2:
                ProfileActivity profileActivity = this.f44980b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f35984j0.setAnimatedFileMaybe(profileActivity.f35919a0.getImageReceiver().getAnimation());
                profileActivity.f35984j0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
