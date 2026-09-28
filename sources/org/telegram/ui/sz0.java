package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f37897a;
    public final ProfileActivity f37898b;

    public sz0(ProfileActivity profileActivity, int i10) {
        this.f37897a = i10;
        this.f37898b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37897a) {
            case 2:
                ProfileActivity profileActivity = this.f37898b;
                profileActivity.O1 = false;
                profileActivity.f31524a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37897a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37898b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37898b;
                AnimatorSet animatorSet = profileActivity.f31678w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31678w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37898b;
                profileActivity2.O1 = false;
                profileActivity2.f31524a.N0 = true;
                profileActivity2.f31592j2.removeListener(this);
                profileActivity2.f31548d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31615n0.setVisibility(0);
                profileActivity2.f31615n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37898b;
                profileActivity3.f31592j2.removeListener(this);
                profileActivity3.f31615n0.setVisibility(8);
                profileActivity3.f31615n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37898b;
                profileActivity4.f31679w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37897a) {
            case 2:
                ProfileActivity profileActivity = this.f37898b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31615n0.setAnimatedFileMaybe(profileActivity.f31554e0.getImageReceiver().getAnimation());
                profileActivity.f31615n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
