package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class rz extends AnimatorListenerAdapter {
    public final int f51924a = 0;
    public final yp f51925b;

    public rz(yp ypVar) {
        this.f51925b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51924a) {
            case 0:
                ((b00) this.f51925b.d).m0.e();
                return;
            default:
                yp ypVar = this.f51925b;
                View view = ypVar.f54410b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((b00) ypVar.d).f45845b.removeView(view);
                return;
        }
    }

    public rz(yp ypVar, v4.p0 p0Var) {
        this.f51925b = ypVar;
    }
}
