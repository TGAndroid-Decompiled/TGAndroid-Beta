package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f60409a;
    public final boolean f60410b;
    public final m3 f60411c;

    public p2(m3 m3Var, boolean z9, int i7) {
        this.f60409a = i7;
        this.f60411c = m3Var;
        this.f60410b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f60409a) {
            case 0:
                if (!this.f60410b) {
                    this.f60411c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f60410b) {
                    this.f60411c.f60373x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
