package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class zy0 extends AnimatorListenerAdapter {
    public final ProfileActivity f44244a;

    public zy0(ProfileActivity profileActivity) {
        this.f44244a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f44244a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (profileActivity.f33996q2) {
            w02 = 1090519039;
        } else if (profileActivity.S5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21220f8, profileActivity.A0);
        }
        kVar.A(w02, false);
        vy0 vy0Var = profileActivity.f33920f0;
        ImageReceiver imageReceiver = vy0Var.U;
        org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(vy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = vy0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            vy0Var.W = null;
        }
        vy0Var.V = 0.0f;
        vy0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.p5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
