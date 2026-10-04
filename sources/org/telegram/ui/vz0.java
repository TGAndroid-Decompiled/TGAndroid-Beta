package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class vz0 extends AnimatorListenerAdapter {
    public final int f41867a;
    public final ProfileActivity f41868b;

    public vz0(ProfileActivity profileActivity, int i10) {
        this.f41867a = i10;
        this.f41868b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41867a) {
            case 2:
                ProfileActivity profileActivity = this.f41868b;
                profileActivity.O1 = false;
                profileActivity.f34201a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41867a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f41868b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f41868b;
                AnimatorSet animatorSet = profileActivity.f34356w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34356w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f41868b;
                profileActivity2.O1 = false;
                profileActivity2.f34201a.N0 = true;
                profileActivity2.f34270j2.removeListener(this);
                profileActivity2.f34225d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f34293n0.setVisibility(0);
                profileActivity2.f34293n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f41868b;
                profileActivity3.f34270j2.removeListener(this);
                profileActivity3.f34293n0.setVisibility(8);
                profileActivity3.f34293n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f41868b;
                profileActivity4.f34357w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41867a) {
            case 2:
                ProfileActivity profileActivity = this.f41868b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34293n0.setAnimatedFileMaybe(profileActivity.f34232e0.getImageReceiver().getAnimation());
                profileActivity.f34293n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
