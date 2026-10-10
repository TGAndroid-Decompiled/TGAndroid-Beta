package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f51240a;
    public final boolean f51241b;
    public final i4 f51242c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f51240a = i10;
        this.f51242c = i4Var;
        this.f51241b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51240a) {
            case 0:
                if (!this.f51241b) {
                    this.f51242c.f51336y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51241b) {
                    this.f51242c.f51334w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
