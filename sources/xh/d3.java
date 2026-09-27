package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d3 extends AnimatorListenerAdapter {
    public final int f46181a;
    public final boolean f46182b;
    public final j4 f46183c;

    public d3(j4 j4Var, boolean z10, int i10) {
        this.f46181a = i10;
        this.f46183c = j4Var;
        this.f46182b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46181a) {
            case 0:
                if (!this.f46182b) {
                    this.f46183c.f46294y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46182b) {
                    this.f46183c.f46292w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
