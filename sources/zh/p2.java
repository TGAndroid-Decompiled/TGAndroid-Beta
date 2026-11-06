package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p2 extends AnimatorListenerAdapter {
    public final int f60384a;
    public final boolean f60385b;
    public final m3 f60386c;

    public p2(m3 m3Var, boolean z9, int i7) {
        this.f60384a = i7;
        this.f60386c = m3Var;
        this.f60385b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f60384a) {
            case 0:
                if (!this.f60385b) {
                    this.f60386c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f60385b) {
                    this.f60386c.f60348x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
