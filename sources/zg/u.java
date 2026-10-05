package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.s8;
import yh.t8;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f53530a;
    public final Object f53531b;
    public final Object f53532c;

    public u(int i10, Object obj, Object obj2) {
        this.f53530a = i10;
        this.f53531b = obj;
        this.f53532c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53530a) {
            case 0:
                z zVar = (z) this.f53531b;
                ArrayList arrayList = (ArrayList) this.f53532c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z.g((View) arrayList.get(i10), floatValue);
                }
                zVar.f53560m.f34745k0.invalidate();
                return;
            default:
                t8 t8Var = (t8) this.f53531b;
                t8Var.getClass();
                ((s8) this.f53532c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.a1();
                return;
        }
    }
}
