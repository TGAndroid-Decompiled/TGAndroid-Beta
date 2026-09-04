package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f52507a;
    public final t3 f52508b;

    public r3(t3 t3Var, int i10) {
        this.f52507a = i10;
        this.f52508b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52507a) {
            case 0:
                this.f52508b.f52621d0 = false;
                return;
            case 1:
                this.f52508b.f52621d0 = false;
                return;
            case 2:
                this.f52508b.N.setVisibility(4);
                return;
            case 3:
                t3 t3Var = this.f52508b;
                t3Var.f52640s0 = t3Var.f52638r0;
                t3Var.d(t3Var.U);
                return;
            default:
                t3 t3Var2 = this.f52508b;
                t3Var2.f52641t0 = 1.0f;
                t3Var2.f52617b.setScaleX(1.0f);
                t3Var2.f52617b.setScaleY(t3Var2.f52641t0);
                t3Var2.invalidate();
                return;
        }
    }
}
