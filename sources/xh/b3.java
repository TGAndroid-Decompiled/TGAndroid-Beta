package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f51416a;
    public final boolean f51417b;
    public final h4 f51418c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f51416a = i10;
        this.f51418c = h4Var;
        this.f51417b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51416a) {
            case 0:
                if (!this.f51417b) {
                    this.f51418c.f51515y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51417b) {
                    this.f51418c.f51513w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
