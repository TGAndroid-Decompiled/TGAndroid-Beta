package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class th1 extends AnimatorListenerAdapter {
    public final ci1 f41621a;

    public th1(ci1 ci1Var) {
        this.f41621a = ci1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ci1 ci1Var = this.f41621a;
        ci1Var.B.setText(LocaleController.getString(R.string.VoipCallEnded));
        ci1Var.B.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
