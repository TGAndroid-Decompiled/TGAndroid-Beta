package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a7 extends AnimatorListenerAdapter {
    public final int f48788a;
    public final c7 f48789b;

    public a7(c7 c7Var, int i10) {
        this.f48788a = i10;
        this.f48789b = c7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48788a) {
            case 0:
                o7 o7Var = this.f48789b.f48858r0;
                o7Var.X = 0.0f;
                o7.w(o7Var);
                return;
            default:
                o7 o7Var2 = this.f48789b.f48858r0;
                o7Var2.W = 0.0f;
                o7Var2.Z = 0.0f;
                o7.w(o7Var2);
                return;
        }
    }
}
