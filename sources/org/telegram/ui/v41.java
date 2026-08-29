package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v41 extends View {
    public final int f43424a;
    public final Integer f43425b;

    public v41(Context context, Integer num, int i10) {
        super(context);
        this.f43424a = i10;
        this.f43425b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f43424a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f43425b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f43425b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
