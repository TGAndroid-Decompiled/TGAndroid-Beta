package xh;

import android.content.Context;
import android.view.View;
public final class a0 extends View {
    public final float f46070a;

    public a0(Context context, float f7) {
        super(context);
        this.f46070a = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f46070a), 1073741824), i11);
    }
}
