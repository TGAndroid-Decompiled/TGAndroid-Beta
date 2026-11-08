package zh;

import android.content.Context;
import android.view.View;
public final class z extends View {
    public final float f60618a;

    public z(Context context, float f10) {
        super(context);
        this.f60618a = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f60618a), 1073741824), i10);
    }
}
