package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46111a;
    public final m0 f46112b;

    public a0(m0 m0Var, int i10) {
        this.f46111a = i10;
        this.f46112b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46111a) {
            case 0:
                this.f46112b.f46307f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f46112b;
                m0Var.f46313i2 = false;
                m0Var.f46307f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
