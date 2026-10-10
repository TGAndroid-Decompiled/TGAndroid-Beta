package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n3 extends AnimatorListenerAdapter {
    public final int f52969a;
    public final p3 f52970b;

    public n3(p3 p3Var, int i10) {
        this.f52969a = i10;
        this.f52970b = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52969a) {
            case 0:
                this.f52970b.f53050d0 = false;
                return;
            case 1:
                this.f52970b.f53050d0 = false;
                return;
            case 2:
                this.f52970b.N.setVisibility(4);
                return;
            case 3:
                p3 p3Var = this.f52970b;
                p3Var.f53069s0 = p3Var.f53067r0;
                p3Var.d(p3Var.U);
                return;
            default:
                p3 p3Var2 = this.f52970b;
                p3Var2.f53070t0 = 1.0f;
                p3Var2.f53046b.setScaleX(1.0f);
                p3Var2.f53046b.setScaleY(p3Var2.f53070t0);
                p3Var2.invalidate();
                return;
        }
    }
}
