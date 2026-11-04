package vg;

import android.content.Context;
import android.view.View;
public final class g1 extends View {
    public final int f56616a;

    public g1(Context context, int i3) {
        super(context);
        this.f56616a = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f56616a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
        }
    }
}
