package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class tz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f40872a;

    public tz0(ProfileActivity profileActivity) {
        this.f40872a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f40872a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f33964p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20701f8, profileActivity.f34031z0);
        }
        kVar.B(v02, false);
        pz0 pz0Var = profileActivity.f33887e0;
        ImageReceiver imageReceiver = pz0Var.U;
        org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(pz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = pz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            pz0Var.W = null;
        }
        pz0Var.V = 0.0f;
        pz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
