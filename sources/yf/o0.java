package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class o0 extends AnimatorListenerAdapter {

    public final int f49995a;

    public final p0 f49996b;

    public o0(p0 p0Var, int i10) {
        this.f49995a = i10;
        this.f49996b = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49995a) {
            case 0:
                p0 p0Var = this.f49996b;
                p0Var.K = null;
                p0Var.f50015f.f(new qf.b(this, 19));
                break;
            default:
                this.f49996b.f50015f.f(new qf.b(this, 20));
                break;
        }
    }
}
