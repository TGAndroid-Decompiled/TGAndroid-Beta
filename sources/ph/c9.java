package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c9 extends AnimatorListenerAdapter {
    public final int f41441a;
    public final int f41442b;
    public final int f41443c;
    public final da d;

    public c9(da daVar, int i10, int i11, int i12) {
        this.f41441a = i12;
        this.d = daVar;
        this.f41442b = i10;
        this.f41443c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41441a) {
            case 0:
                this.d.N(this.f41442b, this.f41443c);
                return;
            default:
                int i10 = this.f41442b;
                int i11 = this.f41443c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
