package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.h10;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f59152a;
    public final Object f59153b;
    public final Object f59154c;

    public e(int i7, Object obj, Object obj2) {
        this.f59152a = i7;
        this.f59153b = obj;
        this.f59154c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59152a) {
            case 0:
                ((k) this.f59153b).P((f1) this.f59154c);
                return;
            default:
                h10 h10Var = (h10) this.f59153b;
                h10Var.getClass();
                ((Drawable) this.f59154c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.h1) h10Var.f35743c).f58737w2;
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
