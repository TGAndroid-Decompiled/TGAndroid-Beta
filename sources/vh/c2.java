package vh;

import android.animation.ValueAnimator;
import org.telegram.ui.eo0;
public final class c2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51043a;
    public final eo0 f51044b;

    public c2(eo0 eo0Var, int i10) {
        this.f51043a = i10;
        this.f51044b = eo0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51043a) {
            case 0:
                ((k2) this.f51044b.f36881c).invalidate();
                return;
            default:
                ((k2) this.f51044b.f36881c).invalidate();
                return;
        }
    }
}
