package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class yy0 extends AnimatorListenerAdapter {

    public final int f44969a;

    public final ProfileActivity f44970b;

    public yy0(ProfileActivity profileActivity, int i10) {
        this.f44969a = i10;
        this.f44970b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44969a) {
            case 2:
                ProfileActivity profileActivity = this.f44970b;
                profileActivity.K1 = false;
                profileActivity.f35921a.J0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44969a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f44970b.k4(true);
                break;
            case 1:
                ProfileActivity profileActivity = this.f44970b;
                AnimatorSet animatorSet = profileActivity.f36072w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f36072w = null;
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = this.f44970b;
                profileActivity2.K1 = false;
                profileActivity2.f35921a.J0 = true;
                profileActivity2.f35961f2.removeListener(this);
                profileActivity2.Z0.setBackgroundColor(-16777216);
                profileActivity2.U.setVisibility(8);
                profileActivity2.f35987j0.setVisibility(0);
                profileActivity2.f35987j0.setAlpha(1.0f);
                break;
            case 3:
                ProfileActivity profileActivity3 = this.f44970b;
                profileActivity3.f35961f2.removeListener(this);
                profileActivity3.f35987j0.setVisibility(8);
                profileActivity3.f35987j0.setAlpha(1.0f);
                break;
            default:
                ProfileActivity profileActivity4 = this.f44970b;
                profileActivity4.f36049s0 = null;
                profileActivity4.fragmentView.invalidate();
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44969a) {
            case 2:
                ProfileActivity profileActivity = this.f44970b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f35987j0.setAnimatedFileMaybe(profileActivity.f35922a0.getImageReceiver().getAnimation());
                profileActivity.f35987j0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
