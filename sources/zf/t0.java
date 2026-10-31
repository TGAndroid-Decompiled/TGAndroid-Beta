package zf;

import android.content.Context;
import android.view.View;
public final class t0 extends View {
    public final int f55628a;

    public t0(Context context, int i10) {
        super(context);
        this.f55628a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f55628a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(8.0f), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
                return;
        }
    }
}
