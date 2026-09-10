package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f39930a;
    public final m0 f39931b;

    public a0(m0 m0Var, int i10) {
        this.f39930a = i10;
        this.f39931b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39930a) {
            case 0:
                this.f39931b.f40133f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f39931b;
                m0Var.f40139i2 = false;
                m0Var.f40133f2.setTranslationY(0.0f);
                m0Var.m0();
                return;
        }
    }
}
