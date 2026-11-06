package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f60408a;
    public final boolean f60409b;
    public final m3 f60410c;

    public p2(m3 m3Var, boolean z9, int i7) {
        this.f60408a = i7;
        this.f60410c = m3Var;
        this.f60409b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f60408a) {
            case 0:
                if (!this.f60409b) {
                    this.f60410c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f60409b) {
                    this.f60410c.f60372x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
