package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.p8;
import yh.q8;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f49503a;
    public final Object f49504b;
    public final Object f49505c;

    public x(int i10, Object obj, Object obj2) {
        this.f49503a = i10;
        this.f49504b = obj;
        this.f49505c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49503a) {
            case 0:
                c0 c0Var = (c0) this.f49504b;
                ArrayList arrayList = (ArrayList) this.f49505c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.f49312m.f34823k0.invalidate();
                return;
            default:
                q8 q8Var = (q8) this.f49504b;
                q8Var.getClass();
                ((p8) this.f49505c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
        }
    }
}
