package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r51 extends View {
    public final int f36697a;
    public final Integer f36698b;

    public r51(Context context, Integer num, int i10) {
        super(context);
        this.f36697a = i10;
        this.f36698b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f36697a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f36698b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f36698b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
