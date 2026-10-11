package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46286a;
    public final m0 f46287b;

    public a0(m0 m0Var, int i10) {
        this.f46286a = i10;
        this.f46287b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46286a) {
            case 0:
                this.f46287b.f46499f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f46287b;
                m0Var.f46505i2 = false;
                m0Var.f46499f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
