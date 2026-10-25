package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f48155a;
    public final n0 f48156b;

    public b0(n0 n0Var, int i10) {
        this.f48155a = i10;
        this.f48156b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48155a) {
            case 0:
                this.f48156b.U1.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f48156b;
                n0Var.X1 = false;
                n0Var.U1.setTranslationY(0.0f);
                n0Var.l0();
                return;
        }
    }
}
