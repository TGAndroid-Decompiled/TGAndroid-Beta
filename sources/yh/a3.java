package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f50193a;
    public final boolean f50194b;
    public final h4 f50195c;

    public a3(h4 h4Var, boolean z10, int i10) {
        this.f50193a = i10;
        this.f50195c = h4Var;
        this.f50194b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50193a) {
            case 0:
                if (!this.f50194b) {
                    this.f50195c.f50316y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50194b) {
                    this.f50195c.f50314w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
