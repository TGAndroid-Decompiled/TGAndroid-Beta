package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.a2;
public final class r0 extends AnimatorListenerAdapter {
    public final int f45025a;
    public final s0 f45026b;

    public r0(s0 s0Var, int i10) {
        this.f45025a = i10;
        this.f45026b = s0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45025a) {
            case 0:
                s0 s0Var = this.f45026b;
                s0Var.K = null;
                s0Var.f45046f.f(new a2(this, 4));
                return;
            default:
                this.f45026b.f45046f.f(new a2(this, 5));
                return;
        }
    }
}
