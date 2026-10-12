package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class uz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f42627a;

    public uz0(ProfileActivity profileActivity) {
        this.f42627a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f42627a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (profileActivity.f34158p2) {
            w02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20598f8, profileActivity.f34225z0);
        }
        kVar.D(w02, false);
        qz0 qz0Var = profileActivity.f34081e0;
        ImageReceiver imageReceiver = qz0Var.U;
        org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(qz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = qz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            qz0Var.W = null;
        }
        qz0Var.V = 0.0f;
        qz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
