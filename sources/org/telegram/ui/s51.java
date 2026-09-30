package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class s51 extends View {
    public final int f37693a;
    public final Integer f37694b;

    public s51(Context context, Integer num, int i10) {
        super(context);
        this.f37693a = i10;
        this.f37694b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f37693a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f37694b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f37694b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
