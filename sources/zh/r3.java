package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r3 extends AnimatorListenerAdapter {
    public final int f52508a;
    public final t3 f52509b;

    public r3(t3 t3Var, int i10) {
        this.f52508a = i10;
        this.f52509b = t3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52508a) {
            case 0:
                this.f52509b.f52622d0 = false;
                return;
            case 1:
                this.f52509b.f52622d0 = false;
                return;
            case 2:
                this.f52509b.N.setVisibility(4);
                return;
            case 3:
                t3 t3Var = this.f52509b;
                t3Var.f52641s0 = t3Var.f52639r0;
                t3Var.d(t3Var.U);
                return;
            default:
                t3 t3Var2 = this.f52509b;
                t3Var2.f52642t0 = 1.0f;
                t3Var2.f52618b.setScaleX(1.0f);
                t3Var2.f52618b.setScaleY(t3Var2.f52642t0);
                t3Var2.invalidate();
                return;
        }
    }
}
