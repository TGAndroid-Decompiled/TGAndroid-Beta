package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f57333a;
    public final h0 f57334b;

    public g0(h0 h0Var, int i7) {
        this.f57333a = i7;
        this.f57334b = h0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57333a) {
            case 0:
                h0 h0Var = this.f57334b;
                h0Var.K = null;
                h0Var.f57343f.f(new org.telegram.ui.web.z0(this, 11));
                return;
            default:
                this.f57334b.f57343f.f(new org.telegram.ui.web.z0(this, 12));
                return;
        }
    }
}
