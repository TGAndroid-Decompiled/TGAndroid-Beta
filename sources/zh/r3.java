package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f52538a;
    public final t3 f52539b;

    public r3(t3 t3Var, int i10) {
        this.f52538a = i10;
        this.f52539b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52538a) {
            case 0:
                this.f52539b.f52652d0 = false;
                return;
            case 1:
                this.f52539b.f52652d0 = false;
                return;
            case 2:
                this.f52539b.N.setVisibility(4);
                return;
            case 3:
                t3 t3Var = this.f52539b;
                t3Var.f52671s0 = t3Var.f52669r0;
                t3Var.d(t3Var.U);
                return;
            default:
                t3 t3Var2 = this.f52539b;
                t3Var2.f52672t0 = 1.0f;
                t3Var2.f52648b.setScaleX(1.0f);
                t3Var2.f52648b.setScaleY(t3Var2.f52672t0);
                t3Var2.invalidate();
                return;
        }
    }
}
