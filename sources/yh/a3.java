package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f48792a;
    public final boolean f48793b;
    public final g4 f48794c;

    public a3(g4 g4Var, boolean z10, int i10) {
        this.f48792a = i10;
        this.f48794c = g4Var;
        this.f48793b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48792a) {
            case 0:
                if (!this.f48793b) {
                    this.f48794c.f48886y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f48793b) {
                    this.f48794c.f48884w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
