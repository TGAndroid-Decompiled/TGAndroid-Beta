package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z8 extends AnimatorListenerAdapter {
    public final int f46423a;
    public final int f46424b;
    public final int f46425c;
    public final ba d;

    public z8(ba baVar, int i10, int i11, int i12) {
        this.f46423a = i12;
        this.d = baVar;
        this.f46424b = i10;
        this.f46425c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46423a) {
            case 0:
                this.d.N(this.f46424b, this.f46425c);
                return;
            default:
                int i10 = this.f46424b;
                int i11 = this.f46425c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
