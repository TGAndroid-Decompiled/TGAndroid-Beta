package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class rz extends AnimatorListenerAdapter {
    public final int f49604a = 0;
    public final xp f49605b;

    public rz(xp xpVar) {
        this.f49605b = xpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49604a) {
            case 0:
                ((b00) this.f49605b.d).f43876l0.e();
                return;
            default:
                xp xpVar = this.f49605b;
                View view = xpVar.f51779b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((b00) xpVar.d).f43862b.removeView(view);
                return;
        }
    }

    public rz(xp xpVar, v4.n0 n0Var) {
        this.f49605b = xpVar;
    }
}
