package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f57243a;
    public final i0 f57244b;

    public g0(i0 i0Var, int i7) {
        this.f57243a = i7;
        this.f57244b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57243a) {
            case 0:
                i0 i0Var = this.f57244b;
                i0Var.K = null;
                i0Var.f57270f.f(new org.telegram.ui.web.z0(this, 11));
                return;
            default:
                this.f57244b.f57270f.f(new org.telegram.ui.web.z0(this, 12));
                return;
        }
    }
}
