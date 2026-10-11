package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class rz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f41544a;

    public rz0(ProfileActivity profileActivity) {
        this.f41544a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f41544a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (profileActivity.f34347p2) {
            w02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20824f8, profileActivity.f34414z0);
        }
        kVar.C(w02, false);
        nz0 nz0Var = profileActivity.f34270e0;
        ImageReceiver imageReceiver = nz0Var.U;
        org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(nz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = nz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            nz0Var.W = null;
        }
        nz0Var.V = 0.0f;
        nz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
