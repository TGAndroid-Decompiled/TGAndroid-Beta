package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class uz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f38247a;

    public uz0(ProfileActivity profileActivity) {
        this.f38247a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f38247a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (profileActivity.f31358p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18899f8, profileActivity.f31425z0);
        }
        kVar.A(v02, false);
        qz0 qz0Var = profileActivity.f31281e0;
        ImageReceiver imageReceiver = qz0Var.U;
        org.telegram.ui.Components.b6 animation = imageReceiver.getAnimation();
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
