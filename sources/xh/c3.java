package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46104a;
    public final boolean f46105b;
    public final i4 f46106c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46104a = i10;
        this.f46106c = i4Var;
        this.f46105b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46104a) {
            case 0:
                if (!this.f46105b) {
                    this.f46106c.f46191y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46105b) {
                    this.f46106c.f46189w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
