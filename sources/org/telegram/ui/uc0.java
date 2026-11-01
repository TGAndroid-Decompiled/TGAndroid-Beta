package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
public final class uc0 extends ViewSwitcher {
    public final int f41908a;

    public uc0(Context context, int i10) {
        super(context);
        this.f41908a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f41908a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
