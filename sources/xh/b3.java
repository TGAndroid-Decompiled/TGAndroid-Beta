package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f51408a;
    public final boolean f51409b;
    public final h4 f51410c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f51408a = i10;
        this.f51410c = h4Var;
        this.f51409b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51408a) {
            case 0:
                if (!this.f51409b) {
                    this.f51410c.f51507y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51409b) {
                    this.f51410c.f51505w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
