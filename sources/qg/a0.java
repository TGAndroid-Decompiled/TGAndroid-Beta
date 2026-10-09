package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46172a;
    public final m0 f46173b;

    public a0(m0 m0Var, int i10) {
        this.f46172a = i10;
        this.f46173b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46172a) {
            case 0:
                this.f46173b.f46368f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f46173b;
                m0Var.f46374i2 = false;
                m0Var.f46368f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
