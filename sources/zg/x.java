package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.o8;
import yh.p8;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f49501a;
    public final Object f49502b;
    public final Object f49503c;

    public x(int i10, Object obj, Object obj2) {
        this.f49501a = i10;
        this.f49502b = obj;
        this.f49503c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49501a) {
            case 0:
                c0 c0Var = (c0) this.f49502b;
                ArrayList arrayList = (ArrayList) this.f49503c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.f49308m.f32591k0.invalidate();
                return;
            default:
                p8 p8Var = (p8) this.f49502b;
                p8Var.getClass();
                ((o8) this.f49503c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.a1();
                return;
        }
    }
}
