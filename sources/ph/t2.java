package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t2 extends AnimatorListenerAdapter {
    public final int f45313a;
    public final boolean f45314b;
    public final r3 f45315c;

    public t2(r3 r3Var, boolean z10, int i10) {
        this.f45313a = i10;
        this.f45315c = r3Var;
        this.f45314b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45313a) {
            case 0:
                if (!this.f45314b) {
                    this.f45315c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45314b) {
                    this.f45315c.f45300x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
