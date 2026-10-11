package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f52992a;
    public final p3 f52993b;

    public n3(p3 p3Var, int i10) {
        this.f52992a = i10;
        this.f52993b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52992a) {
            case 0:
                this.f52993b.f53093d0 = false;
                return;
            case 1:
                this.f52993b.f53093d0 = false;
                return;
            case 2:
                this.f52993b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f52993b;
                p3Var.f53112s0 = p3Var.f53110r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f52993b;
                p3Var2.f53113t0 = 1.0f;
                p3Var2.f53089b.setScaleX(1.0f);
                p3Var2.f53089b.setScaleY(p3Var2.f53113t0);
                p3Var2.invalidate();
                return;
        }
    }
}
