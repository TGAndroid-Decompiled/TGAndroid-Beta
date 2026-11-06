package zh;

import android.content.Context;
import android.view.View;
public final class a0 extends View {
    public final float f60102a;

    public a0(Context context, float f10) {
        super(context);
        this.f60102a = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f60102a), 1073741824), i10);
    }
}
