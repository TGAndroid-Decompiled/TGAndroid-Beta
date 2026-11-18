package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f57198a;
    public final i0 f57199b;

    public g0(i0 i0Var, int i7) {
        this.f57198a = i7;
        this.f57199b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57198a) {
            case 0:
                i0 i0Var = this.f57199b;
                i0Var.K = null;
                i0Var.f57225f.f(new org.telegram.ui.web.z0(this, 11));
                return;
            default:
                this.f57199b.f57225f.f(new org.telegram.ui.web.z0(this, 12));
                return;
        }
    }
}
