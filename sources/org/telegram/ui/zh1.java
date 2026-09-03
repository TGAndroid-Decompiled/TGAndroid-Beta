package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh1 extends AnimatorListenerAdapter {
    public final ii1 f40487a;

    public zh1(ii1 ii1Var) {
        this.f40487a = ii1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ii1 ii1Var = this.f40487a;
        ii1Var.B.setText(LocaleController.getString(R.string.VoipCallEnded));
        ii1Var.B.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
