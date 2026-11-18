package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.h60;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f59109a;
    public final Object f59110b;
    public final Object f59111c;

    public e(int i7, Object obj, Object obj2) {
        this.f59109a = i7;
        this.f59110b = obj;
        this.f59111c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59109a) {
            case 0:
                ((k) this.f59110b).P((f1) this.f59111c);
                return;
            default:
                h60 h60Var = (h60) this.f59110b;
                h60Var.getClass();
                ((Drawable) this.f59111c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.i1) h60Var.f35759c).f58698w2;
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
