package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f50232a;
    public final boolean f50233b;
    public final g4 f50234c;

    public a3(g4 g4Var, boolean z10, int i10) {
        this.f50232a = i10;
        this.f50234c = g4Var;
        this.f50233b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50232a) {
            case 0:
                if (!this.f50233b) {
                    this.f50234c.f50331y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50233b) {
                    this.f50234c.f50329w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
