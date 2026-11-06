package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f54969a;
    public final j0 f54970b;

    public h0(j0 j0Var, int i7) {
        this.f54969a = i7;
        this.f54970b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54969a) {
            case 0:
                j0 j0Var = this.f54970b;
                j0Var.K = null;
                j0Var.f54998f.f(new m5(this, 28));
                return;
            default:
                this.f54970b.f54998f.f(new m5(this, 29));
                return;
        }
    }
}
