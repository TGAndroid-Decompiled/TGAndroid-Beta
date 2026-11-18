package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.h60;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f59110a;
    public final Object f59111b;
    public final Object f59112c;

    public e(int i7, Object obj, Object obj2) {
        this.f59110a = i7;
        this.f59111b = obj;
        this.f59112c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59110a) {
            case 0:
                ((k) this.f59111b).P((f1) this.f59112c);
                return;
            default:
                h60 h60Var = (h60) this.f59111b;
                h60Var.getClass();
                ((Drawable) this.f59112c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.i1) h60Var.f35759c).f58699w2;
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
