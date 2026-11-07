package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f60414a;
    public final boolean f60415b;
    public final m3 f60416c;

    public p2(m3 m3Var, boolean z9, int i7) {
        this.f60414a = i7;
        this.f60416c = m3Var;
        this.f60415b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f60414a) {
            case 0:
                if (!this.f60415b) {
                    this.f60416c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f60415b) {
                    this.f60416c.f60378x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
