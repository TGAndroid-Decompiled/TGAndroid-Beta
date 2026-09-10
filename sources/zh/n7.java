package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n7 extends AnimatorListenerAdapter {
    public final int f48730a;
    public final d7 f48731b;

    public n7(d7 d7Var, int i10) {
        this.f48730a = i10;
        this.f48731b = d7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48730a) {
            case 0:
                super.onAnimationEnd(animator);
                u7 u7Var = this.f48731b.f48353b;
                n5 n5Var = u7Var.f48964u1;
                if (n5Var != null) {
                    n5Var.b();
                    u7Var.v.removeView(u7Var.f48964u1);
                }
                u7Var.f48964u1 = null;
                u7Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                n5 n5Var2 = this.f48731b.f48353b.f48964u1;
                if (n5Var2 != null) {
                    n5Var2.a(true);
                    return;
                }
                return;
        }
    }
}
