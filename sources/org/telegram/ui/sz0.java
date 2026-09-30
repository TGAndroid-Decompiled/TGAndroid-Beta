package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f38005a;
    public final ProfileActivity f38006b;

    public sz0(ProfileActivity profileActivity, int i10) {
        this.f38005a = i10;
        this.f38006b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38005a) {
            case 2:
                ProfileActivity profileActivity = this.f38006b;
                profileActivity.O1 = false;
                profileActivity.f31598a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38005a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f38006b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f38006b;
                AnimatorSet animatorSet = profileActivity.f31752w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31752w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f38006b;
                profileActivity2.O1 = false;
                profileActivity2.f31598a.N0 = true;
                profileActivity2.f31666j2.removeListener(this);
                profileActivity2.f31622d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31689n0.setVisibility(0);
                profileActivity2.f31689n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f38006b;
                profileActivity3.f31666j2.removeListener(this);
                profileActivity3.f31689n0.setVisibility(8);
                profileActivity3.f31689n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f38006b;
                profileActivity4.f31753w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38005a) {
            case 2:
                ProfileActivity profileActivity = this.f38006b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31689n0.setAnimatedFileMaybe(profileActivity.f31628e0.getImageReceiver().getAnimation());
                profileActivity.f31689n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
