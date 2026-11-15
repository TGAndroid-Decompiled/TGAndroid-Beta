package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.y50;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f58531a;
    public final Object f58532b;
    public final Object f58533c;

    public e(int i7, Object obj, Object obj2) {
        this.f58531a = i7;
        this.f58532b = obj;
        this.f58533c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58531a) {
            case 0:
                ((k) this.f58532b).P((e1) this.f58533c);
                return;
            default:
                y50 y50Var = (y50) this.f58532b;
                y50Var.getClass();
                ((Drawable) this.f58533c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.g1) y50Var.f41885c).f58108w2;
                if (view instanceof q1) {
                    ((q1) view).q2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
        }
    }
}
