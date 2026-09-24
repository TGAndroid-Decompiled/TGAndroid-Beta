package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f37880a;
    public final ProfileActivity f37881b;

    public sz0(ProfileActivity profileActivity, int i10) {
        this.f37880a = i10;
        this.f37881b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37880a) {
            case 2:
                ProfileActivity profileActivity = this.f37881b;
                profileActivity.O1 = false;
                profileActivity.f31510a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37880a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37881b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37881b;
                AnimatorSet animatorSet = profileActivity.f31664w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31664w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37881b;
                profileActivity2.O1 = false;
                profileActivity2.f31510a.N0 = true;
                profileActivity2.f31578j2.removeListener(this);
                profileActivity2.f31534d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31601n0.setVisibility(0);
                profileActivity2.f31601n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37881b;
                profileActivity3.f31578j2.removeListener(this);
                profileActivity3.f31601n0.setVisibility(8);
                profileActivity3.f31601n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37881b;
                profileActivity4.f31665w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37880a) {
            case 2:
                ProfileActivity profileActivity = this.f37881b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31601n0.setAnimatedFileMaybe(profileActivity.f31540e0.getImageReceiver().getAnimation());
                profileActivity.f31601n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
