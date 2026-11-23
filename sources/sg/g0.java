package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f57208a;
    public final i0 f57209b;

    public g0(i0 i0Var, int i7) {
        this.f57208a = i7;
        this.f57209b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57208a) {
            case 0:
                i0 i0Var = this.f57209b;
                i0Var.K = null;
                i0Var.f57235f.f(new org.telegram.ui.web.i1(this, 10));
                return;
            default:
                this.f57209b.f57235f.f(new org.telegram.ui.web.i1(this, 11));
                return;
        }
    }
}
