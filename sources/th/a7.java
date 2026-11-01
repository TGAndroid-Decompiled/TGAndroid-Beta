package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a7 extends AnimatorListenerAdapter {
    public final int f48802a;
    public final c7 f48803b;

    public a7(c7 c7Var, int i10) {
        this.f48802a = i10;
        this.f48803b = c7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48802a) {
            case 0:
                o7 o7Var = this.f48803b.f48872r0;
                o7Var.X = 0.0f;
                o7.w(o7Var);
                return;
            default:
                o7 o7Var2 = this.f48803b.f48872r0;
                o7Var2.W = 0.0f;
                o7Var2.Z = 0.0f;
                o7.w(o7Var2);
                return;
        }
    }
}
