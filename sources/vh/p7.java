package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p7 extends AnimatorListenerAdapter {
    public final int f51785a;
    public final int f51786b;
    public final int f51787c;
    public final o8 d;

    public p7(o8 o8Var, int i10, int i11, int i12) {
        this.f51785a = i12;
        this.d = o8Var;
        this.f51786b = i10;
        this.f51787c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51785a) {
            case 0:
                this.d.M(this.f51786b, this.f51787c);
                return;
            default:
                int i10 = this.f51786b;
                int i11 = this.f51787c;
                if (i10 != i11) {
                    this.d.P(i10, i11);
                    return;
                }
                return;
        }
    }
}
