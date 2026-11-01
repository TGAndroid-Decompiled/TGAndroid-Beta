package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p3 extends AnimatorListenerAdapter {
    public final int f51775a;
    public final b4 f51776b;

    public p3(b4 b4Var, int i10) {
        this.f51775a = i10;
        this.f51776b = b4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51775a) {
            case 0:
                b4 b4Var = this.f51776b;
                b4Var.K1 = 0.0f;
                b4Var.I1.setAlpha(1.0f);
                b4Var.I1.setVisibility(8);
                b4Var.I1.n();
                return;
            case 1:
                this.f51776b.Y1.setTranslationY(0.0f);
                return;
            default:
                b4 b4Var2 = this.f51776b;
                b4Var2.f50963b2 = false;
                b4Var2.Y1.setTranslationY(0.0f);
                b4Var2.t0();
                return;
        }
    }
}
