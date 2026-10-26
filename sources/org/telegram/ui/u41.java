package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class u41 extends View {
    public final int f44013a;
    public final Integer f44014b;

    public u41(Context context, Integer num, int i10) {
        super(context);
        this.f44013a = i10;
        this.f44014b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f44013a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f44014b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f44014b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
