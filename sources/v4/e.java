package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.v50;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f56969a;
    public final Object f56970b;
    public final Object f56971c;

    public e(int i7, Object obj, Object obj2) {
        this.f56969a = i7;
        this.f56970b = obj;
        this.f56971c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56969a) {
            case 0:
                ((k) this.f56970b).P((d1) this.f56971c);
                return;
            default:
                v50 v50Var = (v50) this.f56970b;
                v50Var.getClass();
                ((Drawable) this.f56971c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.f1) v50Var.f38860c).f56487s2;
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
