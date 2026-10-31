package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r1 extends AnimatorListenerAdapter {
    public final int f49405a;
    public final z2 f49406b;

    public r1(z2 z2Var, int i10) {
        this.f49405a = i10;
        this.f49406b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v1 v1Var;
        Runnable runnable;
        switch (this.f49405a) {
            case 0:
                z2 z2Var = this.f49406b;
                z2Var.f49698c3 = 0.0f;
                z2Var.f49692a3.setAlpha(1.0f);
                z2Var.f49692a3.setVisibility(8);
                z2Var.f49692a3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                z2 z2Var2 = this.f49406b;
                z2Var2.f49773w2.e();
                z2Var2.f49749q2 = z2Var2.X1;
                t1 t1Var = z2Var2.K1;
                if (t1Var != null && (runnable = t1Var.f23809x) != null) {
                    runnable.run();
                    t1Var.f23809x = null;
                }
                if (z2Var2.f49760t1 && !z2Var2.f49703e2) {
                    o7 o7Var = ((f7) z2Var2.f49783z1).d;
                    if (o7Var.f49344y) {
                        o7Var.f49344y = false;
                        o7Var.d0();
                    }
                }
                if (!z2Var2.f49703e2 && (v1Var = z2Var2.M2) != null) {
                    v1Var.setVisibility(8);
                }
                z2Var2.E2 = true;
                z2Var2.invalidate();
                return;
        }
    }
}
