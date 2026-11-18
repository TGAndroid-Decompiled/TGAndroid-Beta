package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sz extends AnimatorListenerAdapter {
    public final int f52113a = 0;
    public final yp f52114b;

    public sz(yp ypVar) {
        this.f52114b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52113a) {
            case 0:
                ((c00) this.f52114b.d).m0.e();
                return;
            default:
                yp ypVar = this.f52114b;
                View view = ypVar.f54264b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((c00) ypVar.d).f46331b.removeView(view);
                return;
        }
    }

    public sz(yp ypVar, v4.p0 p0Var) {
        this.f52114b = ypVar;
    }
}
