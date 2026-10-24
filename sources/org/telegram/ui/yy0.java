package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class yy0 extends AnimatorListenerAdapter {
    public final ProfileActivity f43976a;

    public yy0(ProfileActivity profileActivity) {
        this.f43976a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f43976a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (profileActivity.f33998q2) {
            w02 = 1090519039;
        } else if (profileActivity.S5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21221f8, profileActivity.A0);
        }
        kVar.A(w02, false);
        uy0 uy0Var = profileActivity.f33922f0;
        ImageReceiver imageReceiver = uy0Var.U;
        org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(uy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = uy0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            uy0Var.W = null;
        }
        uy0Var.V = 0.0f;
        uy0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.p5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
