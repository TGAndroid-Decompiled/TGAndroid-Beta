package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class zz0 extends View {
    public final int f52767a;
    public final Integer f52768b;

    public zz0(Context context, Integer num, int i3) {
        super(context);
        this.f52767a = i3;
        this.f52768b = num;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f52767a) {
            case 0:
                super.onMeasure(i3, i10);
                Integer num = this.f52768b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i3, i10);
                Integer num2 = this.f52768b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
