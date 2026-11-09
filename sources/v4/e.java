package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.w50;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f57074a;
    public final Object f57075b;
    public final Object f57076c;

    public e(int i7, Object obj, Object obj2) {
        this.f57074a = i7;
        this.f57075b = obj;
        this.f57076c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57074a) {
            case 0:
                ((k) this.f57075b).P((d1) this.f57076c);
                return;
            default:
                w50 w50Var = (w50) this.f57075b;
                w50Var.getClass();
                ((Drawable) this.f57076c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.f1) w50Var.f39919c).f56592s2;
                if (view instanceof q1) {
                    ((q1) view).p2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
        }
    }
}
