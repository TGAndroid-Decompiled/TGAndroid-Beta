package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f50618a;
    public final boolean f50619b;
    public final g4 f50620c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f50618a = i10;
        this.f50620c = g4Var;
        this.f50619b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50618a) {
            case 0:
                if (!this.f50619b) {
                    this.f50620c.f50281y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50619b) {
                    this.f50620c.f50279w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
