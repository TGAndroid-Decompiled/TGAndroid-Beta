package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f54944a;
    public final j0 f54945b;

    public h0(j0 j0Var, int i7) {
        this.f54944a = i7;
        this.f54945b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54944a) {
            case 0:
                j0 j0Var = this.f54945b;
                j0Var.K = null;
                j0Var.f54973f.f(new m5(this, 28));
                return;
            default:
                this.f54945b.f54973f.f(new m5(this, 29));
                return;
        }
    }
}
