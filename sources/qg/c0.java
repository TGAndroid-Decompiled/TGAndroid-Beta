package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c0 extends AnimatorListenerAdapter {
    public final int f41316a;
    public final p0 f41317b;

    public c0(p0 p0Var, int i10) {
        this.f41316a = i10;
        this.f41317b = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41316a) {
            case 0:
                this.f41317b.f41521f2.setTranslationY(0.0f);
                return;
            default:
                p0 p0Var = this.f41317b;
                p0Var.f41527i2 = false;
                p0Var.f41521f2.setTranslationY(0.0f);
                p0Var.n0();
                return;
        }
    }
}
