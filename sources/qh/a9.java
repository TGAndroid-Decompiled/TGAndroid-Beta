package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a9 extends AnimatorListenerAdapter {
    public final int f44928a;
    public final int f44929b;
    public final int f44930c;
    public final ca d;

    public a9(ca caVar, int i10, int i11, int i12) {
        this.f44928a = i12;
        this.d = caVar;
        this.f44929b = i10;
        this.f44930c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44928a) {
            case 0:
                this.d.N(this.f44929b, this.f44930c);
                return;
            default:
                int i10 = this.f44929b;
                int i11 = this.f44930c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}
