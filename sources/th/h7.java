package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h7 extends AnimatorListenerAdapter {
    public final int f49063a;
    public final x6 f49064b;

    public h7(x6 x6Var, int i10) {
        this.f49063a = i10;
        this.f49064b = x6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49063a) {
            case 0:
                super.onAnimationEnd(animator);
                o7 o7Var = this.f49064b.f49668b;
                i5 i5Var = o7Var.f49350u1;
                if (i5Var != null) {
                    i5Var.b();
                    o7Var.f49353w.removeView(o7Var.f49350u1);
                }
                o7Var.f49350u1 = null;
                o7Var.d0();
                return;
            default:
                super.onAnimationEnd(animator);
                i5 i5Var2 = this.f49064b.f49668b.f49350u1;
                if (i5Var2 != null) {
                    i5Var2.a(true);
                    return;
                }
                return;
        }
    }
}
