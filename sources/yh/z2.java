package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f51087a;
    public final boolean f51088b;
    public final g4 f51089c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f51087a = i10;
        this.f51089c = g4Var;
        this.f51088b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51087a) {
            case 0:
                if (!this.f51088b) {
                    this.f51089c.f50743y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51088b) {
                    this.f51089c.f50741w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
