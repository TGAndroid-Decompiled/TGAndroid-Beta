package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46174a;
    public final m0 f46175b;

    public a0(m0 m0Var, int i10) {
        this.f46174a = i10;
        this.f46175b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46174a) {
            case 0:
                this.f46175b.f46370f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f46175b;
                m0Var.f46376i2 = false;
                m0Var.f46370f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
