package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.v50;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f57070a;
    public final Object f57071b;
    public final Object f57072c;

    public e(int i7, Object obj, Object obj2) {
        this.f57070a = i7;
        this.f57071b = obj;
        this.f57072c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57070a) {
            case 0:
                ((k) this.f57071b).P((d1) this.f57072c);
                return;
            default:
                v50 v50Var = (v50) this.f57071b;
                v50Var.getClass();
                ((Drawable) this.f57072c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.f1) v50Var.f38863c).f56594v2;
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
