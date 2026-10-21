package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nl0;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46272a;
    public final Object f46273b;
    public final Object f46274c;

    public i1(int i10, Object obj, Object obj2) {
        this.f46272a = i10;
        this.f46273b = obj;
        this.f46274c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46272a) {
            case 0:
                nl0 nl0Var = (nl0) this.f46273b;
                nl0Var.getClass();
                ((Drawable) this.f46274c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) nl0Var.f28843c).A0;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46273b).P((s4.b1) this.f46274c);
                return;
        }
    }
}
