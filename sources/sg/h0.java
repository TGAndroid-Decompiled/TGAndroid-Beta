package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f54968a;
    public final j0 f54969b;

    public h0(j0 j0Var, int i7) {
        this.f54968a = i7;
        this.f54969b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54968a) {
            case 0:
                j0 j0Var = this.f54969b;
                j0Var.K = null;
                j0Var.f54997f.f(new m5(this, 28));
                return;
            default:
                this.f54969b.f54997f.f(new m5(this, 29));
                return;
        }
    }
}
