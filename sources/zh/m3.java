package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m3 extends AnimatorListenerAdapter {
    public final int f50819a;
    public final o3 f50820b;

    public m3(o3 o3Var, int i10) {
        this.f50819a = i10;
        this.f50820b = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50819a) {
            case 0:
                this.f50820b.f50913d0 = false;
                return;
            case 1:
                this.f50820b.f50913d0 = false;
                return;
            case 2:
                this.f50820b.N.setVisibility(4);
                return;
            case 3:
                o3 o3Var = this.f50820b;
                o3Var.f50931s0 = o3Var.f50929r0;
                o3Var.d(o3Var.U);
                return;
            default:
                o3 o3Var2 = this.f50820b;
                o3Var2.f50932t0 = 1.0f;
                o3Var2.f50909b.setScaleX(1.0f);
                o3Var2.f50909b.setScaleY(o3Var2.f50932t0);
                o3Var2.invalidate();
                return;
        }
    }
}
