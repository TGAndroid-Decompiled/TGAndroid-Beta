package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class sz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f37574a;

    public sz0(ProfileActivity profileActivity) {
        this.f37574a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f37574a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f31629p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19131f8, profileActivity.f31696z0);
        }
        kVar.A(v02, false);
        oz0 oz0Var = profileActivity.f31552e0;
        ImageReceiver imageReceiver = oz0Var.U;
        org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(oz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = oz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            oz0Var.W = null;
        }
        oz0Var.V = 0.0f;
        oz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
