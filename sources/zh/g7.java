package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g7 extends AnimatorListenerAdapter {
    public final int f48456a;
    public final i7 f48457b;

    public g7(i7 i7Var, int i10) {
        this.f48456a = i10;
        this.f48457b = i7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48456a) {
            case 0:
                u7 u7Var = this.f48457b.I0;
                u7Var.X = 0.0f;
                u7.k(u7Var);
                return;
            default:
                u7 u7Var2 = this.f48457b.I0;
                u7Var2.W = 0.0f;
                u7Var2.Z = 0.0f;
                u7.k(u7Var2);
                return;
        }
    }
}
