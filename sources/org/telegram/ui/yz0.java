package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class yz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f42118a;

    public yz0(ProfileActivity profileActivity) {
        this.f42118a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f42118a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (profileActivity.f32338p2) {
            w02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19638f8, profileActivity.f32405z0);
        }
        kVar.C(w02, false);
        uz0 uz0Var = profileActivity.f32260e0;
        ImageReceiver imageReceiver = uz0Var.U;
        org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(uz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = uz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            uz0Var.W = null;
        }
        uz0Var.V = 0.0f;
        uz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
