package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ql0;
import zh.i8;
import zh.j8;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45199a;
    public final Object f45200b;
    public final Object f45201c;

    public i1(int i10, Object obj, Object obj2) {
        this.f45199a = i10;
        this.f45200b = obj;
        this.f45201c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45199a) {
            case 0:
                ql0 ql0Var = (ql0) this.f45200b;
                ql0Var.getClass();
                ((Drawable) this.f45201c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ql0Var.f28324c).A0;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                j8 j8Var = (j8) this.f45200b;
                j8Var.getClass();
                ((i8) this.f45201c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.f1();
                return;
        }
    }
}
