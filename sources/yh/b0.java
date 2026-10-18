package yh;

import android.content.Context;
import android.view.View;
public final class b0 extends View {
    public final float f50227a;

    public b0(Context context, float f7) {
        super(context);
        this.f50227a = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f50227a), 1073741824), i11);
    }
}
