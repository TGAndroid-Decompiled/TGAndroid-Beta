package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f44965a;
    public final m0 f44966b;

    public a0(m0 m0Var, int i10) {
        this.f44965a = i10;
        this.f44966b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44965a) {
            case 0:
                this.f44966b.f45180f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f44966b;
                m0Var.f45186i2 = false;
                m0Var.f45180f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
