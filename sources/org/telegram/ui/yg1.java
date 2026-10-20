package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yg1 extends AnimatorListenerAdapter {
    public final hh1 f43489a;

    public yg1(hh1 hh1Var) {
        this.f43489a = hh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        hh1 hh1Var = this.f43489a;
        hh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        hh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
