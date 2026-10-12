package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class s10 extends AnimatorListenerAdapter {
    public final int f39919a = 0;
    public final fr f39920b;

    public s10(fr frVar) {
        this.f39920b = frVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39919a) {
            case 0:
                ((c20) this.f39920b.d).f34694l0.unlock();
                return;
            default:
                fr frVar = this.f39920b;
                View view = frVar.f36216b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((c20) frVar.d).f34681b.removeView(view);
                return;
        }
    }

    public s10(fr frVar, s4.n0 n0Var) {
        this.f39920b = frVar;
    }
}
