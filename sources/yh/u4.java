package yh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class u4 extends View {
    public final TL_stars.StarGift f50615a;
    public final float f50616b;

    public u4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f50615a = starGift;
        this.f50616b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f50615a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f50616b), 1073741824), i11);
        }
    }
}
