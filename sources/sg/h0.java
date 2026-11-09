package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.o5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f55075a;
    public final j0 f55076b;

    public h0(j0 j0Var, int i7) {
        this.f55075a = i7;
        this.f55076b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55075a) {
            case 0:
                j0 j0Var = this.f55076b;
                j0Var.K = null;
                j0Var.f55103f.f(new o5(this, 26));
                return;
            default:
                this.f55076b.f55103f.f(new o5(this, 27));
                return;
        }
    }
}
