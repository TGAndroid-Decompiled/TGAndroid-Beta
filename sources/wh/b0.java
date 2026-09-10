package wh;

import android.content.Context;
import android.view.View;
public final class b0 extends View {
    public final float f44032a;

    public b0(Context context, float f7) {
        super(context);
        this.f44032a = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f44032a), 1073741824), i11);
    }
}
