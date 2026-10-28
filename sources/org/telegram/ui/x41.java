package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class x41 extends View {
    public final int f45474a;
    public final Integer f45475b;

    public x41(Context context, Integer num, int i10) {
        super(context);
        this.f45474a = i10;
        this.f45475b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f45474a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f45475b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f45475b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
