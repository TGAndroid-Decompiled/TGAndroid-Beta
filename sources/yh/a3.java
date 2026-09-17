package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f50204a;
    public final boolean f50205b;
    public final g4 f50206c;

    public a3(g4 g4Var, boolean z10, int i10) {
        this.f50204a = i10;
        this.f50206c = g4Var;
        this.f50205b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50204a) {
            case 0:
                if (!this.f50205b) {
                    this.f50206c.f50303y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50205b) {
                    this.f50206c.f50301w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
