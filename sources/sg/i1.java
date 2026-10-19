package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46267a;
    public final Object f46268b;
    public final Object f46269c;

    public i1(int i10, Object obj, Object obj2) {
        this.f46267a = i10;
        this.f46268b = obj;
        this.f46269c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46267a) {
            case 0:
                ml0 ml0Var = (ml0) this.f46268b;
                ml0Var.getClass();
                ((Drawable) this.f46269c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ml0Var.f28562c).A0;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46268b).P((s4.b1) this.f46269c);
                return;
        }
    }
}
