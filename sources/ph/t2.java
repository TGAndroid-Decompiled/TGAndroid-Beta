package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t2 extends AnimatorListenerAdapter {
    public final int f45324a;
    public final boolean f45325b;
    public final r3 f45326c;

    public t2(r3 r3Var, boolean z10, int i10) {
        this.f45324a = i10;
        this.f45326c = r3Var;
        this.f45325b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45324a) {
            case 0:
                if (!this.f45325b) {
                    this.f45326c.D.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f45325b) {
                    this.f45326c.f45311x.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
