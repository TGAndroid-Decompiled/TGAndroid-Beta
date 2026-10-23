package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f50628a;
    public final boolean f50629b;
    public final g4 f50630c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f50628a = i10;
        this.f50630c = g4Var;
        this.f50629b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50628a) {
            case 0:
                if (!this.f50629b) {
                    this.f50630c.f50291y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50629b) {
                    this.f50630c.f50289w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
