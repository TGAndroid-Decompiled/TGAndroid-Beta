package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f57239a;
    public final i0 f57240b;

    public g0(i0 i0Var, int i7) {
        this.f57239a = i7;
        this.f57240b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57239a) {
            case 0:
                i0 i0Var = this.f57240b;
                i0Var.K = null;
                i0Var.f57266f.f(new org.telegram.ui.web.z0(this, 11));
                return;
            default:
                this.f57240b.f57266f.f(new org.telegram.ui.web.z0(this, 12));
                return;
        }
    }
}
