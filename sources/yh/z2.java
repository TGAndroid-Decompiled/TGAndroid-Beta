package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f50619a;
    public final boolean f50620b;
    public final g4 f50621c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f50619a = i10;
        this.f50621c = g4Var;
        this.f50620b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50619a) {
            case 0:
                if (!this.f50620b) {
                    this.f50621c.f50282y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50620b) {
                    this.f50621c.f50280w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
