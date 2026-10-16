package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class r10 extends AnimatorListenerAdapter {
    public final int f39262a = 0;
    public final fr f39263b;

    public r10(fr frVar) {
        this.f39263b = frVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39262a) {
            case 0:
                ((b20) this.f39263b.d).f34176l0.unlock();
                return;
            default:
                fr frVar = this.f39263b;
                View view = frVar.f35909b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((b20) frVar.d).f34163b.removeView(view);
                return;
        }
    }

    public r10(fr frVar, s4.n0 n0Var) {
        this.f39263b = frVar;
    }
}
