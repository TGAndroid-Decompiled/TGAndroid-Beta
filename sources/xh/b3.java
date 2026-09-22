package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f45805a;
    public final boolean f45806b;
    public final h4 f45807c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f45805a = i10;
        this.f45807c = h4Var;
        this.f45806b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45805a) {
            case 0:
                if (!this.f45806b) {
                    this.f45807c.f45899y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45806b) {
                    this.f45807c.f45897w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
