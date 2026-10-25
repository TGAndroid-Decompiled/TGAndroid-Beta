package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f52906a;
    public final boolean f52907b;
    public final h4 f52908c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f52906a = i10;
        this.f52908c = h4Var;
        this.f52907b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52906a) {
            case 0:
                if (!this.f52907b) {
                    this.f52908c.f53033y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f52907b) {
                    this.f52908c.f53031w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
