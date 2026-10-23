package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t41 extends View {
    public final int f41868a;
    public final Integer f41869b;

    public t41(Context context, Integer num, int i10) {
        super(context);
        this.f41868a = i10;
        this.f41869b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f41868a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f41869b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f41869b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
