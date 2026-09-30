package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.p8;
import yh.q8;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49561a;
    public final Object f49562b;
    public final Object f49563c;

    public w(int i10, Object obj, Object obj2) {
        this.f49561a = i10;
        this.f49562b = obj;
        this.f49563c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49561a) {
            case 0:
                b0 b0Var = (b0) this.f49562b;
                ArrayList arrayList = (ArrayList) this.f49563c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    b0.g((View) arrayList.get(i10), floatValue);
                }
                b0Var.f49362m.f32107k0.invalidate();
                return;
            default:
                q8 q8Var = (q8) this.f49562b;
                q8Var.getClass();
                ((p8) this.f49563c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
        }
    }
}
