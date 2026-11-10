package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.p5;
public final class h0 extends AnimatorListenerAdapter {
    public final int f55074a;
    public final j0 f55075b;

    public h0(j0 j0Var, int i7) {
        this.f55074a = i7;
        this.f55075b = j0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f55074a) {
            case 0:
                j0 j0Var = this.f55075b;
                j0Var.K = null;
                j0Var.f55102f.f(new p5(this, 26));
                return;
            default:
                this.f55075b.f55102f.f(new p5(this, 27));
                return;
        }
    }
}
