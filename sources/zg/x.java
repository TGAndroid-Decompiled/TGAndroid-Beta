package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.q8;
import yh.r8;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f49178a;
    public final Object f49179b;
    public final Object f49180c;

    public x(int i10, Object obj, Object obj2) {
        this.f49178a = i10;
        this.f49179b = obj;
        this.f49180c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49178a) {
            case 0:
                c0 c0Var = (c0) this.f49179b;
                ArrayList arrayList = (ArrayList) this.f49180c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.f48985m.f34138k0.invalidate();
                return;
            default:
                r8 r8Var = (r8) this.f49179b;
                r8Var.getClass();
                ((q8) this.f49180c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.a1();
                return;
        }
    }
}
