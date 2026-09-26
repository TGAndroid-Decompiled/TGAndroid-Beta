package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46103a;
    public final boolean f46104b;
    public final i4 f46105c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46103a = i10;
        this.f46105c = i4Var;
        this.f46104b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46103a) {
            case 0:
                if (!this.f46104b) {
                    this.f46105c.f46190y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46104b) {
                    this.f46105c.f46188w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
