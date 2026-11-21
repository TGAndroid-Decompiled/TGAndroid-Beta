package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.h10;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f59148a;
    public final Object f59149b;
    public final Object f59150c;

    public e(int i7, Object obj, Object obj2) {
        this.f59148a = i7;
        this.f59149b = obj;
        this.f59150c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59148a) {
            case 0:
                ((k) this.f59149b).P((f1) this.f59150c);
                return;
            default:
                h10 h10Var = (h10) this.f59149b;
                h10Var.getClass();
                ((Drawable) this.f59150c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.h1) h10Var.f35724c).f58733w2;
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
