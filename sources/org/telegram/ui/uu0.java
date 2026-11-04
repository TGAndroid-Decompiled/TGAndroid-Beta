package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class uu0 extends AnimatorListenerAdapter {
    public final int f50192a;
    public final ProfileActivity f50193b;

    public uu0(ProfileActivity profileActivity, int i3) {
        this.f50192a = i3;
        this.f50193b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50192a) {
            case 1:
                this.f50193b.P5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f50193b;
                profileActivity.O1 = false;
                profileActivity.f41719a.P0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pi.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        int i3 = this.f50192a;
        ProfileActivity profileActivity = this.f50193b;
        switch (i3) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.d2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                if (profileActivity.f41826p2) {
                    w02 = 1090519039;
                } else if (profileActivity.f41778h6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27919f8, profileActivity.A0);
                }
                kVar.C(w02, false);
                qu0 qu0Var = profileActivity.f41758f0;
                ImageReceiver imageReceiver = qu0Var.V;
                org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(qu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.cc ccVar = qu0Var.f48131a0;
                if (ccVar != null) {
                    ccVar.a();
                    qu0Var.f48131a0 = null;
                }
                qu0Var.W = 0.0f;
                qu0Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.L5(false);
                return;
            case 1:
                if (profileActivity.P5 != null && !profileActivity.S5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.Q5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f41796k5, 1.0f));
                    profileActivity.Q5.setDuration(100L);
                    profileActivity.Q5.addListener(new y20(this, 21));
                    profileActivity.Q5.start();
                }
                profileActivity.L5(false);
                profileActivity.P5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.T6;
                profileActivity.y4(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.f41873w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f41873w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.O1 = false;
                profileActivity.f41719a.P0 = true;
                profileActivity.f41787j2.removeListener(this);
                profileActivity.f41743d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.f41817o0.setVisibility(0);
                profileActivity.f41817o0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f41787j2.removeListener(this);
                profileActivity.f41817o0.setVisibility(8);
                profileActivity.f41817o0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f41882x0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f50192a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f50193b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f41817o0.setAnimatedFileMaybe(profileActivity.f41758f0.getImageReceiver().m());
                profileActivity.f41817o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
