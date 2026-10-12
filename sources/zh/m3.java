package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m3 extends AnimatorListenerAdapter {
    public final int f50818a;
    public final o3 f50819b;

    public m3(o3 o3Var, int i10) {
        this.f50818a = i10;
        this.f50819b = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50818a) {
            case 0:
                this.f50819b.f50912d0 = false;
                return;
            case 1:
                this.f50819b.f50912d0 = false;
                return;
            case 2:
                this.f50819b.N.setVisibility(4);
                return;
            case 3:
                o3 o3Var = this.f50819b;
                o3Var.f50930s0 = o3Var.f50928r0;
                o3Var.d(o3Var.U);
                return;
            default:
                o3 o3Var2 = this.f50819b;
                o3Var2.f50931t0 = 1.0f;
                o3Var2.f50908b.setScaleX(1.0f);
                o3Var2.f50908b.setScaleY(o3Var2.f50931t0);
                o3Var2.invalidate();
                return;
        }
    }
}
