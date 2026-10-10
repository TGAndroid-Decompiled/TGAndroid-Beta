package xh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class w4 extends View {
    public final TL_stars.StarGift f51625a;
    public final float f51626b;

    public w4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f51625a = starGift;
        this.f51626b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f51625a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f51626b), 1073741824), i11);
        }
    }
}
