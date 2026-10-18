package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46286a;
    public final Object f46287b;
    public final Object f46288c;

    public h1(int i10, Object obj, Object obj2) {
        this.f46286a = i10;
        this.f46287b = obj;
        this.f46288c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46286a) {
            case 0:
                ml0 ml0Var = (ml0) this.f46287b;
                ml0Var.getClass();
                ((Drawable) this.f46288c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((l1) ml0Var.f28556c).A0;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ((s4.k) this.f46287b).P((s4.b1) this.f46288c);
                return;
        }
    }
}
