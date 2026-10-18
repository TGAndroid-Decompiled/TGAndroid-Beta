package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final int f45768a;
    public final m0 f45769b;

    public z(m0 m0Var, int i10) {
        this.f45768a = i10;
        this.f45769b = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45768a) {
            case 0:
                this.f45769b.f45522f2.setTranslationY(0.0f);
                return;
            default:
                m0 m0Var = this.f45769b;
                m0Var.f45528i2 = false;
                m0Var.f45522f2.setTranslationY(0.0f);
                m0Var.n0();
                return;
        }
    }
}
