package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f52967a;
    public final boolean f52968b;
    public final h4 f52969c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f52967a = i10;
        this.f52969c = h4Var;
        this.f52968b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52967a) {
            case 0:
                if (!this.f52968b) {
                    this.f52969c.f53094y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f52968b) {
                    this.f52969c.f53092w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
