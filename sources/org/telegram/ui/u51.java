package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class u51 extends View {
    public final int f41070a;
    public final Integer f41071b;

    public u51(Context context, Integer num, int i10) {
        super(context);
        this.f41070a = i10;
        this.f41071b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f41070a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f41071b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f41071b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
