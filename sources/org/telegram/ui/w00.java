package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w00 extends AnimatorListenerAdapter {
    public final int f44937a = 0;
    public final rq f44938b;

    public w00(rq rqVar) {
        this.f44938b = rqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44937a) {
            case 0:
                ((h10) this.f44938b.d).f39841l0.unlock();
                return;
            default:
                rq rqVar = this.f44938b;
                View view = rqVar.f43240b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((h10) rqVar.d).f39828b.removeView(view);
                return;
        }
    }

    public w00(rq rqVar, s4.p0 p0Var) {
        this.f44938b = rqVar;
    }
}
