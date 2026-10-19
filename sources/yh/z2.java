package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f50617a;
    public final boolean f50618b;
    public final g4 f50619c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f50617a = i10;
        this.f50619c = g4Var;
        this.f50618b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50617a) {
            case 0:
                if (!this.f50618b) {
                    this.f50619c.f50280y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50618b) {
                    this.f50619c.f50278w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
