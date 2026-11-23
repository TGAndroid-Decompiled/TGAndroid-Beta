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
                View view = ypVar.f54220b;
                view.setAlpha(1.0f);
                v4.o0.x0(view);
                ((c00) ypVar.d).f46341b.removeView(view);
                return;
        }
    }

    public sz(yp ypVar, v4.o0 o0Var) {
        this.f52116b = ypVar;
    }
}
