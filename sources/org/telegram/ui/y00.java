package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class y00 extends AnimatorListenerAdapter {
    public final int f45810a = 0;
    public final tq f45811b;

    public y00(tq tqVar) {
        this.f45811b = tqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45810a) {
            case 0:
                ((j10) this.f45811b.d).f40335l0.unlock();
                return;
            default:
                tq tqVar = this.f45811b;
                View view = tqVar.f43726b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((j10) tqVar.d).f40322b.removeView(view);
                return;
        }
    }

    public y00(tq tqVar, s4.p0 p0Var) {
        this.f45811b = tqVar;
    }
}
