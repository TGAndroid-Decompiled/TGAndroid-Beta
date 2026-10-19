package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class u00 extends AnimatorListenerAdapter {
    public final int f41773a = 0;
    public final oq f41774b;

    public u00(oq oqVar) {
        this.f41774b = oqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41773a) {
            case 0:
                ((e10) this.f41774b.d).f36500l0.unlock();
                return;
            default:
                oq oqVar = this.f41774b;
                View view = oqVar.f39951b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((e10) oqVar.d).f36487b.removeView(view);
                return;
        }
    }

    public u00(oq oqVar, s4.n0 n0Var) {
        this.f41774b = oqVar;
    }
}
