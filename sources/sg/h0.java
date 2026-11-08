package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f55060a;
    public final j0 f55061b;

    public h0(j0 j0Var, int i7) {
        this.f55060a = i7;
        this.f55061b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55060a) {
            case 0:
                j0 j0Var = this.f55061b;
                j0Var.K = null;
                j0Var.f55089f.f(new m5(this, 28));
                return;
            default:
                this.f55061b.f55089f.f(new m5(this, 29));
                return;
        }
    }
}
