package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nl0;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46275a;
    public final Object f46276b;
    public final Object f46277c;

    public i1(int i10, Object obj, Object obj2) {
        this.f46275a = i10;
        this.f46276b = obj;
        this.f46277c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46275a) {
            case 0:
                nl0 nl0Var = (nl0) this.f46276b;
                nl0Var.getClass();
                ((Drawable) this.f46277c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) nl0Var.f28846c).A0;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46276b).P((s4.b1) this.f46277c);
                return;
        }
    }
}
