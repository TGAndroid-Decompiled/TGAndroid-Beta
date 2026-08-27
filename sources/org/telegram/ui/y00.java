package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class y00 extends AnimatorListenerAdapter {

    public final int f44653a = 0;

    public final pq f44654b;

    public y00(pq pqVar) {
        this.f44654b = pqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44653a) {
            case 0:
                ((i10) this.f44654b.d).f38946h0.unlock();
                break;
            default:
                pq pqVar = this.f44654b;
                View view = pqVar.f41409b;
                view.setAlpha(1.0f);
                f2.x0.x0(view);
                ((i10) pqVar.d).f38936b.removeView(view);
                break;
        }
    }

    public y00(pq pqVar, f2.x0 x0Var) {
        this.f44654b = pqVar;
    }
}
