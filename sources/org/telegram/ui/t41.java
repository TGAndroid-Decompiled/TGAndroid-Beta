package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t41 extends View {
    public final int f42852a;
    public final Integer f42853b;

    public t41(Context context, Integer num, int i9) {
        super(context);
        this.f42852a = i9;
        this.f42853b = num;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f42852a) {
            case 0:
                super.onMeasure(i9, i10);
                Integer num = this.f42853b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i9, i10);
                Integer num2 = this.f42853b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
