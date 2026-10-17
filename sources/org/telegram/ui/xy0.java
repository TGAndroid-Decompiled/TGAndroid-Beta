package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class xy0 extends AnimatorListenerAdapter {
    public final ProfileActivity f43292a;

    public xy0(ProfileActivity profileActivity) {
        this.f43292a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f43292a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f33682q2) {
            w02 = 1090519039;
        } else if (profileActivity.S5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21023f8, profileActivity.A0);
        }
        kVar.B(w02, false);
        ty0 ty0Var = profileActivity.f33606f0;
        ImageReceiver imageReceiver = ty0Var.U;
        org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(ty0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = ty0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            ty0Var.W = null;
        }
        ty0Var.V = 0.0f;
        ty0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
