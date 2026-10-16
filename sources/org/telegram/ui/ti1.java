package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ti1 extends AnimatorListenerAdapter {
    public final cj1 f40123a;

    public ti1(cj1 cj1Var) {
        this.f40123a = cj1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cj1 cj1Var = this.f40123a;
        cj1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        cj1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
