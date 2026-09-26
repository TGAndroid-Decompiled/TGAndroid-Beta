package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f41583a;
    public final n0 f41584b;

    public b0(n0 n0Var, int i10) {
        this.f41583a = i10;
        this.f41584b = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41583a) {
            case 0:
                this.f41584b.f41779f2.setTranslationY(0.0f);
                return;
            default:
                n0 n0Var = this.f41584b;
                n0Var.f41785i2 = false;
                n0Var.f41779f2.setTranslationY(0.0f);
                n0Var.n0();
                return;
        }
    }
}
