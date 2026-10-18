package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f50218a;
    public final boolean f50219b;
    public final h4 f50220c;

    public a3(h4 h4Var, boolean z10, int i10) {
        this.f50218a = i10;
        this.f50220c = h4Var;
        this.f50219b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50218a) {
            case 0:
                if (!this.f50219b) {
                    this.f50220c.f50341y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f50219b) {
                    this.f50220c.f50339w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
