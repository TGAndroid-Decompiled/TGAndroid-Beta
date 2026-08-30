package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k4 extends AnimatorListenerAdapter {
    public final int f41853a;
    public final c5 f41854b;

    public k4(c5 c5Var, int i10) {
        this.f41853a = i10;
        this.f41854b = c5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41853a) {
            case 0:
                c5 c5Var = this.f41854b;
                c5Var.Y1 = 0.0f;
                c5Var.W1.setAlpha(1.0f);
                c5Var.W1.setVisibility(8);
                c5Var.W1.n();
                return;
            case 1:
                this.f41854b.f41349m2.setTranslationY(0.0f);
                return;
            default:
                c5 c5Var2 = this.f41854b;
                c5Var2.f41355p2 = false;
                c5Var2.f41349m2.setTranslationY(0.0f);
                c5Var2.w0();
                return;
        }
    }
}
