package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46105a;
    public final boolean f46106b;
    public final i4 f46107c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46105a = i10;
        this.f46107c = i4Var;
        this.f46106b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46105a) {
            case 0:
                if (!this.f46106b) {
                    this.f46107c.f46192y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46106b) {
                    this.f46107c.f46190w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
