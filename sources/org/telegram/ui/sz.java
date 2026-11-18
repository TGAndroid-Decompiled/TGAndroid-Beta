package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sz extends AnimatorListenerAdapter {
    public final int f52115a = 0;
    public final yp f52116b;

    public sz(yp ypVar) {
        this.f52116b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52115a) {
            case 0:
                ((c00) this.f52116b.d).m0.e();
                return;
            default:
                yp ypVar = this.f52116b;
                View view = ypVar.f54223b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((c00) ypVar.d).f46322b.removeView(view);
                return;
        }
    }

    public sz(yp ypVar, v4.p0 p0Var) {
        this.f52116b = ypVar;
    }
}
