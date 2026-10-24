package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.pl0;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46701a;
    public final Object f46702b;
    public final Object f46703c;

    public i1(int i10, Object obj, Object obj2) {
        this.f46701a = i10;
        this.f46702b = obj;
        this.f46703c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46701a) {
            case 0:
                pl0 pl0Var = (pl0) this.f46702b;
                pl0Var.getClass();
                ((Drawable) this.f46703c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) pl0Var.f29621c).A0;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).Z2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46702b).P((s4.b1) this.f46703c);
                return;
        }
    }
}
