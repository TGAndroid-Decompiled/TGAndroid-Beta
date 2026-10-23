package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ql0;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46702a;
    public final Object f46703b;
    public final Object f46704c;

    public i1(int i10, Object obj, Object obj2) {
        this.f46702a = i10;
        this.f46703b = obj;
        this.f46704c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46702a) {
            case 0:
                ql0 ql0Var = (ql0) this.f46703b;
                ql0Var.getClass();
                ((Drawable) this.f46704c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ql0Var.f29941c).A0;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).Z2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46703b).P((s4.b1) this.f46704c);
                return;
        }
    }
}
