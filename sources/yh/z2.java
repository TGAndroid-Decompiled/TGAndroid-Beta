package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f50627a;
    public final boolean f50628b;
    public final g4 f50629c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f50627a = i10;
        this.f50629c = g4Var;
        this.f50628b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50627a) {
            case 0:
                if (!this.f50628b) {
                    this.f50629c.f50290y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50628b) {
                    this.f50629c.f50288w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
