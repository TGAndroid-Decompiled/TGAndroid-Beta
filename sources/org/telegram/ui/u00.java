package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class u00 extends AnimatorListenerAdapter {
    public final int f41789a = 0;
    public final oq f41790b;

    public u00(oq oqVar) {
        this.f41790b = oqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41789a) {
            case 0:
                ((e10) this.f41790b.d).f36509l0.unlock();
                return;
            default:
                oq oqVar = this.f41790b;
                View view = oqVar.f39960b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((e10) oqVar.d).f36496b.removeView(view);
                return;
        }
    }

    public u00(oq oqVar, s4.n0 n0Var) {
        this.f41790b = oqVar;
    }
}
