package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class z51 extends View {
    public final int f40052a;
    public final Integer f40053b;

    public z51(Context context, Integer num, int i10) {
        super(context);
        this.f40052a = i10;
        this.f40053b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f40052a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f40053b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f40053b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
