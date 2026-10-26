package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f52909a;
    public final boolean f52910b;
    public final h4 f52911c;

    public b3(h4 h4Var, boolean z10, int i10) {
        this.f52909a = i10;
        this.f52911c = h4Var;
        this.f52910b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52909a) {
            case 0:
                if (!this.f52910b) {
                    this.f52911c.f53036y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f52910b) {
                    this.f52911c.f53034w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
