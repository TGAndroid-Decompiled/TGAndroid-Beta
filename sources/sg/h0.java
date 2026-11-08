package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f55061a;
    public final j0 f55062b;

    public h0(j0 j0Var, int i7) {
        this.f55061a = i7;
        this.f55062b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55061a) {
            case 0:
                j0 j0Var = this.f55062b;
                j0Var.K = null;
                j0Var.f55090f.f(new m5(this, 28));
                return;
            default:
                this.f55062b.f55090f.f(new m5(this, 29));
                return;
        }
    }
}
