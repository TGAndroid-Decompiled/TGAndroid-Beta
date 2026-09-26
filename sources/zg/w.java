package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.p8;
import yh.q8;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49452a;
    public final Object f49453b;
    public final Object f49454c;

    public w(int i10, Object obj, Object obj2) {
        this.f49452a = i10;
        this.f49453b = obj;
        this.f49454c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49452a) {
            case 0:
                b0 b0Var = (b0) this.f49453b;
                ArrayList arrayList = (ArrayList) this.f49454c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    b0.g((View) arrayList.get(i10), floatValue);
                }
                b0Var.f49253m.f32032k0.invalidate();
                return;
            default:
                q8 q8Var = (q8) this.f49453b;
                q8Var.getClass();
                ((p8) this.f49454c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
        }
    }
}
