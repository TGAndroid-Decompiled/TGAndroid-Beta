package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.q8;
import yh.r8;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f53540a;
    public final Object f53541b;
    public final Object f53542c;

    public w(int i10, Object obj, Object obj2) {
        this.f53540a = i10;
        this.f53541b = obj;
        this.f53542c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53540a) {
            case 0:
                b0 b0Var = (b0) this.f53541b;
                ArrayList arrayList = (ArrayList) this.f53542c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    b0.g((View) arrayList.get(i10), floatValue);
                }
                b0Var.f53327m.f35321k0.invalidate();
                return;
            default:
                r8 r8Var = (r8) this.f53541b;
                r8Var.getClass();
                ((q8) this.f53542c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.a1();
                return;
        }
    }
}
