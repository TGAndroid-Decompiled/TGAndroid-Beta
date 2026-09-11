package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f50203a;
    public final boolean f50204b;
    public final g4 f50205c;

    public a3(g4 g4Var, boolean z10, int i10) {
        this.f50203a = i10;
        this.f50205c = g4Var;
        this.f50204b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50203a) {
            case 0:
                if (!this.f50204b) {
                    this.f50205c.f50302y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50204b) {
                    this.f50205c.f50300w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
