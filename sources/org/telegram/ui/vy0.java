package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class vy0 extends AnimatorListenerAdapter {
    public final ProfileActivity f42408a;

    public vy0(ProfileActivity profileActivity) {
        this.f42408a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f42408a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f33688q2) {
            w02 = 1090519039;
        } else if (profileActivity.S5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21024f8, profileActivity.A0);
        }
        kVar.B(w02, false);
        ry0 ry0Var = profileActivity.f33612f0;
        ImageReceiver imageReceiver = ry0Var.U;
        org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(ry0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = ry0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            ry0Var.W = null;
        }
        ry0Var.V = 0.0f;
        ry0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
