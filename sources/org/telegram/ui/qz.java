package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class qz extends AnimatorListenerAdapter {
    public final int f49225a = 0;
    public final xp f49226b;

    public qz(xp xpVar) {
        this.f49226b = xpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49225a) {
            case 0:
                ((a00) this.f49226b.d).f43526l0.e();
                return;
            default:
                xp xpVar = this.f49226b;
                View view = xpVar.f51743b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((a00) xpVar.d).f43512b.removeView(view);
                return;
        }
    }

    public qz(xp xpVar, v4.n0 n0Var) {
        this.f49226b = xpVar;
    }
}
