package vh;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class s1 extends HorizontalScrollView {
    public final int f46202a;

    public s1(Context context, int i10) {
        super(context);
        this.f46202a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f46202a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i11);
                int measuredWidth = getMeasuredWidth();
                if (mode == Integer.MIN_VALUE) {
                    measuredWidth = Math.min(measuredWidth, size);
                }
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
                return;
            default:
                int mode2 = View.MeasureSpec.getMode(i10);
                int size2 = View.MeasureSpec.getSize(i10);
                if (mode2 == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i11);
                int measuredWidth2 = getMeasuredWidth();
                if (mode2 == Integer.MIN_VALUE) {
                    measuredWidth2 = Math.min(measuredWidth2, size2);
                }
                setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                return;
        }
    }
}
