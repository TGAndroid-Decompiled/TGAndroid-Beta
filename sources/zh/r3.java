package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f52539a;
    public final t3 f52540b;

    public r3(t3 t3Var, int i10) {
        this.f52539a = i10;
        this.f52540b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52539a) {
            case 0:
                this.f52540b.f52653d0 = false;
                return;
            case 1:
                this.f52540b.f52653d0 = false;
                return;
            case 2:
                this.f52540b.N.setVisibility(4);
                return;
            case 3:
                t3 t3Var = this.f52540b;
                t3Var.f52672s0 = t3Var.f52670r0;
                t3Var.d(t3Var.U);
                return;
            default:
                t3 t3Var2 = this.f52540b;
                t3Var2.f52673t0 = 1.0f;
                t3Var2.f52649b.setScaleX(1.0f);
                t3Var2.f52649b.setScaleY(t3Var2.f52673t0);
                t3Var2.invalidate();
                return;
        }
    }
}
