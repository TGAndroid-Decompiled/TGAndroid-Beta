package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q1 extends AnimatorListenerAdapter {
    public final int f48802a;
    public final a3 f48803b;

    public q1(a3 a3Var, int i10) {
        this.f48802a = i10;
        this.f48803b = a3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v1 v1Var;
        Runnable runnable;
        switch (this.f48802a) {
            case 0:
                a3 a3Var = this.f48803b;
                a3Var.f48213t3 = 0.0f;
                a3Var.f48207r3.setAlpha(1.0f);
                a3Var.f48207r3.setVisibility(8);
                a3Var.f48207r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                a3 a3Var2 = this.f48803b;
                a3Var2.N2.unlock();
                a3Var2.H2 = a3Var2.f48197o2;
                t1 t1Var = a3Var2.f48157b2;
                if (t1Var != null && (runnable = t1Var.f20941w) != null) {
                    runnable.run();
                    t1Var.f20941w = null;
                }
                if (a3Var2.K1 && !a3Var2.f48218v2) {
                    u7 u7Var = ((l7) a3Var2.Q1).d;
                    if (u7Var.f48970x) {
                        u7Var.f48970x = false;
                        u7Var.P();
                    }
                }
                if (!a3Var2.f48218v2 && (v1Var = a3Var2.f48166d3) != null) {
                    v1Var.setVisibility(8);
                }
                a3Var2.V2 = true;
                a3Var2.invalidate();
                return;
        }
    }
}
