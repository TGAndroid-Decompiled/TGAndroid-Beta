package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z2 extends AnimatorListenerAdapter {
    public final int f50624a;
    public final boolean f50625b;
    public final g4 f50626c;

    public z2(g4 g4Var, boolean z10, int i10) {
        this.f50624a = i10;
        this.f50626c = g4Var;
        this.f50625b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50624a) {
            case 0:
                if (!this.f50625b) {
                    this.f50626c.f50287y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50625b) {
                    this.f50626c.f50285w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
