package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.f10;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f59241a;
    public final Object f59242b;
    public final Object f59243c;

    public f(int i7, Object obj, Object obj2) {
        this.f59241a = i7;
        this.f59242b = obj;
        this.f59243c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59241a) {
            case 0:
                ((l) this.f59242b).P((f1) this.f59243c);
                return;
            default:
                f10 f10Var = (f10) this.f59242b;
                f10Var.getClass();
                ((Drawable) this.f59243c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.h1) f10Var.f34944c).f58817w2;
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
