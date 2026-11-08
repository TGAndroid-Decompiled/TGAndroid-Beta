package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f60477a;
    public final boolean f60478b;
    public final l3 f60479c;

    public n2(l3 l3Var, boolean z9, int i7) {
        this.f60477a = i7;
        this.f60479c = l3Var;
        this.f60478b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f60477a) {
            case 0:
                if (!this.f60478b) {
                    this.f60479c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f60478b) {
                    this.f60479c.f60455x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
