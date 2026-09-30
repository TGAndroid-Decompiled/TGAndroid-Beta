package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46211a;
    public final boolean f46212b;
    public final i4 f46213c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46211a = i10;
        this.f46213c = i4Var;
        this.f46212b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46211a) {
            case 0:
                if (!this.f46212b) {
                    this.f46213c.f46298y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46212b) {
                    this.f46213c.f46296w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
