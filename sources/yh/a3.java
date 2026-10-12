package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f48793a;
    public final boolean f48794b;
    public final g4 f48795c;

    public a3(g4 g4Var, boolean z10, int i10) {
        this.f48793a = i10;
        this.f48795c = g4Var;
        this.f48794b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48793a) {
            case 0:
                if (!this.f48794b) {
                    this.f48795c.f48887y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f48794b) {
                    this.f48795c.f48885w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
