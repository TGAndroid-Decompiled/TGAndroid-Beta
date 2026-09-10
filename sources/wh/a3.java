package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f44023a;
    public final boolean f44024b;
    public final h4 f44025c;

    public a3(h4 h4Var, boolean z10, int i10) {
        this.f44023a = i10;
        this.f44025c = h4Var;
        this.f44024b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44023a) {
            case 0:
                if (!this.f44024b) {
                    this.f44025c.f44145y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f44024b) {
                    this.f44025c.f44143w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
