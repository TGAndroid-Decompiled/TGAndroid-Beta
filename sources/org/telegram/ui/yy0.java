package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class yy0 extends AnimatorListenerAdapter {
    public final int f44988a;
    public final ProfileActivity f44989b;

    public yy0(ProfileActivity profileActivity, int i10) {
        this.f44988a = i10;
        this.f44989b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44988a) {
            case 2:
                ProfileActivity profileActivity = this.f44989b;
                profileActivity.K1 = false;
                profileActivity.f35984a.J0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44988a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f44989b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f44989b;
                AnimatorSet animatorSet = profileActivity.f36135w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f36135w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f44989b;
                profileActivity2.K1 = false;
                profileActivity2.f35984a.J0 = true;
                profileActivity2.f36023f2.removeListener(this);
                profileActivity2.Z0.setBackgroundColor(-16777216);
                profileActivity2.U.setVisibility(8);
                profileActivity2.f36049j0.setVisibility(0);
                profileActivity2.f36049j0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f44989b;
                profileActivity3.f36023f2.removeListener(this);
                profileActivity3.f36049j0.setVisibility(8);
                profileActivity3.f36049j0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f44989b;
                profileActivity4.f36111s0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44988a) {
            case 2:
                ProfileActivity profileActivity = this.f44989b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f36049j0.setAnimatedFileMaybe(profileActivity.f35985a0.getImageReceiver().getAnimation());
                profileActivity.f36049j0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
