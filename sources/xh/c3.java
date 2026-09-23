package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f45775a;
    public final boolean f45776b;
    public final i4 f45777c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f45775a = i10;
        this.f45777c = i4Var;
        this.f45776b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45775a) {
            case 0:
                if (!this.f45776b) {
                    this.f45777c.f45862y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45776b) {
                    this.f45777c.f45860w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
