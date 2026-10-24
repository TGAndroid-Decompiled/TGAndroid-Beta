package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f51086a;
    public final boolean f51087b;
    public final g4 f51088c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f51086a = i10;
        this.f51088c = g4Var;
        this.f51087b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51086a) {
            case 0:
                if (!this.f51087b) {
                    this.f51088c.f50742y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51087b) {
                    this.f51088c.f50740w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
