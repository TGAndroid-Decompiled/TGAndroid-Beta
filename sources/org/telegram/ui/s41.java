package org.telegram.ui;

import android.content.Context;
import android.view.View;

public final class s41 extends View {

    public final int f42405a;

    public final Integer f42406b;

    public s41(Context context, Integer num, int i10) {
        super(context);
        this.f42405a = i10;
        this.f42406b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f42405a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f42406b;
                if (num != null) {
                    setPivotX(num.intValue());
                }
                break;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f42406b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                }
                break;
        }
    }
}
