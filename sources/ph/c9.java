package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c9 extends AnimatorListenerAdapter {
    public final int f41391a;
    public final int f41392b;
    public final int f41393c;
    public final da d;

    public c9(da daVar, int i10, int i11, int i12) {
        this.f41391a = i12;
        this.d = daVar;
        this.f41392b = i10;
        this.f41393c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41391a) {
            case 0:
                this.d.N(this.f41392b, this.f41393c);
                return;
            default:
                int i10 = this.f41392b;
                int i11 = this.f41393c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
