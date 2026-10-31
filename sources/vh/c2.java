package vh;

import android.animation.ValueAnimator;
import org.telegram.ui.go0;
public final class c2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51025a;
    public final go0 f51026b;

    public c2(go0 go0Var, int i10) {
        this.f51025a = i10;
        this.f51026b = go0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51025a) {
            case 0:
                ((k2) this.f51026b.f37607c).invalidate();
                return;
            default:
                ((k2) this.f51026b.f37607c).invalidate();
                return;
        }
    }
}
