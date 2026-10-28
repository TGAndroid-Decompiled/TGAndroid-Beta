package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f48177a;
    public final m0 f48178b;

    public a0(m0 m0Var, int i10) {
        this.f48177a = i10;
        this.f48178b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48177a) {
            case 0:
                this.f48178b.U1.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f48178b;
                m0Var.X1 = false;
                m0Var.U1.setTranslationY(0.0f);
                m0Var.l0();
                return;
        }
    }
}
