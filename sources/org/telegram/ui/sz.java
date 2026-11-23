package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sz extends AnimatorListenerAdapter {
    public final int f52167a = 0;
    public final yp f52168b;

    public sz(yp ypVar) {
        this.f52168b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52167a) {
            case 0:
                ((c00) this.f52168b.d).m0.e();
                return;
            default:
                yp ypVar = this.f52168b;
                View view = ypVar.f54269b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((c00) ypVar.d).f46348b.removeView(view);
                return;
        }
    }

    public sz(yp ypVar, v4.p0 p0Var) {
        this.f52168b = ypVar;
    }
}
