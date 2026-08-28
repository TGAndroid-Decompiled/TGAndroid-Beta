package qh;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r1 extends HorizontalScrollView {
    public final int f46646a;

    public r1(Context context, int i9) {
        super(context);
        this.f46646a = i9;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f46646a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i9);
                int size = View.MeasureSpec.getSize(i9);
                if (mode == 1073741824) {
                    super.onMeasure(i9, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i10);
                int measuredWidth = getMeasuredWidth();
                if (mode == Integer.MIN_VALUE) {
                    measuredWidth = Math.min(measuredWidth, size);
                }
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
                return;
            default:
                int mode2 = View.MeasureSpec.getMode(i9);
                int size2 = View.MeasureSpec.getSize(i9);
                if (mode2 == 1073741824) {
                    super.onMeasure(i9, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i10);
                int measuredWidth2 = getMeasuredWidth();
                if (mode2 == Integer.MIN_VALUE) {
                    measuredWidth2 = Math.min(measuredWidth2, size2);
                }
                setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                return;
        }
    }
}
