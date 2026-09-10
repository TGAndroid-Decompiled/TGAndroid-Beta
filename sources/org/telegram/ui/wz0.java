package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class wz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f38544a;

    public wz0(ProfileActivity profileActivity) {
        this.f38544a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        int v02;
        ProfileActivity profileActivity = this.f38544a;
        lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (profileActivity.f30457p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17965f8, profileActivity.f30524z0);
        }
        lVar.A(v02, false);
        sz0 sz0Var = profileActivity.f30380e0;
        ImageReceiver imageReceiver = sz0Var.U;
        org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(sz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = sz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            sz0Var.W = null;
        }
        sz0Var.V = 0.0f;
        sz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
