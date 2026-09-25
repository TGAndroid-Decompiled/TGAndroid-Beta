package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sz0 extends AnimatorListenerAdapter {
    public final int f37898a;
    public final ProfileActivity f37899b;

    public sz0(ProfileActivity profileActivity, int i10) {
        this.f37898a = i10;
        this.f37899b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37898a) {
            case 2:
                ProfileActivity profileActivity = this.f37899b;
                profileActivity.O1 = false;
                profileActivity.f31525a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37898a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37899b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37899b;
                AnimatorSet animatorSet = profileActivity.f31679w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31679w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37899b;
                profileActivity2.O1 = false;
                profileActivity2.f31525a.N0 = true;
                profileActivity2.f31593j2.removeListener(this);
                profileActivity2.f31549d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31616n0.setVisibility(0);
                profileActivity2.f31616n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37899b;
                profileActivity3.f31593j2.removeListener(this);
                profileActivity3.f31616n0.setVisibility(8);
                profileActivity3.f31616n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37899b;
                profileActivity4.f31680w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37898a) {
            case 2:
                ProfileActivity profileActivity = this.f37899b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31616n0.setAnimatedFileMaybe(profileActivity.f31555e0.getImageReceiver().getAnimation());
                profileActivity.f31616n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
