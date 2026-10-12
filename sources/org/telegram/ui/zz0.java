package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class zz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f42738a;

    public zz0(ProfileActivity profileActivity) {
        this.f42738a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f42738a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (profileActivity.f32636p2) {
            w02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19938f8, profileActivity.f32703z0);
        }
        kVar.B(w02, false);
        vz0 vz0Var = profileActivity.f32558e0;
        ImageReceiver imageReceiver = vz0Var.U;
        org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(vz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = vz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            vz0Var.W = null;
        }
        vz0Var.V = 0.0f;
        vz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
