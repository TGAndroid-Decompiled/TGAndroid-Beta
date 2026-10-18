package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46265a;
    public final Object f46266b;
    public final Object f46267c;

    public i1(int i10, Object obj, Object obj2) {
        this.f46265a = i10;
        this.f46266b = obj;
        this.f46267c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46265a) {
            case 0:
                ml0 ml0Var = (ml0) this.f46266b;
                ml0Var.getClass();
                ((Drawable) this.f46267c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ml0Var.f28549c).A0;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46266b).P((s4.b1) this.f46267c);
                return;
        }
    }
}
