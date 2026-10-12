package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ui1 extends AnimatorListenerAdapter {
    public final dj1 f40689a;

    public ui1(dj1 dj1Var) {
        this.f40689a = dj1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        dj1 dj1Var = this.f40689a;
        dj1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        dj1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
