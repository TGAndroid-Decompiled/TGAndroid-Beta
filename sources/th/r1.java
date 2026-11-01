package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r1 extends AnimatorListenerAdapter {
    public final int f49419a;
    public final z2 f49420b;

    public r1(z2 z2Var, int i10) {
        this.f49419a = i10;
        this.f49420b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v1 v1Var;
        Runnable runnable;
        switch (this.f49419a) {
            case 0:
                z2 z2Var = this.f49420b;
                z2Var.f49712c3 = 0.0f;
                z2Var.f49706a3.setAlpha(1.0f);
                z2Var.f49706a3.setVisibility(8);
                z2Var.f49706a3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                z2 z2Var2 = this.f49420b;
                z2Var2.f49787w2.e();
                z2Var2.f49763q2 = z2Var2.X1;
                t1 t1Var = z2Var2.K1;
                if (t1Var != null && (runnable = t1Var.f23810x) != null) {
                    runnable.run();
                    t1Var.f23810x = null;
                }
                if (z2Var2.f49774t1 && !z2Var2.f49717e2) {
                    o7 o7Var = ((f7) z2Var2.f49797z1).d;
                    if (o7Var.f49358y) {
                        o7Var.f49358y = false;
                        o7Var.d0();
                    }
                }
                if (!z2Var2.f49717e2 && (v1Var = z2Var2.M2) != null) {
                    v1Var.setVisibility(8);
                }
                z2Var2.E2 = true;
                z2Var2.invalidate();
                return;
        }
    }
}
