package xh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class w4 extends View {
    public final TL_stars.StarGift f46519a;
    public final float f46520b;

    public w4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f46519a = starGift;
        this.f46520b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f46519a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f46520b), 1073741824), i11);
        }
    }
}
