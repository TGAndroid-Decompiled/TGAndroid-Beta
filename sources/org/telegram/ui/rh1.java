package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rh1 extends AnimatorListenerAdapter {
    public final ai1 f38055a;

    public rh1(ai1 ai1Var) {
        this.f38055a = ai1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ai1 ai1Var = this.f38055a;
        ai1Var.B.setText(LocaleController.getString(R.string.VoipCallEnded));
        ai1Var.B.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
