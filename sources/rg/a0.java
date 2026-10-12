package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final int f44185a;
    public final o0 f44186b;

    public a0(o0 o0Var, int i10) {
        this.f44185a = i10;
        this.f44186b = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44185a) {
            case 0:
                this.f44186b.f44410f2.setTranslationY(0.0f);
                return;
            default:
                o0 o0Var = this.f44186b;
                o0Var.f44416i2 = false;
                o0Var.f44410f2.setTranslationY(0.0f);
                o0Var.n0();
                return;
        }
    }
}
