package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class z extends AnimatorListenerAdapter {

    public final int f50790a;

    public final l0 f50791b;

    public z(l0 l0Var, int i10) {
        this.f50790a = i10;
        this.f50791b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50790a) {
            case 0:
                this.f50791b.f50507b2.setTranslationY(0.0f);
                break;
            default:
                l0 l0Var = this.f50791b;
                l0Var.f50513e2 = false;
                l0Var.f50507b2.setTranslationY(0.0f);
                l0Var.m0();
                break;
        }
    }
}
