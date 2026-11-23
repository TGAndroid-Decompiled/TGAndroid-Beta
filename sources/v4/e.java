package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.h10;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f59106a;
    public final Object f59107b;
    public final Object f59108c;

    public e(int i7, Object obj, Object obj2) {
        this.f59106a = i7;
        this.f59107b = obj;
        this.f59108c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59106a) {
            case 0:
                ((k) this.f59107b).P((e1) this.f59108c);
                return;
            default:
                h10 h10Var = (h10) this.f59107b;
                h10Var.getClass();
                ((Drawable) this.f59108c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.h1) h10Var.f35696c).f58702w2;
                if (view instanceof r1) {
                    ((r1) view).q2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
        }
    }
}
