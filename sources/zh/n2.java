package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n2 extends AnimatorListenerAdapter {
    public final int f60476a;
    public final boolean f60477b;
    public final l3 f60478c;

    public n2(l3 l3Var, boolean z9, int i7) {
        this.f60476a = i7;
        this.f60478c = l3Var;
        this.f60477b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f60476a) {
            case 0:
                if (!this.f60477b) {
                    this.f60478c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f60477b) {
                    this.f60478c.f60454x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
