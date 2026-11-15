package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g0 extends AnimatorListenerAdapter {
    public final int f56624a;
    public final i0 f56625b;

    public g0(i0 i0Var, int i7) {
        this.f56624a = i7;
        this.f56625b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f56624a) {
            case 0:
                i0 i0Var = this.f56625b;
                i0Var.K = null;
                i0Var.f56651f.f(new q2.d(this, 8));
                return;
            default:
                this.f56625b.f56651f.f(new q2.d(this, 9));
                return;
        }
    }
}
